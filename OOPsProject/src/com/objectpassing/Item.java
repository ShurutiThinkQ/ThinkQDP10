package com.objectpassing;

public class Item {
	
	private int itemid;
	private String iname;
	private double cost;
	private int qty;
	private double discPrice;
	
	Item()
	{
		
	}
	
	Item(int itemid, String iname,double cost, int qty)
	{
		this.itemid=itemid;
		this.iname=iname;
		this.cost=cost;
		this.qty=qty;
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
	
	
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public double calTotalPrice()
	{
		double totalPrice= qty*cost;
		return totalPrice;
	}

	public double calDiscountedPrice(double discount)
	{
		double total= calTotalPrice();
		 discPrice= total-((discount/100)*total);
		return discPrice;
	}
	
	public void compareCost(Item i2)
	{
		if(this.discPrice==i2.discPrice)
			System.out.println("Both have same cost..");
		else if(this.discPrice>i2.discPrice)
			System.out.println(this.getIname()+" has higher cost");
			else 
				System.out.println(i2.getIname()+" has higher cost");
	}
	public String toString()
	{
		return "Item:"+itemid+" "+iname+" "+cost+" Total:"+ calTotalPrice();
	}
	
	

}
