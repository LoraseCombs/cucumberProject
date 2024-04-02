package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;
	
	public String getDataFromDatabase(String columnName) {
//		set properties for sql
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			"jdbc:mysql:// + hostName: + portNumber/ + databaseName"
			String sqlUrl = "jdbc:mysql://44.195.13.80:3306/august_2023";
			String sqlUsername = "student";
			String sqlPassword = "Student@123";
			String sqlQuery = "SELECT * FROM login_data ld;";
			
//			create connection to the DB
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
//			empower connection reference variable to execute queries
			statement = connection.createStatement();
//			execute queries
			resultSet = statement.executeQuery(sqlQuery);
			
			while(resultSet.next()) {
			columnValue = resultSet.getString(columnName);
			}

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return columnValue;
			
	}

}
