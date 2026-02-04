package in.thiru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPoolingExample {
	
	static String URL = "jdbc:mysql://localhost:3306/studentdb2";
	static String USER_NAME = "root";
	static String PAZZWORD = "123456";
	
	public static void main(String[] args) throws SQLException {
		
		long startTime = System.currentTimeMillis();
		Connection connection1 = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
		Connection connection2 = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
		Connection connection3 = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
		Connection connection4 = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
		Connection connection5 = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
		Connection connection6 = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
		Connection connection7 = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
		Connection connection8 = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime-startTime);
	}

}
