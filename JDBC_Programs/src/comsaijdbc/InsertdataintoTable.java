package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertdataintoTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
		  Statement stmt=con.createStatement();
		  int i=stmt.executeUpdate("insert into student values(105,'chandu','chandu@gmail.com','bhmvrm',8237727257 )");
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
