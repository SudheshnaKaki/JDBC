package com.capgemini.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
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
	public static void closeConnection(Connection connection) throws SQLException {
		connection.close();
	}

}
