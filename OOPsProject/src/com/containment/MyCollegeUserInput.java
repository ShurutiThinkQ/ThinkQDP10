package com.containment;

import java.util.Scanner;

public class MyCollegeUserInput {
	
	Scanner sc = new Scanner(System.in);
	
	public void enterStudentDetails(Student s)
	{
		System.out.println("Enter student id:");
		s.setSid(sc.nextInt());
		
		System.out.println("enter student name:");
		s.setSname(sc.next());
		
		System.out.println("enter student marks:");
		s.setMarks(sc.nextDouble());
				
//		Course c= new Course();
//		
//		System.out.println("Enter course id:");
//		c.setCid(sc.nextInt());
//		
//		System.out.println("Enter course name:");
//		c.setCname(sc.next());
//		System.out.println("Enter course fees:");
//		c.setFees(sc.nextDouble());
//		
//		s.setCourse(c);
		
		s.setCourse(new Course());
		System.out.println("Enter course id:");
		s.getCourse().setCid(sc.nextInt());
		
		System.out.println("Enter course name:");
		s.getCourse().setCname(sc.next());
		System.out.println("Enter course fees:");
		s.getCourse().setFees(sc.nextDouble());
		
		
		
	}
	
	public static void main(String[] args) {
		
		MyCollegeUserInput college1= new MyCollegeUserInput();
		
		Student s1= new Student();
		college1.enterStudentDetails(s1);
		
		System.out.println(s1);
		
		Student s2= new Student();
		college1.enterStudentDetails(s2);
		
		System.out.println(s1);
		System.out.println("Course:"+s1.getCourse().hashCode());
		System.out.println(s2);
		System.out.println("Course:"+s2.getCourse().hashCode());
		
	}

}
