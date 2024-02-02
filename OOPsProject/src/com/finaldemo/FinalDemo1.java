package com.finaldemo;
//final: restrict the user

//variable, method and class

//final and static : while declaration or static block: common for all objects
//final and instance: constructor (in all), instance , separate for all objects

//final 
class Developer
{
	int id;
	String name;
	//final static int noOfHours=8;
	final static int noOfHours;
	final String panNo;
	static
	{
		noOfHours=8;
	}
	{
		//panNo="Notdefined";
	}
	
	public Developer() {
		//noOfHours=8;
		this.panNo="Unknown";
	}
	
	public Developer(int id, String name,String panNo)
	{
		this.id=id;
		this.name=name;
		this.panNo=panNo;
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
	public static int getNoofhours() {
		return noOfHours;
	}
	public String getPanNo() {
		return panNo;
	}
   
	final void basicSkills()
	{
		System.out.println("HTML, CSS, C,C++,Java");
	}


}

class FullStackDeveloper extends Developer
{
	
//	 void basicSkills()
//	{
//		System.out.println("HTML, CSS, C,C++,Java,SpringBoot");
//	}


}


public class FinalDemo1 {
	
	public static void main(String[] args) {
		
		Developer d1= new Developer(101, "Pravin", "JKI90045");
	//	d1.panNo="LK907333";
		d1.name="Pravin N";
		
		// no setters for final variable 
		// must be initialized while creating of object
		
	}

}
