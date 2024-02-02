package com.inheritance;

class Parent
{
	int value;
	String msg;
	
	Parent()
	{
		msg="Welcome";
	}
	Parent(int value)
	{
		this();
		System.out.println("In parent class para constructor.. ");
		this.value=value;
		
	}
	
	void display()
	{
		System.out.println("Value:"+value);
	}


}

class Child extends Parent
{
	int data;
	String msg;
	
	Child()
	{
		msg="Hello";
	}
	
	Child(int value, int data)
	{
		// this();
	  super(value);
	 
	  System.out.println("In child class para const");
	  this.data=data;
	  msg="Hello";
	  
	}
	
	void display()
	{
		super.display();
		System.out.println("Data:"+data);
	}
	
	void show()
	{
		String msg="Java";
		System.out.println("Message:"+msg);
		System.out.println("Inst message:"+this.msg);
		System.out.println("Super message:"+super.msg);
	}
	

}

public class SuperDemo {
	
	public static void main(String[] args) {
		
		Child c= new Child(10,100);
//		System.out.println("Data:"+c.data);
//		System.out.println("Value:"+c.value);
		c.display();
		c.show();
	      
		
	}

}
