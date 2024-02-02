package com.interfacedemo;

// default method: backward compatibility and mutable
interface Operations {
	void area();
	default void volume()
	{
		System.out.println("Volume method for 3D shapes");
		show();
		display();
	}
	// common implementation
	// belongs to interface
	static void info()
	{
		System.out.println("Geometry shapes");
		display();
	}
	
	static double getPi()
	{
		return 3.147;
	}
	
	// Java 9: private : confidential information
	// can be called in default method
	private void show()
	{
		System.out.println("Made for: Shuruti");
	}
	
	// can be called static and default method
	private static void display()
	{
		System.out.println("Pan no:JDK892FJ");
	}
	
}

class Square implements Operations {
	int side;

	Square() {

	}

	Square(int side) {
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area is:" + (side * side));

	}

}

class Cube implements Operations {
	int side;

	Cube() {

	}

	Cube(int side) {
		this.side = side;
	}

	@Override
	public void area() {
	System.out.println("Area of cube is:"+(6*side*side));

	}
	
	@Override
	public void volume()
	{
		System.out.println("Volume of cube is :"+(side*side*side));
		
	}

}

public class DefaultMethodDemo {
	
	public static void main(String[] args) {
		
		
		Operations.info();
		
		System.out.println("Value of Pi:"+Operations.getPi());
		Operations c;
		c= new Square(7);
		c.area();
		c.volume();
		
		c= new Cube(9);
		c.area();
		c.volume();
		
		
		
	}

}
