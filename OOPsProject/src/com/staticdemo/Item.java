package com.staticdemo;

public class Item {
	
	private int itemid;
	private String iname;
	private double cost;
		
	//static double discount=0.1;
		
	static double discount;
	static String brand;
	static int icount=0;
	
	static
	{
		System.out.println("My grocery shop...");
		// called once 
//		System.out.println("Item added..");
//		icount++;
	}
	
	static
	{
		System.out.println("Discount on all items:");
		discount=0.1;
	    brand="Patanjali";
	}
	
	{
		System.out.println("In instance block");
		brand="Nestle";
		System.out.println("Item added..");
		icount++;
	}
	Item()
	{
		brand="Saffola";
		
	}
	
	Item(int itemid, String iname,double cost)
	{
		this.itemid=itemid;
		this.iname=iname;
		this.cost=cost;
		
		
	}
	
	// mutators and accessors
	
	public void setItemid(int itemid)
	{
		this.itemid=itemid;
	}
	
	public int getItemid()
	{
		return itemid; // return this.itemid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	public String toString()
	{
		return "Item:"+itemid+" "+iname+" "+cost;
	}
//	
//	public static void main(String[] args) {
//		System.out.println("In main method");
//	}
	
	

}
