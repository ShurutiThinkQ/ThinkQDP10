package com.staticdemo;

public class MyShop {
	
	public static void main(String[] args) {
		
		System.out.println(Item.discount);
		System.out.println(Item.brand);
		
//		Item i1= new Item(1,"Sugar",78);
//		System.out.println(Item.brand);
		
		Item i2= new Item();
		System.out.println(Item.brand);
		System.out.println("Number of items:"+Item.icount);
	}

}
