package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		try {
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
		  Statement stmt=con.createStatement();
		  Scanner s= new Scanner(System.in);
		  System.out.println("enter the id");
		  int id=s.nextInt();
		  PreparedStatement ps=con.prepareStatement("delete from  register where id=? ");
		  ps.setInt(1,id);
		  int i=ps.executeUpdate();
		  
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
