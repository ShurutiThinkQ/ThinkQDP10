package com.interfacedemo;

@FunctionalInterface
interface Payment
{
	
   void pay(double amount);	

}

class Cake implements Bakery,Payment
{

	@Override
	public void bake() {
		System.out.println("Variety: ButterScotch, Pineapple, Chocolate");
		
	}
	
	public void displayRates()
	{
		System.out.println("Pineapple:300");
		System.out.println("Chocolate:400");
	}

	
	public void minOrder() {
		System.out.println("500g");
		
	}

	@Override
	public void pay(double amount) {
	  System.out.println("Payment done:"+amount);
		
	}
	

}

class Biscuit implements Bakery
{

	@Override
	public void bake() {
		System.out.println("Variety: Almond, Chocochips");
		
	}
	
	
   public void minOrder()
    {
    	System.out.println("250g");
    }
	

}

public class InterfaceDemo1 {
	
	public static void main(String[] args) {
		//Bakery b= new Bakery();
		
		System.out.println(Bakery.name);
		System.out.println("-----------------------------------");
		
//		Cake c= new Cake();
//		c.bake();
//		c.displayRates();
//		
//		Biscuit bs= new Biscuit();
//		bs.bake();
//		bs.minOrder();
		
		Bakery b;
		b= new Cake();
		b.bake();
		b.minOrder();
		
		b= new Biscuit();
		b.bake();
		b.minOrder();
		
		
	}

}
