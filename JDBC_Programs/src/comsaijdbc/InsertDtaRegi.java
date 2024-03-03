package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDtaRegi {

	public static void main(String[] args) {
        try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
			  Scanner s= new Scanner(System.in);
			  System.out.println("enter the id,name,password,email,gender,address,mobileno");
			  int id=s.nextInt();
			  String name=s.next();
			  String password=s.next();
			  String email=s.next();
			  String gender= s.next();
			  String address=s.next();
              Long mobilenumber=s.nextLong();
			  
			  
			 PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?,?,?) ");
			 ps.setInt(1,id);
			 ps.setString(2,name);
			 ps.setString(3,password);
			 ps.setString(4,email);
			 ps.setString(5,gender);
			 ps.setString(6,address);
			 ps.setLong(7, mobilenumber);
			 
			  int i=ps.executeUpdate();
			  System.out.println(i+"created successfully");
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}

	}

}
