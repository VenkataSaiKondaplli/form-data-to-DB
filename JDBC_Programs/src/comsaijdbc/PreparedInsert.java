package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
			 PreparedStatement stmt=con.prepareStatement("insert into employee ");
			  int i=stmt.executeUpdate();
			  System.out.println(i+"created successfully");
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
		
		
	}

}
