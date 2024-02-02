package com.contsructor;

class Demo
{
	
  int a,b;
  String name;
  
  Demo()
  {
//	  this.a=10;
//	  b=20;
//	  name="Unknown";
	  this(10,20);
	  System.out.println("Default constructor");
  }
  
  Demo(int a,int b)
  {
	 // this();  Recursive call to constructor
	  System.out.println("Param const.. 1");
	  this.a=a;
	  this.b=b;
	  this.name="Unknown";
  }
  
  Demo(int a, int b, String name)
  {
	  this.a=a;
	  this.b=b;
	  this.name=name;
  }
  


}

public class ConstructorChainingDemo {
	
	public static void main(String[] args) {
		
		Demo d1= new Demo();
	}

}
