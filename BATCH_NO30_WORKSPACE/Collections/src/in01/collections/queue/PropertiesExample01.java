package in01.collections.queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample01 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileInputStream io = new FileInputStream(
				"C:\\Users\\hp\\Desktop\\VERSION_IT\\BATCH_NO30\\BATCH_NO30_WORKSPACE\\Collections\\src\\in01\\collections\\queue\\database.properties");

		Properties p1 = new Properties();

		p1.load(io);

		System.out.println(p1.getProperty("uname"));
		System.out.println(p1.getProperty("pwd"));
		System.out.println(p1.getProperty("url"));
		System.out.println(p1.getProperty("driver-class-name"));
		System.out.println(p1.getProperty("server.port"));

	}

}
