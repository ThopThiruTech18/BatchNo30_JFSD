package in.thiru;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertImageIntoDbDAO {
	
	static String QUERY="insert into person values(?,?)";
	
	public static void main(String[] args) throws Exception {
		


		
		File f=new File("C:\\Users\\hp\\Desktop\\download.png");
		FileInputStream fis=new FileInputStream(f);
		
		Connection dbConnection = ConnectionFactory.getDBConnection();
		
		PreparedStatement pstm = dbConnection.prepareStatement(QUERY);
		
		pstm.setInt(1, 101);
		pstm.setBlob(2, fis);
		
		int count = pstm.executeUpdate();
		
		System.out.println("Rows are effected count "+count);
		
		
	}
	
	
	
	
	

}
