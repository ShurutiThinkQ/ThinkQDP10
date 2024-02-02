package com.inheritance;

class Employee
{
   protected int id;
   protected String name;
   protected double salary;
   
   Employee()
   {
	   
   }
   Employee(int id, String name, double salary)
   {
	   this.id=id;
	   this.name=name;
	   this.salary=salary;
	   
   }
   
  public String toString()
  {
	  return id+" "+name+" "+salary;
  }
 
}

class Manager extends Employee
{
   String role;
   String wing;
   
   Manager()
   {
	   
   }
	
   Manager(int id,String name, double salary, String role, String wing)
   {
	   super(id,name,salary);
	   this.role=role;
	   this.wing=wing;
   }
   
   public String toString()
   {
	   return "Manager:"+super.toString()+" "+role+" "+wing;
   }
	
}
public class SingleInheritDemo {
	
	public static void main(String[] args) {
		
		Manager m1= new Manager(101,"Amruta",56000,"TeamLead","HR");
		
//		System.out.println(m1.id+" "+m1.name+" "+m1.salary);
//		System.out.println(m1.role+" "+m1.wing);
		
		System.out.println(m1);
		
		Employee e1= new Employee(102,"Anita",12000);
		System.out.println(e1);
		
	}

}
