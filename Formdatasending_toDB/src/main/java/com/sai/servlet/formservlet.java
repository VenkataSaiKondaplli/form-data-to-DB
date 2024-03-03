package com.sai.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.sai.DAO.StudentDao;
import com.sai.POJO.StudentRegistration;


@WebServlet("/formservlet")
public class formservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private StudentDao studao=new StudentDao();
			
	
	/*
	 * public formservlet() { super();
	 * 
	 * }
	 */
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String password = request.getParameter("passw");
        
        String email = request.getParameter("email");
        String phNum = request.getParameter("tele");
        String gender = request.getParameter("gender1");
        
        String skills= request.getParameter("skills1");
       
        String dob = request.getParameter("dob");
        String  country = request.getParameter("country");
        
        String startdate= request.getParameter("time1");
        String enddate = request.getParameter("time2");
        
       
		/*
		 * response.setContentType("text/html");
		 * 
		 * out.print("<html><body>"); out.print("<h3>Details Entered</h3><br/>");
		 * 
		 * out.print("Full Name: "+ fname + "<br/>"); out.print("last  Name: "+ lname +
		 * "<br/>"); out.print("your password is : "+ password + "<br/>");
		 * out.print("mail is: "+ email + "<br/>"); out.print("Phone Number: "+ phNum
		 * +"<br/>"); out.print("Gender: "+ gender +"<br/>");
		 * out.print("Programming languages selected: "+ skills +"<br/>");
		 * out.print("DOB is: "+ dob + "<br/>"); out.print("Choosed country is: "+
		 * country + "<br/>"); out.print("Star Date is : "+ startdate + "<br/>");
		 * out.print("End Date is : "+ enddate + "<br/>");
		 * 
		 * 
		 * 
		 * out.print("</body></html>");
		 * 
		 * 
		 * 
		 * 
		 */	
        
        StudentRegistration studentreg= new StudentRegistration();
           studentreg.setFirst_Name(fname) ;
           studentreg.setLast_Name(lname);
           studentreg.setPassword(password);
           studentreg.setEmail(email);
           studentreg.setPhone_Number(phNum);
           studentreg.setGender(gender);
           studentreg.setSkills(skills);
           studentreg.setDob(dob);
           studentreg.setCountry(country);
           studentreg.setStart_Date(startdate);
           studentreg.setLast_Date(enddate);
           
           try  {
        	   studao.register_Student(studentreg);
           }
           catch (Exception e) {
			
        	   e.printStackTrace();
		}
           response.sendRedirect("successs.jsp");
        }

}
