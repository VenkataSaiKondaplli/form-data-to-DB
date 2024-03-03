package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateProductTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
		  Statement stmt=con.createStatement();
		  int i=stmt.executeUpdate("create table product(pid number(10),pname varchar2(20),price number(10),pcompanyname varchar2(30),model varchar2(40),quantity number(10))");
		 
		 System.out.println("Table created successfully");
		 
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}	
}
