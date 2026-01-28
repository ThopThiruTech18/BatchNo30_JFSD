package in02.thiru.fi.dateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example02 {

	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf2=new SimpleDateFormat("hh:mm");
		
		String formattedDate = sdf1.format(date);
		System.out.println(formattedDate);
		
		String formattedTime = sdf2.format(date);
		System.out.println(formattedTime);
		
		
		
		
		
	}

}
