package com.inherit;

import com.inheritance.AccessDemo;

public class Demo3 extends AccessDemo {
	
	public static void main(String[] args) {
				
//		AccessDemo obj= new AccessDemo();
//		//obj.a=100; // Private is not accessible
//		obj.b=100; // not accessible
//		obj.c=100; // not accessible
//		obj.d=100;
//		
//		//obj.show();
//		obj.display();
//		obj.printMe();
//		obj.test();
		
		Demo3 obj= new Demo3();
		//obj.a=100; // Private is not accessible
		//obj.b=100;// default is not accessible
		obj.c=100; 
		obj.d=100;
		
		//obj.show();
		//obj.display();
		obj.printMe();
		obj.test();
		
	}

}
