package com.inheritance;

class Vehicle
{
    private int vno;
    private String model;
    protected double price;
    
//    public Vehicle()
//    {
//    	System.out.println("In Vehicle constr");
//    }
    
    public Vehicle(int vno,String model, double price)
    {
    	this.vno=vno;
    	this.model=model;
    	this.price= price;
    }

	public int getVno() {
		return vno;
	}

	public void setVno(int vno) {
		this.vno = vno;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
    
    

}

class Car extends Vehicle
{
	
    protected int noOfGears;
    private String fuelType;
    
    // default constructor is always called automatically
    // super()- writes on its own
//    Car()
//    {
//    	System.out.println("In Car const");
//    }

	public Car(int vno, String model, double price, int noOfGears, String fuelType) {
		super(vno, model, price); // super();
		System.out.println("In Car para constr");
		this.noOfGears = noOfGears;
		this.fuelType = fuelType;
	}
	
	
	

	public String getFuelType() {
		return fuelType;
	}




	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}




	public String toString()
	{
		return "Car:"+getVno()+" "+getModel()+" "+price+" "+noOfGears+" "+fuelType;
	}
      
    



}

class SportsCar extends Car
{
	private double maxSpeed;
	private double mileage;
	
	
//	public SportsCar() {
//		// TODO Auto-generated constructor stub
//	}
	
	public SportsCar(int vno, String model, double price, int noOfGears, String fuelType, double maxSpeed,
			double mileage) {
		super(vno, model, price, noOfGears, fuelType);
		this.maxSpeed = maxSpeed;
		this.mileage = mileage;
	}



	public double getMaxSpeed() {
		return maxSpeed;
	}



	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	public double getMileage() {
		return mileage;
	}



	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public String toString()
	{
		return "SportsCar:"+getVno()+" "+getModel()+" "+price+" "+noOfGears+" "+getFuelType()+" "+maxSpeed+" "+mileage;
	}
	
	
	


}


public class MultiLevelDemo {
	
	public static void main(String[] args) {
		
		//Car c = new Car();
		System.out.println("--------------------------------");
		
		Car c1= new Car(101, "Honda", 670000, 4, "Petrol");
		System.out.println(c1);
		
		System.out.println("---------------------------------------------");
		SportsCar s1= new SportsCar(902, "X1", 2500000, 6, "Diesel", 400,40);
		System.out.println(s1);
		
	}

}
