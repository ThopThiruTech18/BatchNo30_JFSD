package in.thiru;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class BooksDao {

//	URL = jdbc:mysql://localhost:3306/studentdb2
//		USER_NAME = root
//		PASSWORD = 123456

	public static void main(String[] args) throws IOException {
		
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the price : ");
		int price = scanner.nextInt();
		
		File f=new File("C:\\Users\\hp\\Desktop\\VERSION_IT\\BATCH_NO30\\ADVANCED_JAVA_WORKSPACE\\N001Project\\src\\DB.propeties");
		FileInputStream fis=new FileInputStream(f);
		
		Properties ps=new Properties();
		ps.load(fis);
		
		String URL = ps.getProperty("URL");
		String USER_NAME = ps.getProperty("USER_NAME");
		String PAZZWORD = ps.getProperty("PAZZWORD");
		

		try {
			Connection connection = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);

//			String SELECT_QUERY="select * from book";

			StringBuffer query = new StringBuffer("select * from books ");

			if (price > 0) {
				query.append(" where price < ?");
			}

			PreparedStatement prepareStatement = connection.prepareStatement(query.toString());
			
			if(price > 0)
			{
				prepareStatement.setInt(1, price);
			}
			
			ResultSet booksSet = prepareStatement.executeQuery();
			
			while(booksSet.next())
			{
//			  System.out.println(booksSet.getInt(1));
//			  System.out.println(booksSet.getString(2));
//			  System.out.println(booksSet.getString(3));
//			  System.out.println(booksSet.getInt(4));
//			  System.out.println(booksSet.getInt(1)+" : "+booksSet.getString(2)+" : "+booksSet.getString(3)+" : "+booksSet.getInt(4));
			  System.out.println(booksSet.getInt("book_id")+" : "+booksSet.getString("book_name")+" : "+booksSet.getString("author")+" : "+booksSet.getInt("price"));
			}
			
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
