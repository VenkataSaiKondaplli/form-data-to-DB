package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDATA {

	public static void main(String[] args) {
		
	

	try {
		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
	  Statement stmt=con.createStatement();
	  int i=stmt.executeUpdate("insert into product values(118,'A/C',50000,'samsung','samacl3u',9 )");
	  if(i>0)
		  System.out.println("inserted successfully");
	  else
		  System.out.println("Something worng,try again.. ");
		con.close();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	
}
}
