package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
			  Scanner s=new Scanner(System.in);
			  System.out.println("enter the name..");
			  String name=s.next();
			  System.out.println("enter the password..");
			  String password=s.next();
			 PreparedStatement ps=con.prepareStatement("select * from register where name=? and password=? ");
			 
			    ps.setString(1,name);
			    ps.setString(2,password);
			 ResultSet rs=ps.executeQuery();
			  
			  if (rs.next()) 
				  System.out.println("Login Succesfully..");
				  else
				  System.out.println("Somthing went wrong..please enter valid username/password ");
			
				con.close();
			} 
        catch (Exception e) {
		   e.printStackTrace();
        }
	}
		
		
	}


