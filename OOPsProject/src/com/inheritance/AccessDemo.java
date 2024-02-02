package com.inheritance;

public class AccessDemo {
	
	private int a;
	 int b;
	protected int c;
	public int d;
	
	private void show()
	{
		System.out.println("Hello");
	}
	
	void display()
	{
		System.out.println("Welcome");
	}
	
	protected void printMe()
	{
		System.out.println("hi");
	}
	
	public void test()
	{
		System.out.println("Test");
	}
	
	public static void main(String[] args) {
		
		AccessDemo obj= new AccessDemo();
		obj.a=90;
		obj.b=100;
		obj.c=100;
		obj.d=90;
		
		obj.show();
		obj.display();
		obj.printMe();
		obj.test();
		
		
		
	}
	

}
