package in.thiru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeHikeDao {

	static String URL = "jdbc:mysql://localhost:3306/studentdb2";
	static String USER_NAME = "root";
	static String PAZZWORD = "123456";

	static String SELECT_QUERY = "SELECT * FROM employee";
	static String UPDATE_HIKE_QUERY = "update employee set emp_salary=? where emp_id=?";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current year hike(%) : ");
		int emp_hike = sc.nextInt();

		try {
			Connection connection = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
			Statement cstmt = connection.createStatement();
			PreparedStatement pstmt = connection.prepareStatement(UPDATE_HIKE_QUERY);

			ResultSet result = cstmt.executeQuery(SELECT_QUERY);

			while (result.next()) {

				int emp_id = result.getInt(1);
				String emp_name = result.getString(2);
				int emp_salary = result.getInt(3);
				System.out.println(emp_salary);
				int new_sal = emp_salary + (emp_salary * emp_hike / 100);

				System.out.println(emp_id + " : " + emp_name + " : " + new_sal);

				pstmt.setInt(1, new_sal);
				pstmt.setInt(2, emp_id);
				

				pstmt.executeUpdate();

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
