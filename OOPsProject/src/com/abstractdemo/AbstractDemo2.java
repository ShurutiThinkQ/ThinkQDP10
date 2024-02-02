package com.abstractdemo;

abstract class Bike
{
	// instance variables
	private int id;
	private String name;
	private double cost;
	
	// static variable
	static String brandName;
	static float discount;
	
	static
	{
		brandName="Honda";
	}
	
	// constructors: to intiliaze instance variable
	// using super in child class
	Bike()
	{
		
	}
	
	Bike(int id, String name,double cost)
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public static String getBrandName() {
		return brandName;
	}

	public static void setBrandName(String brandName) {
		Bike.brandName = brandName;
	}
	
	// abstract and final cannot come together
	// abstract and static cannot come together
	
	abstract  void description();

	// static method
	public static float getDiscount() {
		return discount;
	}

	public static void setDiscount(float discount) {
		Bike.discount = discount;
	}
	
	// final method
	final  void display()
	{
		System.out.println("Brand name:"+brandName);
		System.out.println("Discount on all bikes:"+Bike.discount+"%");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Id:"+id);
		System.out.println("Model:"+name);
		System.out.println("Cost:"+cost);
		System.out.println("Discounted cost:"+ (cost- ((discount/100)*cost)));
		
	}
 

}

class BasicBike extends Bike
{
	 private float avg;

	public BasicBike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasicBike(int id, String name, double cost, float avg) {
		super(id, name, cost);
		this.avg = avg;
	}

	@Override
	void description() {
		System.out.println("This is a normal bike");
		System.out.println("Number of gears: 4");
		System.out.println("Avergae:"+avg);
		
	}
	 
	 
}

class SportsBike extends Bike
{
	private int gears;
	private float speed;
	public SportsBike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SportsBike(int id, String name, double cost, int gears, float speed) {
		super(id, name, cost);
		this.gears = gears;
		this.speed = speed;
	}
	@Override
	void description() {
		System.out.println("This is a sports bike");
		System.out.println("Number of gears:"+gears);
		System.out.println("Speed:"+speed);
		
	}
	
	

}

public class AbstractDemo2 {
	
    public static void main(String[] args) {
		
    	Bike b;
    	Bike.setDiscount(20);
    	b= new SportsBike(101, "Buccati", 108000, 6, 300);
    	b.display();
    	System.out.println("-------------------------------");
    	b.description();
    	
    	System.out.println("==========================================");
    	b= new BasicBike(101, "Splendor",50000 , 20);
    	b.display();
    	b.description();
	}
	

}
