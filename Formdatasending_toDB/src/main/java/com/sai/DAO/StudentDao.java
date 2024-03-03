package com.sai.DAO;
import java.sql.*;

import com.sai.POJO.StudentRegistration;

public class StudentDao {
    public int register_Student(StudentRegistration studreg)  throws  ClassNotFoundException
    {
    	String sqlquery= "INSERT INTO studentRegistration_student(first_Name, last_Name, password, email, phone_Number, gender, skills,dob,country,start_Date,last_Date) VALUES " + " (?, ?, ?,?, ?, ?,?,?,?,?,?);";
    	
    	int result=0;
    	
    	 try {
    		 
    		 Class.forName("com.mysql.cj.jdbc.Driver") ;
    		 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Venkat@22");
			
			PreparedStatement pstmt= con.prepareStatement(sqlquery);
			
			pstmt.setString(1,studreg.getFirst_Name());
			pstmt.setString(2,studreg.getLast_Name());
			pstmt.setString(3, studreg.getPassword());
			pstmt.setString(4, studreg.getEmail());
			pstmt.setString(5, studreg.getPhone_Number());
			pstmt.setString(6, studreg.getGender()) ;
			pstmt.setString(7, studreg.getSkills());
			pstmt.setString(8, studreg.getDob());
			pstmt.setString(9, studreg.getCountry());
			pstmt.setString(10, studreg.getStart_Date());
			pstmt.setString(11, studreg.getLast_Date());
			
			System.out.println(pstmt);
			result=pstmt.executeUpdate();
			if(result>0)
			
			{
				System.out.println("one record inserted");
			}
				else
				{
					System.out.println("Inserted data into DB is failed. try again..  ");
				}
			
			} catch (SQLException e) {
			
				 //printSQLException(e);
				System.out.println(e);
				
		}
    	 
		return result;
    	
    }
    
}
