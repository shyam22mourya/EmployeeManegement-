package main;

public class Query {
     
     static String getInsert() {
    	  return "INSERT INTO EMPLOYEE(ID , NAME , EMAIL , SALARY) VALUES  (? , ? ,? , ? )" ; 
     }
     static String getRead() {
    	  return " SELECT * FROM EMPLOYEE"; 
     }
     
     static String getUpdate()
     {     
    	 return "UPDATE EMPLOYEE SET NAME = ?, EMAIL = ?, SALARY = ? WHERE ID = ?";
     }
     static String getDelete() {
    	 return "DELETE FROM EMPLOYEE WHERE ID = ? "; 
     }
}
