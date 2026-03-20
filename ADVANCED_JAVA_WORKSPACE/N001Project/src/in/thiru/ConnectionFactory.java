package in.thiru;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {
	
//	URL = jdbc:mysql://localhost:3306/studentdb2
//	USER_NAME = root
//	PAZZWORD = 123456
//	db.poolSize=10
	
		private static DataSource datasource = null;

		static {

			try {

				File f = new File("C:\\Users\\hp\\Desktop\\VERSION_IT\\BATCH_NO30\\ADVANCED_JAVA_WORKSPACE\\N001Project\\src\\DB.propeties");
				FileInputStream fis = new FileInputStream(f);

				Properties p = new Properties();
				p.load(fis);

				String url = p.getProperty("URL");
				String uname = p.getProperty("USER_NAME");
				String pwd = p.getProperty("PAZZWORD");
				String poolSize = p.getProperty("POOL_SIZE");

				HikariConfig config = new HikariConfig();

				config.setJdbcUrl(url);
				config.setUsername(uname);
				config.setPassword(pwd);
				config.setMaximumPoolSize(Integer.parseInt(poolSize));

				datasource = new HikariDataSource(config);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static Connection getDBConnection() throws Exception {
			return datasource.getConnection();
		}

}
