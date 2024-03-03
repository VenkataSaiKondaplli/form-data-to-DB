package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
		  Statement stmt=con.createStatement();
		  int i=stmt.executeUpdate("update student set email='ashadeepam@gmail.com' where sid=103 ");//UPDATE table_name SET column1 = value1, column2 = value2, ... WHERE condition;
		 
		  if(i>0)
			  System.out.println("updated  successfully");
		  else
			  System.out.println(" not updated  successfully");
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
}
	

