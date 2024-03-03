package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class MobileRecordDelete {

	public static void main(String[] args) {
		
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
			  Scanner s=new Scanner(System.in);
			  System.out.println("enter the imei number for delete one record..");
			  Long emi=s.nextLong();
			 PreparedStatement ps=con.prepareStatement("delete from mobile where imei_no=? ");
			 
			    ps.setLong(1,emi);
			  int i=ps.executeUpdate();
			  
			  if (i>0) 
				  System.out.println("Your Request Successfully Applied(record deleted)..");
				  else
				  System.out.println("Somthing went wrong..please try agian ");
			
				con.close();
			} 
        catch (Exception e) {
		   e.printStackTrace();
        }
	}

}
