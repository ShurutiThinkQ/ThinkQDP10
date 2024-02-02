package com.interfacedemo;

interface one
{
	default void print()
	{
		System.out.println("one");
	}
	abstract void show();
}

interface two extends one
{
	default void print()
	{
		one.super.print();
		System.out.println("two");
		
	}
	
}
interface three extends one
{
	default void print()
	{
		System.out.println("three");
	}
}

class Main1 implements two,three
{

	@Override
	public void print() {
		
		//one.super.print();
		three.super.print();
		two.super.print();
		System.out.println("Main");
	}

	@Override
	public void show() {
	  System.out.println("Main show..");
		
	}
	
	
	
}
public class DiamondDemo {

	public static void main(String[] args) {
		Main1 m=new Main1();
		m.print();
		m.show();

	}

}