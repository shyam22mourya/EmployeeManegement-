package main;

public class Employee {
     private int id ; 
     private String name ; 
     private   String email ; 
     private  int salary ; 
    
    public Employee(int id2, String name2, String email2, int salary2) {
		this.id = id2 ; 
		this.name = name2; 
		this.email = email2 ;
		this.salary =salary2 ; 
	}

    public int getId() {
    	return id ; 
    }
    public String getName() {
    	return name ; 
    }
    public String getEmail () {
    	return email ; 
    }
    public int getSalary() {
    	return salary ; 
    }
	 public void ToString() {
		 System.out.println("Emp = [" +"id : " + this.id +", name : "+this.name+", email : "+ this.email + ", salary : "+this.salary);
	 }
}
     
