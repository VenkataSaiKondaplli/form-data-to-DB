package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
				  
				  Scanner s=new Scanner(System.in);
				  System.out.println("enter the Name for upadate....");
				  String name=s.next();
				  
				  System.out.println("enter the emailfor update....");
				  String email=s.next();
				  
				  System.out.println("enter the id for update above records....");
				  int ids=s.nextInt();
				  
				  PreparedStatement ps=con.prepareStatement("update register set name=?,email=? where id=? ");
				  
				    ps.setString(1,name);
				    ps.setString(2,email);
				    ps.setInt(3,ids);
				  int i=ps.executeUpdate();
				  
				  if (i>0) 
					  System.out.println("Your Request Successfully Applied(record updated)..");
					  else
					  System.out.println("Somthing went wrong..please try agian ");
				con.close();
				} 
	        catch (Exception e) {
			   //e.printStackTrace();
	        	System.out.println(e);
	        }
		
		
	}

}
