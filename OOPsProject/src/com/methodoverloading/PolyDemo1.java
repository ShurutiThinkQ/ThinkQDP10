package com.methodoverloading;

class Shape
{
	// overloading cannot be done only on the basis of return type
	// If the method is already overloaded on the basis of parameters
	// then it does not matter what the return type is
   public static void area(int side)
   {
	   System.out.println("Area of square:"+(side*side));
   }
   
//   int area(int side)
//   {
//	   return (side*side);
//   }
  
   static void area(int length, int breadth)
   {
	   System.out.println("Area of rectangle:"+(length*breadth));
   }
   
   protected static  float area(float radius)
   {
	  // System.out.println("Area of circle:"+(3.14*radius*radius));
	   return (float) (3.14*radius*radius);
	   
   }
  

}


public class PolyDemo1 {
	
	// Cannot overload outside the class
//	void area(float base, float height)
//	{
//		System.out.println("Area of triangle:"+(0.5*base*height));
//	}
	
	public static void main(String[] args) {
		
		//Shape s1= new Shape();
		
		Shape.area(9);
		System.out.println("Area of circle:"+ Shape.area(7.5f));
		Shape.area(6,7);
		System.out.println("-------------------");
		PolyDemo1.main(90);
		
		
	}
	// We can overload main method because main method is static and loaded during compile time
	// But JVM always call main method with string array as arguments
	// if we want to call other main method we can call it explicitly
	
	public static void main(int data)
	{
		System.out.println("Overloaded main");
		System.out.println("Data:"+data);
	}

}
