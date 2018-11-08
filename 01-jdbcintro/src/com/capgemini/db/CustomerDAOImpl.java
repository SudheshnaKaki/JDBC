package com.capgemini.db;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.business.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionManager.createConnection();
		String SQL = "insert into Customer values(?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(SQL);
		statement.setInt(1, customer.getId());
		statement.setString(2, customer.getName());
		statement.setString(3, customer.getCity());
		statement.setDouble(4, customer.getOutStandingAmount());
		int r = statement.executeUpdate();
		if(r>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean removeCustomer(int customerID) throws ClassNotFoundException, SQLException {
		
		boolean isValid = false;
		Connection connection = ConnectionManager.createConnection();
		
		String SQL = "delete from Customer where c_id = ?";
		PreparedStatement statement = connection.prepareStatement(SQL);
		System.out.println("Connected Successfully");
		statement.setInt(1, customerID);
		int r = statement.executeUpdate();
		if(r > 0) {
			isValid = true;
			System.out.println(r+"Rows Deleted");
		}
		return isValid;
	}

	@Override
	public boolean updateCustomer(Customer customer) throws SQLException, ClassNotFoundException {
		Connection connection = ConnectionManager.createConnection();
		String SQL = "update Customer set c_name=?,c_city=?,c_amt=? where c_id = ?";
		PreparedStatement statement = connection.prepareStatement(SQL);
		statement.setInt(4, customer.getId());
		statement.setString(1, customer.getName());
		statement.setString(2, customer.getCity());
		statement.setDouble(3, customer.getOutStandingAmount());
		int r = statement.executeUpdate();
		if(r>0) {
			return true;
		}
		return false;
		
	}

	@Override
	public Customer findCustomer(int customerID) {
		
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionManager.createConnection();
		System.out.println("Connected Successfully");
		String SQL = "select * from Customer";
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(SQL);
		List<Customer> customers = new ArrayList<Customer>();
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String city = rs.getString(3);
			double amt = rs.getDouble(4);
			Customer customer1 = new Customer();
			customer1.setId(id);
			customer1.setName(name);
			customer1.setCity(city);
			customer1.setOutStandingAmount(amt);
			customer1.add(customers);
			
			
		}
		statement.close();
		rs.close();
		
		ConnectionManager.closeConnection(connection);
		return customers;
	}
	

}
