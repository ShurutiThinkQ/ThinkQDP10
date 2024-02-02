package com.methodoverloading;

public class TypePromotion {
	
//	static void display(int n)
//	{
//		System.out.println("In int");
//		System.out.println(n);
//	}
	
	static void display(char n)
	{
		System.out.println("In char");
		System.out.println(n);
	}
	
//	static void display(float n)
//	{
//		System.out.println("In float");
//		System.out.println(n);
//	}
	
	static void display(long n)
	{
		System.out.println("In long");
		System.out.println(n);
	}
	
	static void display(int n1, double d1)
	{
		System.out.println("In method 1");
		System.out.println("Ans:"+(n1+d1));
	}
	
	static void display(long n1, float f1)
	{
		System.out.println("In method 2");
		System.out.println("Ans:"+(n1+f1));
	}
	
	public static void main(String[] args) {
		display(8);
		
//		display(1,9.8);
//		display(9l,7.4f);
	
		System.out.println("-------------------------------");
		//display('A');
		
		//display(9,4.5f); // ambiguity issues
		
	}

}
