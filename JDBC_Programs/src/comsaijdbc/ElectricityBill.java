package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bdb", "bdb");
			Scanner s = new Scanner(System.in);
			System.out.println("enter the consumer id number..");
			long cid = s.nextInt();
			System.out.println("enter the consumer name..");
			String cname = s.next();
			System.out.println("enter the current reading..");
			double c_reading = s.nextDouble();
			System.out.println("enter the previous reading..");
			Double p_reading = s.nextDouble();
			
			double units= c_reading-p_reading;
			System.out.println("units is " +units);
			double total_bill=0.0;
			if (units<300) {
				total_bill=units*1.75+25;
			} else if (units>=300 && units <500)
			{
				total_bill=units*3.75+50;
			}			
			 else if(units>=500)
			 {
			   	 total_bill=units*7.25+120;
		     }
			
			PreparedStatement ps=con.prepareStatement("insert into elec_bill1 values(?,?,?,?,?,?)");
			ps.setLong(1, cid);
			ps.setString(2, cname);
			ps.setDouble(3,c_reading);
			ps.setDouble(4,p_reading);
			ps.setDouble(5, units);				
			ps.setDouble(6, total_bill);
			if (total_bill  < 0) {
				System.out.println("please enter valid c_reading/ p_reading");
			} 
			int i=ps.executeUpdate();
			if (i>0) {
				System.out.println("electricity bill successfully printed");
			} else {
				System.out.println("something went wrong,try again");
			}
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
