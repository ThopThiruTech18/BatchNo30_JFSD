package in.thiru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookDao {

	private static final String URL = "jdbc:mysql://localhost:3306/studentdb2";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "123456";
	private static final String INSERT_QUERY = "insert INTO books values(?,?,?,?)";

	public boolean insertBook(String bookName,int bookPrice,String author,String shopName) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

		PreparedStatement prepareStatement = connection.prepareStatement(INSERT_QUERY);

		prepareStatement.setString(1, bookName);
		prepareStatement.setInt(2, bookPrice);
		prepareStatement.setString(3, author);
		prepareStatement.setString(4, shopName);

		int count = prepareStatement.executeUpdate();

		if (count > 0) {
			return true;
		}

		return false;
	}

}
