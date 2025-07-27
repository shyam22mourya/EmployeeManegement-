package main;

import java.sql.*;

public class Db {
	
	public  static  Connection connect()  throws Exception {
		
//		Step1 load driver ; 
//		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  
		  String url = "jdbc:mysql://localhost:3306/EMPLOYEMANAGE";
		  String username = "root";
		  String password = "sr6993075@gmail.com";
		  
		  //Step 2 connection; 
		  
		  Connection c = DriverManager.getConnection(url, username, password);
		  return c; 
	}
	
	

}
