package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteProduct {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
		  Statement stmt=con.createStatement();
		  int i=stmt.executeUpdate("delete from product where pid=102");
		  if(i>0)
			  System.out.println("Deleted successfully");
		  else
			  System.out.println("Someting Wrong, try agian...");
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
