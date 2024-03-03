package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetAllRecordsREg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

          try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bdb","bdb");
			  Statement stmt=con.createStatement();
			 ResultSet rs=stmt.executeQuery("select * from register");
			  while(rs.next()) {
				  for(int i=1;i<=7;i++)
				  { 
					  System.out.println(rs.getString(i));
				  }
				 
			  }
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		
	}

}
