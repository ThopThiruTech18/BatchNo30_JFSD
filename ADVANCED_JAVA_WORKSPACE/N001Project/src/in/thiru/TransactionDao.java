package in.thiru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDao {

	static String URL = "jdbc:mysql://localhost:3306/studentdb2";
	static String USER_NAME = "root";
	static String PAZZWORD = "123456";

	static String INSERT_EMP_QUERY = "insert into emp value(?,?,?)";
	static String INSERT_EMP_ADD_QUERY = "insert into emp_address value(?,?)";

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
		
		connection.setAutoCommit(false);
		PreparedStatement pstmnt = connection.prepareStatement(INSERT_EMP_QUERY);
		pstmnt.setInt(1, 101);
		pstmnt.setString(2, "hari");
		pstmnt.setInt(3, 10000);

		int count = pstmnt.executeUpdate();
		
		
//		String s=null;
//		s.length();

		System.out.println("Rows are effected :" + count);

		PreparedStatement pstmnt1 = connection.prepareStatement(INSERT_EMP_ADD_QUERY);
		pstmnt1.setInt(1, 101);
		pstmnt1.setString(2, "Hyd");

		int count1 = pstmnt1.executeUpdate();
		System.out.println("Rows are effected :" + count1);
		
		connection.setAutoCommit(true);

		connection.close();

	}

}
