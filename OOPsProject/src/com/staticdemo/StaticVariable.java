package com.staticdemo;

public class StaticVariable {
	
	int x=20; // instance variable
	static int y=10; // static variable
	
	// in instance method: can access both static and instance
	void instanceMethod()
	{
		System.out.println(x);
		System.out.println(y);
		
	}
	
	// in static method: can access only static
	// access instance - we need to create object
	static void staticMethod()
	{
		StaticVariable s= new StaticVariable();
		System.out.println(s.x);
		//System.out.println(x);
		System.out.println(y);
		
   } 	
	void show()
	{
		x++;
		y++;
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	
	void display()
	{
		int x=100;
		System.out.println(x); // local variable
		System.out.println(this.x);
		
		int y=200;
		System.out.println(y);// local
		System.out.println(StaticVariable.y);
		
	}
	
	public static void main(String[] args) {
		
		//System.out.println(x);
		System.out.println(y);
		StaticVariable s1= new StaticVariable();
		StaticVariable s2= new StaticVariable();
		System.out.println(s1.x);
		//System.out.println(s1.y);
		
		System.out.println("------------------------------");
		s1.show();
		s2.show();
		
		
		
		
	}

}
