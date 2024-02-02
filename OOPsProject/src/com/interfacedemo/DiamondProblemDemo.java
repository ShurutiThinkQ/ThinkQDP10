package com.interfacedemo;

interface Student
{
  void show();	
  
  default void display()
  {
	  System.out.println("I am a student ");
  }

}

interface Teacher
{
   void show();
   
   default void display()
   {
 	  System.out.println("I am a teacher ");
   }


}

public class DiamondProblemDemo implements Student,Teacher {
	
	@Override
	public void show() {
		
		System.out.println("School Name: Heritage School");
		
	}
	
	// compulsory override default method causing ambiguity
	public void display()
	{
		System.out.println("I am in school");
		Student.super.display();
		Teacher.super.display();
	}

	
	public static void main(String[] args) {
		
		Student s;
		s= new DiamondProblemDemo();
		s.show();
		s.display();
		
	    Teacher t;
	    t= new DiamondProblemDemo();
	    t.show();
	    t.display();
		
	}


}
