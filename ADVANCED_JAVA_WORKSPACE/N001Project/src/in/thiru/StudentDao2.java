package in.thiru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao2 {

	static String URL = "jdbc:mysql://localhost:3306/studentdb2";
	static String USER_NAME = "root";
	static String PAZZWORD = "123456";
	static String INSERT_QUERY = "INSERT INTO STUDENT VALUES(?,?,?)";
	static String UPDATE_QUERY = "UPDATE student\r\n" + "SET student_name = 'Pavan Kalyan'\r\n" + "WHERE id = 22;";
	static String SELECT_QUERY = "SELECT * FROM STUDENT";
	static String DELETE_QUERY = "DELETE FROM student WHERE  id = 99";

//	

	public static void main(String[] args) {

//		insertStudent();

		selectStudent();

//		updateStudent();

//		deleteStudent();

	}

	private static void selectStudent() {
		// select query

		// Step-1:Load the driver / Register the driver[Option]

		try {
			// Step-2:Get the connection
			Connection conn = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
			System.out.println("Connection Established...");

			// Step-3:CreateStatement/PrepareStatement/CallableStatement
			PreparedStatement prepareStatement = conn.prepareStatement(SELECT_QUERY);
			// Step-4:Execute the query

			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				int student_id = resultSet.getInt("id");
				String student_name = resultSet.getString("student_name");
				int student_marks = resultSet.getInt("student_marks");

				System.out.println(student_id + " : " + student_name.toUpperCase() + " : " + student_marks);
			}

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step-5:Process the result
		// Step-6:Close the connection
	}

	private static void insertStudent() {
		// Step-1:Load the driver / Register the driver[Option]

		try {
			// Step-2:Get the connection
			Connection conn = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
			System.out.println("Connection Established...");

			// Step-3:CreateStatement/PrepareStatement/CallableStatement
			Statement stmt = conn.createStatement();
			// Step-4:Execute the query

			int count = stmt.executeUpdate(INSERT_QUERY);
			System.out.println("Student Records count is : " + count);

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step-5:Process the result
		// Step-6:Close the connection
	}

	private static void updateStudent() {
		// Step-1:Load the driver / Register the driver[Option]

		try {
			// Step-2:Get the connection
			Connection conn = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
			System.out.println("Connection Established...");

			// Step-3:CreateStatement/PrepareStatement/CallableStatement
			Statement stmt = conn.createStatement();
			// Step-4:Execute the query

			int count = stmt.executeUpdate(UPDATE_QUERY);
			System.out.println("Student Records updated & count is : " + count);

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step-5:Process the result
		// Step-6:Close the connection
	}

	private static void deleteStudent() {
		// Step-1:Load the driver / Register the driver[Option]

		try {
			// Step-2:Get the connection
			Connection conn = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
			System.out.println("Connection Established...");

			// Step-3:CreateStatement/PrepareStatement/CallableStatement
			Statement stmt = conn.createStatement();
			// Step-4:Execute the query

			int count = stmt.executeUpdate(DELETE_QUERY);
			System.out.println("Student Records DELETED & count is : " + count);

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step-5:Process the result
		// Step-6:Close the connection
	}

}
