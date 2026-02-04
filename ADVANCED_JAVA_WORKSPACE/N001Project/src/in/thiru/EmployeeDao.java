package in.thiru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDao {

	static String URL = "jdbc:mysql://localhost:3306/studentdb2";
	static String USER_NAME = "root";
	static String PAZZWORD = "123456";

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the employee name : ");
		String empName = sc.nextLine();  //null

		System.out.println("Enter the emplyee salary : ");

		int empSalary = sc.nextInt();
		
		
		
		
		StringBuilder QUARY=new StringBuilder("Select * from employee  where");
		
		if(empName != null && !empName.equals("null"))
		{
			QUARY.append(" emp_name = ?");
		}
		if(empSalary > 0)
		{
			QUARY.append(" and emp_salary = ?");
		}
		
		
		Connection conn = DriverManager.getConnection(URL, USER_NAME, PAZZWORD);
		
		PreparedStatement pstatement = conn.prepareStatement(QUARY.toString());
		
		int index=1;
		
		if(empName != null && !empName.equals("null"))
		{
			pstatement.setString(index++, empName);
		}
		if(empSalary > 0)
		{
			pstatement.setInt(index++, empSalary);
		}
		
		
		ResultSet result = pstatement.executeQuery();
		
		while(result.next())
		{
System.out.println("EmpId"+result.getInt(1)+" : "+"EmpName"+result.getString(2)+" : "+"EmpSal"+result.getInt(3)
+" : "+"Emp Department"+result.getString(4)
+" : "+"Emp Gender"+result.getString(5)
+" : "+"Emp Location"+result.getString(6));
		}
	

	}

}
