package in.thiru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDto {
	
	static String URL = "jdbc:mysql://localhost:3306/studentdb2";
	static String USER_NAME = "root";
	static String PAZZWORD = "123456";
	
	public static void main(String[] args) throws SQLException {
		
		
		Connection connection = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
		Statement cstmt = connection.createStatement();


		cstmt.addBatch("INSERT INTO product VALUES (1, 'Laptop', 'Electronics', 55000, 10)");
		cstmt.addBatch("INSERT INTO product VALUES (2, 'Mobile Phone', 'Electronics', 25000, 20)");
		cstmt.addBatch("INSERT INTO product VALUES (3, 'Tablet', 'Electronics', 18000, 15)");
		cstmt.addBatch("INSERT INTO product VALUES (4, 'Smart Watch', 'Electronics', 8000, 30)");
		cstmt.addBatch("INSERT INTO product VALUES (5, 'Headphones', 'Accessories', 2000, 50)");

		cstmt.addBatch("INSERT INTO product VALUES (6, 'Keyboard', 'Accessories', 1500, 40)");
		cstmt.addBatch("INSERT INTO product VALUES (7, 'Mouse', 'Accessories', 800, 60)");
		cstmt.addBatch("INSERT INTO product VALUES (8, 'Monitor', 'Electronics', 12000, 12)");
		cstmt.addBatch("INSERT INTO product VALUES (9, 'Printer', 'Electronics', 9000, 8)");
		cstmt.addBatch("INSERT INTO product VALUES (10, 'Scanner', 'Electronics', 7000, 6)");

		cstmt.addBatch("INSERT INTO product VALUES (11, 'Desk Chair', 'Furniture', 6000, 25)");
		cstmt.addBatch("INSERT INTO product VALUES (12, 'Office Desk', 'Furniture', 12000, 10)");
		cstmt.addBatch("INSERT INTO product VALUES (13, 'Bookshelf', 'Furniture', 5000, 18)");
		cstmt.addBatch("INSERT INTO product VALUES (14, 'Water Bottle', 'Home', 500, 100)");
		cstmt.addBatch("INSERT INTO product VALUES (15, 'Lunch Box', 'Home', 700, 80)");

		cstmt.addBatch("INSERT INTO product VALUES (16, 'Pen Pack', 'Stationery', 200, 200)");
		cstmt.addBatch("INSERT INTO product VALUES (17, 'Notebook', 'Stationery', 150, 300)");
		cstmt.addBatch("INSERT INTO product VALUES (18, 'Backpack', 'Accessories', 1800, 40)");
		cstmt.addBatch("INSERT INTO product VALUES (19, 'Shoes', 'Fashion', 3000, 35)");
		cstmt.addBatch("INSERT INTO product VALUES (20, 'T-Shirt', 'Fashion', 900, 70)");

		/* ---- continuing pattern ---- */

		cstmt.addBatch("INSERT INTO product VALUES (21, 'Jeans', 'Fashion', 2200, 50)");
		cstmt.addBatch("INSERT INTO product VALUES (22, 'Jacket', 'Fashion', 4500, 20)");
		cstmt.addBatch("INSERT INTO product VALUES (23, 'Socks', 'Fashion', 300, 150)");
		cstmt.addBatch("INSERT INTO product VALUES (24, 'Cap', 'Fashion', 600, 90)");
		cstmt.addBatch("INSERT INTO product VALUES (25, 'Belt', 'Fashion', 700, 85)");

		cstmt.addBatch("INSERT INTO product VALUES (26, 'Mixer Grinder', 'Home Appliances', 4000, 12)");
		cstmt.addBatch("INSERT INTO product VALUES (27, 'Toaster', 'Home Appliances', 2500, 15)");
		cstmt.addBatch("INSERT INTO product VALUES (28, 'Electric Kettle', 'Home Appliances', 1800, 18)");
		cstmt.addBatch("INSERT INTO product VALUES (29, 'Iron Box', 'Home Appliances', 2200, 20)");
		cstmt.addBatch("INSERT INTO product VALUES (30, 'Vacuum Cleaner', 'Home Appliances', 7000, 6)");

		/* ---- jump to 100 (same structure) ---- */

		cstmt.addBatch("INSERT INTO product VALUES (91, 'USB Cable', 'Accessories', 300, 200)");
		cstmt.addBatch("INSERT INTO product VALUES (92, 'Power Bank', 'Electronics', 1500, 50)");
		cstmt.addBatch("INSERT INTO product VALUES (93, 'Router', 'Electronics', 2500, 20)");
		cstmt.addBatch("INSERT INTO product VALUES (94, 'Modem', 'Electronics', 2000, 15)");
		cstmt.addBatch("INSERT INTO product VALUES (95, 'Web Camera', 'Electronics', 3500, 10)");

		cstmt.addBatch("INSERT INTO product VALUES (96, 'Tripod', 'Accessories', 1200, 18)");
		cstmt.addBatch("INSERT INTO product VALUES (97, 'Microphone', 'Electronics', 4500, 12)");
		cstmt.addBatch("INSERT INTO product VALUES (98, 'Speaker', 'Electronics', 6000, 14)");
		cstmt.addBatch("INSERT INTO product VALUES (99, 'Projector', 'Electronics', 35000, 5)");
		cstmt.addBatch("INSERT INTO product VALUES (100, 'Smart TV', 'Electronics', 65000, 7)");
		
		
		
		int[] executeBatch = cstmt.executeBatch();
		System.out.println("No of rows are effected : "+executeBatch.length);
		
		
		connection.close();
		
		
		
		
	}

}
