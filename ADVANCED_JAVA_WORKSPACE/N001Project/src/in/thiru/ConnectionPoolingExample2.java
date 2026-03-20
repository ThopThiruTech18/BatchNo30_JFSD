package in.thiru;

import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionPoolingExample2 {

	static String URL = "jdbc:mysql://localhost:3306/studentdb2";
	static String USER_NAME = "root";
	static String PAZZWORD = "123456";

	public static void main(String[] args) throws SQLException {

		HikariConfig config = new HikariConfig();

		config.setJdbcUrl(URL);
		config.setUsername(USER_NAME);
		config.setPassword(PAZZWORD);

		config.setMinimumIdle(5);
		config.setMaximumPoolSize(8);

		
		HikariDataSource dataSource = new HikariDataSource(config);

		
		long startTime = System.currentTimeMillis();
		dataSource.getConnection();
		dataSource.getConnection();
		dataSource.getConnection();
		dataSource.getConnection();
		dataSource.getConnection();
		dataSource.getConnection();
		dataSource.getConnection();
		dataSource.getConnection();
		long endTime = System.currentTimeMillis();

		System.out.println(endTime - startTime);

	}

}
