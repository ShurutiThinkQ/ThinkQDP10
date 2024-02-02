package com.wrapper;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		// Boxing: primitive to wrapper
		
		int num=23;
		Integer i1= Integer.valueOf(num);
		Integer i3= num; // valueOf - added by compiler // autoboxing
		
		
		System.out.println(i1);
		System.out.println(i3);
		
		Integer i2= new Integer(45);
		
		// Unboxing 
		// wrapper to primiive
		
	     Float f1=8.45f;
	     
	     float f= f1.floatValue();
	     
	     float f2= f1; // .floatValue is added by compiler 
	     
	     System.out.println(f);
	     System.out.println(f2);
	     
		
		
	}

}
