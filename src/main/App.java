package main;

import java.util.*; 

public class App {
	
 public static void main (String arg[]) throws Exception  {
     Scanner sc  = new Scanner(System.in);
     System.out.println("Welcome to");
     while(true) {
       
         System.out.println("PRESS \n 1 : CREATE \n 2 : READ \n 3 : UPDATE \n 4 : DELETE ");
         int operation = sc.nextInt();

         // Fix: Use OR condition
         if(operation <= 0 || operation >= 5) {
             break ;
         }

         switch(operation) {
             case 1 : 
            	 
            	  System.out.println("Enter the ID of the employee to create:");
                 int id = sc.nextInt();
                 sc.nextLine(); // clear buffer
                 System.out.println("Enter name :");
                 String name = sc.nextLine();
                 System.out.println("Enter email :");
                 String email = sc.nextLine();
                 System.out.println("Enter salary :");
                 int salary = sc.nextInt();

                 Employee emp = new Employee(id , name , email , salary);
                 DataAccessD.createEmp(emp);
                 break; 

             case 2 : ArrayList<Employee> list =  DataAccessD.showEmplyeesAll();
                      for(Employee em : list) {
                	  em.ToString();
                    }
                 
               break;

             case 3 :
            	    System.out.println("Enter the ID of the employee to update:");
            	    int id1 = sc.nextInt();
            	    sc.nextLine(); 

            	    System.out.println("Enter new name:");
            	    String newName = sc.nextLine();

            	    System.out.println("Enter new email:");
            	    String newEmail = sc.nextLine();

            	    System.out.println("Enter new salary:");
            	    int newSalary = sc.nextInt();

                
                DataAccessD.updateEmp(id1, newName , newEmail ,newSalary);
               
               
                 break;

             case 4 : 
            	  System.out.println("Enter the ID of the employee to Delate:");
            	 int id2 = sc.nextInt();
            	 DataAccessD.DeleteEmp(id2);
                 break; 
         }
     }
 }
}
