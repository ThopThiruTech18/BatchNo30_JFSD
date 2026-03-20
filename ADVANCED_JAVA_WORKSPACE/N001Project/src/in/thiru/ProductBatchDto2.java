package in.thiru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductBatchDto2 {

	static String URL = "jdbc:mysql://localhost:3306/studentdb2";
	static String USER_NAME = "root";
	static String PAZZWORD = "123456";

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
		PreparedStatement pstmt = connection.prepareStatement("INSERT INTO product VALUES (?, ?, ?, ?, ?)");

		// Product 1
		pstmt.setInt(1, 1);
		pstmt.setString(2, "Laptop");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 55000);
		pstmt.setInt(5, 10);
		pstmt.addBatch();

		// Product 2
		pstmt.setInt(1, 2);
		pstmt.setString(2, "Mobile Phone");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 25000);
		pstmt.setInt(5, 20);
		pstmt.addBatch();

		// Product 3
		pstmt.setInt(1, 3);
		pstmt.setString(2, "Tablet");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 18000);
		pstmt.setInt(5, 15);
		pstmt.addBatch();

		// Product 4
		pstmt.setInt(1, 4);
		pstmt.setString(2, "Smart Watch");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 8000);
		pstmt.setInt(5, 30);
		pstmt.addBatch();

		// Product 5
		pstmt.setInt(1, 5);
		pstmt.setString(2, "Headphones");
		pstmt.setString(3, "Accessories");
		pstmt.setInt(4, 2000);
		pstmt.setInt(5, 50);
		pstmt.addBatch();

		// Product 6
		pstmt.setInt(1, 6);
		pstmt.setString(2, "Keyboard");
		pstmt.setString(3, "Accessories");
		pstmt.setInt(4, 1500);
		pstmt.setInt(5, 40);
		pstmt.addBatch();

		// Product 7
		pstmt.setInt(1, 7);
		pstmt.setString(2, "Mouse");
		pstmt.setString(3, "Accessories");
		pstmt.setInt(4, 800);
		pstmt.setInt(5, 60);
		pstmt.addBatch();

		// Product 8
		pstmt.setInt(1, 8);
		pstmt.setString(2, "Monitor");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 12000);
		pstmt.setInt(5, 12);
		pstmt.addBatch();

		// Product 9
		pstmt.setInt(1, 9);
		pstmt.setString(2, "Printer");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 9000);
		pstmt.setInt(5, 8);
		pstmt.addBatch();

		// Product 10
		pstmt.setInt(1, 10);
		pstmt.setString(2, "Scanner");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 7000);
		pstmt.setInt(5, 6);
		pstmt.addBatch();

		// Product 11
		pstmt.setInt(1, 11);
		pstmt.setString(2, "Desk Chair");
		pstmt.setString(3, "Furniture");
		pstmt.setInt(4, 6000);
		pstmt.setInt(5, 25);
		pstmt.addBatch();

		// Product 12
		pstmt.setInt(1, 12);
		pstmt.setString(2, "Office Desk");
		pstmt.setString(3, "Furniture");
		pstmt.setInt(4, 12000);
		pstmt.setInt(5, 10);
		pstmt.addBatch();

		// Product 13
		pstmt.setInt(1, 13);
		pstmt.setString(2, "Bookshelf");
		pstmt.setString(3, "Furniture");
		pstmt.setInt(4, 5000);
		pstmt.setInt(5, 18);
		pstmt.addBatch();

		// Product 14
		pstmt.setInt(1, 14);
		pstmt.setString(2, "Water Bottle");
		pstmt.setString(3, "Home");
		pstmt.setInt(4, 500);
		pstmt.setInt(5, 100);
		pstmt.addBatch();

		// Product 15
		pstmt.setInt(1, 15);
		pstmt.setString(2, "Lunch Box");
		pstmt.setString(3, "Home");
		pstmt.setInt(4, 700);
		pstmt.setInt(5, 80);
		pstmt.addBatch();

		// Product 16
		pstmt.setInt(1, 16);
		pstmt.setString(2, "Pen Pack");
		pstmt.setString(3, "Stationery");
		pstmt.setInt(4, 200);
		pstmt.setInt(5, 200);
		pstmt.addBatch();

		// Product 17
		pstmt.setInt(1, 17);
		pstmt.setString(2, "Notebook");
		pstmt.setString(3, "Stationery");
		pstmt.setInt(4, 150);
		pstmt.setInt(5, 300);
		pstmt.addBatch();

		// Product 18
		pstmt.setInt(1, 18);
		pstmt.setString(2, "Backpack");
		pstmt.setString(3, "Accessories");
		pstmt.setInt(4, 1800);
		pstmt.setInt(5, 40);
		pstmt.addBatch();

		// Product 19
		pstmt.setInt(1, 19);
		pstmt.setString(2, "Shoes");
		pstmt.setString(3, "Fashion");
		pstmt.setInt(4, 3000);
		pstmt.setInt(5, 35);
		pstmt.addBatch();

		// Product 20
		pstmt.setInt(1, 20);
		pstmt.setString(2, "T-Shirt");
		pstmt.setString(3, "Fashion");
		pstmt.setInt(4, 900);
		pstmt.setInt(5, 70);
		pstmt.addBatch();

		// Product 21
		pstmt.setInt(1, 21);
		pstmt.setString(2, "Jeans");
		pstmt.setString(3, "Fashion");
		pstmt.setInt(4, 2200);
		pstmt.setInt(5, 50);
		pstmt.addBatch();

		// Product 22
		pstmt.setInt(1, 22);
		pstmt.setString(2, "Jacket");
		pstmt.setString(3, "Fashion");
		pstmt.setInt(4, 4500);
		pstmt.setInt(5, 20);
		pstmt.addBatch();

		// Product 23
		pstmt.setInt(1, 23);
		pstmt.setString(2, "Socks");
		pstmt.setString(3, "Fashion");
		pstmt.setInt(4, 300);
		pstmt.setInt(5, 150);
		pstmt.addBatch();

		// Product 24
		pstmt.setInt(1, 24);
		pstmt.setString(2, "Cap");
		pstmt.setString(3, "Fashion");
		pstmt.setInt(4, 600);
		pstmt.setInt(5, 90);
		pstmt.addBatch();

		// Product 25
		pstmt.setInt(1, 25);
		pstmt.setString(2, "Belt");
		pstmt.setString(3, "Fashion");
		pstmt.setInt(4, 700);
		pstmt.setInt(5, 85);
		pstmt.addBatch();

		// Product 26
		pstmt.setInt(1, 26);
		pstmt.setString(2, "Mixer Grinder");
		pstmt.setString(3, "Home Appliances");
		pstmt.setInt(4, 4000);
		pstmt.setInt(5, 12);
		pstmt.addBatch();

		// Product 27
		pstmt.setInt(1, 27);
		pstmt.setString(2, "Toaster");
		pstmt.setString(3, "Home Appliances");
		pstmt.setInt(4, 2500);
		pstmt.setInt(5, 15);
		pstmt.addBatch();

		// Product 28
		pstmt.setInt(1, 28);
		pstmt.setString(2, "Electric Kettle");
		pstmt.setString(3, "Home Appliances");
		pstmt.setInt(4, 1800);
		pstmt.setInt(5, 18);
		pstmt.addBatch();

		// Product 29
		pstmt.setInt(1, 29);
		pstmt.setString(2, "Iron Box");
		pstmt.setString(3, "Home Appliances");
		pstmt.setInt(4, 2200);
		pstmt.setInt(5, 20);
		pstmt.addBatch();

		// Product 30
		pstmt.setInt(1, 30);
		pstmt.setString(2, "Vacuum Cleaner");
		pstmt.setString(3, "Home Appliances");
		pstmt.setInt(4, 7000);
		pstmt.setInt(5, 6);
		pstmt.addBatch();

		// Product 91
		pstmt.setInt(1, 91);
		pstmt.setString(2, "USB Cable");
		pstmt.setString(3, "Accessories");
		pstmt.setInt(4, 300);
		pstmt.setInt(5, 200);
		pstmt.addBatch();

		// Product 92
		pstmt.setInt(1, 92);
		pstmt.setString(2, "Power Bank");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 1500);
		pstmt.setInt(5, 50);
		pstmt.addBatch();

		// Product 93
		pstmt.setInt(1, 93);
		pstmt.setString(2, "Router");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 2500);
		pstmt.setInt(5, 20);
		pstmt.addBatch();

		// Product 94
		pstmt.setInt(1, 94);
		pstmt.setString(2, "Modem");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 2000);
		pstmt.setInt(5, 15);
		pstmt.addBatch();

		// Product 95
		pstmt.setInt(1, 95);
		pstmt.setString(2, "Web Camera");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 3500);
		pstmt.setInt(5, 10);
		pstmt.addBatch();

		// Product 96
		pstmt.setInt(1, 96);
		pstmt.setString(2, "Tripod");
		pstmt.setString(3, "Accessories");
		pstmt.setInt(4, 1200);
		pstmt.setInt(5, 18);
		pstmt.addBatch();

		// Product 97
		pstmt.setInt(1, 97);
		pstmt.setString(2, "Microphone");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 4500);
		pstmt.setInt(5, 12);
		pstmt.addBatch();

		// Product 98
		pstmt.setInt(1, 98);
		pstmt.setString(2, "Speaker");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 6000);
		pstmt.setInt(5, 14);
		pstmt.addBatch();

		// Product 99
		pstmt.setInt(1, 99);
		pstmt.setString(2, "Projector");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 35000);
		pstmt.setInt(5, 5);
		pstmt.addBatch();

		// Product 100
		pstmt.setInt(1, 100);
		pstmt.setString(2, "Smart TV");
		pstmt.setString(3, "Electronics");
		pstmt.setInt(4, 65000);
		pstmt.setInt(5, 7);
		pstmt.addBatch();

		int[] executeBatch = pstmt.executeBatch();
		System.out.println("No of rows are effected : " + executeBatch.length);

		connection.close();

	}

}
