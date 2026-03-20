package in.thiru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {

	
	static String INSERT_QUERY = "INSERT INTO STUDENT VALUES(103,'Vijay',97)";
	static String UPDATE_QUERY = "UPDATE student\r\n"
			+ "SET student_name = 'Pavan Kalyan'\r\n"
			+ "WHERE id = 22;";
	static String SELECT_QUERY = "SELECT * FROM STUDENT";
	static String DELETE_QUERY = "DELETE FROM student WHERE  id = 99";
	
	
	
//	

	public static void main(String[] args) throws Exception {

//		insertStudent();

//		selectStudent();
		
		updateStudent();
		
//		deleteStudent();
		
	}

	private static void selectStudent() throws Exception {
		// select query

		// Step-1:Load the driver / Register the driver[Option]

		try {
			// Step-2:Get the connection
			Connection dbConnection = ConnectionFactory.getDBConnection();
			System.out.println("Connection Established...");

			// Step-3:CreateStatement/PrepareStatement/CallableStatement
			Statement stmt = dbConnection.createStatement();
			// Step-4:Execute the query

			ResultSet resultSet = stmt.executeQuery(SELECT_QUERY);

			while (resultSet.next()) {
				int student_id = resultSet.getInt("id");
				String student_name = resultSet.getString("student_name");
				int student_marks = resultSet.getInt("student_marks");

				System.out.println(student_id+" : "+student_name.toUpperCase()+" : "+student_marks);
			}

			dbConnection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step-5:Process the result
		// Step-6:Close the connection
	}

	private static void insertStudent() throws Exception {
		// Step-1:Load the driver / Register the driver[Option]

		try {
			// Step-2:Get the connection
			System.out.println("Connection Established...");

			// Step-3:CreateStatement/PrepareStatement/CallableStatement
			Connection dbConnection = ConnectionFactory.getDBConnection();
			Statement stmt = dbConnection.createStatement();
			// Step-4:Execute the query

			int count = stmt.executeUpdate(INSERT_QUERY);
			System.out.println("Student Records count is : " + count);

			dbConnection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step-5:Process the result
		// Step-6:Close the connection
	}
	
	
	private static void updateStudent() throws Exception {
		// Step-1:Load the driver / Register the driver[Option]

		try {
			// Step-2:Get the connection
			Connection dbConnection = ConnectionFactory.getDBConnection();
			System.out.println("Connection Established...");

			// Step-3:CreateStatement/PrepareStatement/CallableStatement
			Statement stmt = dbConnection.createStatement();
			// Step-4:Execute the query

			int count = stmt.executeUpdate(UPDATE_QUERY);
			System.out.println("Student Records updated & count is : " + count);

			dbConnection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step-5:Process the result
		// Step-6:Close the connection
	}
	
	
	private static void deleteStudent() throws Exception {
		// Step-1:Load the driver / Register the driver[Option]

		try {
			// Step-2:Get the connection
			System.out.println("Connection Established...");

			// Step-3:CreateStatement/PrepareStatement/CallableStatement
			Connection dbConnection = ConnectionFactory.getDBConnection();
			// Step-4:Execute the query
			Statement createStatement = dbConnection.createStatement();
			int count = createStatement.executeUpdate(DELETE_QUERY);
			System.out.println("Student Records DELETED & count is : " + count);

			dbConnection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step-5:Process the result
		// Step-6:Close the connection
	}
	
	
	

}
