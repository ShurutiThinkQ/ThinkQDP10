package com.staticdemo;

class Car {
	static int wheels;
	
	static {
		m1();
	       }

	  {
		System.out.println(++wheels);
     }

	Car(String color) {
		this.color = color ;
	}

	static void m1() {	
		System.out.println("Color:"+color);
	}

	static String color = "Red";

	static {
		m1();
	}

	{
		++wheels;
	}
}

public class Out_1 {
	public static void main(String[] args) {
		Car bmw = new Car("yellow");
		//Car wagonR = new Car("blue");
		System.out.println("BMW:"+bmw.wheels);
		System.out.println("BMW color:"+bmw.color);
	} }


