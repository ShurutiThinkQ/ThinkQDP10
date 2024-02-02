package com.containment;

public class MyCollege {
	
	public static void main(String[] args) {
		
		Student s1= new Student(101, "Gunjan", 78, new Course(1,"Java",45000));
		
		System.out.println(s1);
		System.out.println(s1.getCourse().hashCode());
		
		Student s2= new Student();
		s2.setSid(102);
		s2.setSname("Pravin");
		s2.setMarks(90);
		s2.setCourse(new Course(1,"Java",45000));
		System.out.println(s2);
		
		System.out.println(s2.getCourse().hashCode());
		
		System.out.println("--------------------------------------------");
		
		Course c1= new Course(101, "Java", 45000);
		Course c2= new Course(102,".net", 50000);
		Course c3= new Course(103, "Python", 47000);
		

		System.out.println("--------------------------------------------");
		
		Student stud1= new Student(1,"Mandar",95,c1);
		Student stud2= new Student(2,"Shreyash",89,c2);
		Student stud3= new Student(3,"Shivani",67,c1);
		Student stud4= new Student(4,"Amit",90,c2);
		Student stud5= new Student(5,"Manya",73,c1);
		Student stud6= new Student(6,"Sumit",57,c3);
		
		
		System.out.println(stud1);
		System.out.println(stud2);
		System.out.println(stud3);
		System.out.println(stud4);
		System.out.println(stud5);
		System.out.println(stud6);
		
		System.out.println("-----------------------------------------");

		System.out.println(stud1.getCourse().hashCode());
		System.out.println(stud3.getCourse().hashCode());
		
		System.out.println("-----------------------------------------");
		
		
		System.out.println(stud1.getCourse().getFees());
		System.out.println(stud3.getCourse().getFees());
		
		//c1.setFees(50000);
         stud1.getCourse().setFees(55000);

		System.out.println(stud1.getCourse().getFees());
		System.out.println(stud3.getCourse().getFees());
		
	}

}
