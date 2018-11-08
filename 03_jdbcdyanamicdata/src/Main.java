

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static Connection createConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String dbURL = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String passWord = "pass";
		Connection connection = DriverManager.getConnection(dbURL, userName,
				passWord);
		return connection;
	}

	public static void insertRecord() throws ClassNotFoundException,
			SQLException {
		Connection connection = createConnection();
		System.out.println("Connected Successfully");
		String SQL = "insert into Customer values(5,'lahari Traders','Mumbai',6004.0)";
		Statement statement = connection.createStatement();
		int r = statement.executeUpdate(SQL);
		System.out.println(r + "rows inserted");
		statement.close();
		connection.close();
	}

	public static void updateRecord() throws ClassNotFoundException,
			SQLException {
		Connection connection = createConnection();
		System.out.println("Connected Successfully");
		String SQL = "update Customer set c_amt = c_amt+2000 where c_id = 1";
		Statement statement = connection.createStatement();
		int r = statement.executeUpdate(SQL);
		System.out.println(r + "row updated");
		statement.close();
		connection.close();
	}

	public static void deleteRecord() throws ClassNotFoundException,
			SQLException {
		Connection connection = createConnection();
		System.out.println("Connected Successfully");
		String SQL = "delete from Customer where c_id = 5";
		Statement statement = connection.createStatement();
		int r = statement.executeUpdate(SQL);
		System.out.println(r + "row deleted");
		statement.close();
		connection.close();
	}

	public static void displayAllRecords() throws ClassNotFoundException,
			SQLException {
		Connection connection = createConnection();

		String SQL = "select * from Customer";
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(SQL);
		while (rs.next()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.println(rs.getDouble(4));
		}
		rs.close();
		statement.close();
		connection.close();
	}

	public static void displayOneRecords(int id)
			throws ClassNotFoundException, SQLException {
		Connection connection = createConnection();

		String SQL = "select * from Customer where c_id ="+id;
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(SQL);
		if (rs.next()) {
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.println(rs.getDouble(4));
		}
		rs.close();
		statement.close();
		connection.close();
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		// updateRecord();
		// deleteRecord();
		displayOneRecords(2);
	}

}
