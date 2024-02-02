package com.covariant;
// A covariant return type in Java refers to
//the ability of a subclass method to override a superclass method 
//and return a more specific type(sub class of parent return type) 
//than the return type of the overridden method.

class Person
{
   int id; 
   String name;
   
   Person()
   {
	   
   }
   Person(int id, String name)
   {
	   this.id=id;
	   this.name=name;
   }

   Person showDetails()
   {
	   name= name+"India";
	   return this;
   }
  
}

class Employee extends Person
{
	float salary;
	
	Employee()
	{
		
	}
	Employee(int id, String name, float salary)
	{
		super(id,name);
		this.salary=salary;
	}
	
//	Person showDetails()
//	 {
//		   name= name+"ThinkQ";
//		   salary=salary+1000;
//		   return this;
//     }
	
	Employee showDetails()
	 {
		   name= name+"ThinkQ";
		   salary=salary+1000;
		   return this;
    }
	
}

public class CovrariantDemo {
	
	public static void main(String[] args) {
		
		Person p;
		Employee e;
		
		Person p1= new Person(1,"Akshta");
		p=p1.showDetails();
		System.out.println(p.id+" "+p.name);
		
		Employee e1= new Employee(101, "Harshit", 45000f);
//		p=e1.showDetails();
//		System.out.println(p.id+" "+p.name+" "+p.salary);
		
//		e=(Employee) e1.showDetails(); // casting
//		System.out.println(e.id+" "+e.name+" "+e.salary);
		
		e= e1.showDetails(); // no casting required
		System.out.println(e.id+" "+e.name+" "+e.salary);
		
	}

}
