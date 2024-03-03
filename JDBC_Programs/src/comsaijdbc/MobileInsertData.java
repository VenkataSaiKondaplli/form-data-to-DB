package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class MobileInsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner s =new Scanner(System.in);
	        System.out.print("Enter Model No: ");
	        Long model_no = s.nextLong();
	        
	        System.out.print("Enter Model Name: ");
	        String model_name  = s.next();
	        
	        System.out.print("Enter Company Name: ");
	        String company_name  = s.next();
	        
	        System.out.print("Enter RAM Size: ");
	        Long ram_size  = s.nextLong();
	        
	        System.out.print("Enter ROM Size: ");
	        Long rom_size  = s.nextLong();
	        
	        System.out.print("Enter OS Name: ");
	        String os_name  = s.next();
	        
	        System.out.print("Enter Processor Name: ");
	        String processor_name  = s.next();
	        
	        System.out.print("Enter IMEI No: ");
	        long imei_no  = s.nextLong();
	        
	        System.out.print("Enter Price: ");
	        long price = s.nextLong();
	        
	        System.out.print("Enter Front Camera: ");
	        Long f_cam  = s.nextLong();
	        
	        System.out.print("Enter Back Camera: ");
	        Long b_cam = s.nextLong();
	        
	        
	        System.out.print("Enter Color: ");
	        String color = s.next();

	        try
	        {
	        	Class.forName("oracle.jdbc.driver.OracleDriver");
	        	
	        	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bdb", "bdb");
	        
	            PreparedStatement pstmt = conn.prepareStatement("insert into mobile values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				/*
				 * create table mobile( model_no NUMBER(10) PRIMARY KEY, model_name VARCHAR2(40)
				 * NOT NULL, company_name VARCHAR2(40) NOT NULL, ram_size NUMBER(10) NOT NULL,
				 * rom_size NUMBER(10) NOT NULL, os_name VARCHAR2(40) NOT NULL, processor_name
				 * VARCHAR2(40) NOT NULL, imei_no number(38) NOT NULL,price NUMBER(10) NOT NULL,
				 * f_cam NUMBER(5) NOT NULL,b_cam NUMBER(5) NOT NULL, color VARCHAR2(20) NOT
				 * NULL);
				 */
	            
	            pstmt.setLong(1, model_no);
	            pstmt.setString(2, model_name);
	            pstmt.setString(3, company_name);
	            pstmt.setLong(4, ram_size);
	            pstmt.setLong(5, rom_size);
	            pstmt.setString(6, os_name);
	            pstmt.setString(7, processor_name);
	            pstmt.setLong(8, imei_no);
	            pstmt.setLong(9, price);
	            pstmt.setLong(10, f_cam);
	            pstmt.setLong(11, b_cam);
	            pstmt.setString(12, color);
	            pstmt.executeUpdate();
	            System.out.println("Data inserted successfully.");
	        
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	
	}

}
