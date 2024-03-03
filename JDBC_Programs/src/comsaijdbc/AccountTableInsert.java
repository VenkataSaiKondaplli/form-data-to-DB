package comsaijdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AccountTableInsert {

	public static void main(String[] args) {
		try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bdb", "bdb");
			Scanner s = new Scanner(System.in);
			System.out.println("enter the account number..");
			int acc_no = s.nextInt();
			System.out.println("enter the name..");
			String name = s.next();
			PreparedStatement ps = con.prepareStatement("select * from account where acc_no=? and name=? ");
			ps.setInt(1, acc_no);
			ps.setString(2, name);
			ResultSet rs = ps.executeQuery();
			double balance = 0.0;
            if(rs.next()) {
				System.out.println("logined successfully.....");
				System.out.println("enter the deposit amount");
				double damount = s.nextDouble();
				balance = rs.getDouble(3);
				System.out.println("before:" + balance);
				balance = balance + damount;
				System.out.println("after" + balance);
               	PreparedStatement ps1 = con.prepareStatement("update account set balance=? where acc_no=?");
               	ps1.setDouble(1, balance);
				ps1.setInt(2, acc_no);
				
				int i = ps1.executeUpdate();
                if (i > 0) 
                {
					System.out.println("deposited succesfully..please check your balance");
				} else {
					System.out.println("desposite failure");
				}
				System.out.println();
			}
			else {
				System.out.println("please enter valid account number and name...!");
			}
			con.close();

		} catch (Exception e) {
		 System.out.println(e);
		}

	}

}
