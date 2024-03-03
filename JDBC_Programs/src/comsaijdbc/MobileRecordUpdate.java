package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MobileRecordUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
				  
				  Scanner s=new Scanner(System.in);
				  System.out.println("enter the Model Name for upadate....");
				  String model=s.next();
				  
				  System.out.println("enter the Rom Size for update....");
				  long rom=s.nextLong();
				  
				  System.out.println("enter the imei number for update above records....");
				  Long emi=s.nextLong();
				  
				  PreparedStatement ps=con.prepareStatement("update mobile set model_name=?,rom_size=? where imei_no=? ");
				  
				    ps.setString(1,model);
				    ps.setLong(2,rom);
				    ps.setLong(3,emi);
				  int i=ps.executeUpdate();
				  
				  if (i>0) 
					  System.out.println("Your Request Successfully Applied(record updated)..");
					  else
					  System.out.println("Somthing went wrong..please try agian ");
				con.close();
				} 
	        catch (Exception e) {
			   e.printStackTrace();
	        }

	}

}
