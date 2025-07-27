package main;

import java.sql.*;
import java.util.*;


public class DataAccessD {

	 public static void createEmp(Employee emp ) throws Exception  {
		 Connection c =  Db.connect();
		 String quert = Query.getInsert();
		 PreparedStatement prs = c.prepareStatement(quert);
		 
		 prs.setInt(1, emp.getId());
		 prs.setString(2, emp.getName());
		 prs.setString(3, emp.getEmail());
		 prs.setInt(4, emp.getSalary());
		 prs.execute();
		 
		 prs.close();
		 System.out.println("Employee Managed");
	 }
	
	 public static  void DeleteEmp(int id)  throws Exception {
		Connection c =   Db.connect();
		  String delete = Query.getDelete();
		  
		  PreparedStatement str = c.prepareStatement(delete);
		  str.setInt(1, id);
		boolean row = str.execute();
		  str.close();
		  c.close();
		  
		  if(!row ) {
			  System.out.println("Employee Deleted");
		}else {
			  System.out.println("No Employee ! . This is  id " + id );
		}
		  
	   System.out.println("Employee Deleted");
	 }
	 
	 public static  void updateEmp(int id , String name,String email , int Salary) throws Exception {
			Connection c =   Db.connect();
			  String update = Query.getUpdate();
			  
			  PreparedStatement str = c.prepareStatement(update);
		
			  str.setString(1, name);
			  str.setString(2, email);
			  str.setInt(3, Salary);
			  str.setInt(4, id);
			  
			boolean row  = str.execute();
			if(!row) {
				  System.out.println("Employee Updated");
			}else {
				  System.out.println("No Employee ! . This is  " + id );
			}
			  str.close();
			  c.close();
			  
			
	 }
	 
	 public static ArrayList<Employee> showEmplyeesAll() throws Exception {
		 Connection c = Db.connect();
		 String read = Query.getRead();
		  Statement st = c.createStatement();
		  ResultSet result = st.executeQuery(read);
		  ArrayList<Employee> list =new ArrayList<>(); 
		  
		  while(result.next()) {
			  Employee emp = new Employee(result.getInt(1),result.getString(2),result.getString(3),result.getInt(4));
	            list.add(emp);
		  }
		  
		  result.close();
		  st.close();
		  c.close();
		  
		 return list ; 
	 }
}
