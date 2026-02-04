package in.thiru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao3 {

	static String URL = "jdbc:mysql://localhost:3306/studentdb2";
	static String USER_NAME = "root";
	static String PAZZWORD = "123456";
	static String SELECT_QUERY = "select * from users where username = ? and password = ? ";
	

//	

	public static void main(String[] args) {
		
		
		try {
			Connection connection = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
			PreparedStatement prepareStatement = connection.prepareStatement(SELECT_QUERY);
			prepareStatement.setString(1, "thiru");
			prepareStatement.setString(2, "'' OR '1'='1'");
			
			ResultSet executeQuery = prepareStatement.executeQuery();
			
			if(executeQuery.next())
			{
				System.out.println("Login successfull");
			}
			else
			{
				System.out.println("Loging failed");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
