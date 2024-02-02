package com.dynamicmethoddispatch;

class Bank
{
	protected double rate;
	
  void getRateOfInterest()
  {
	  rate=9;
	  System.out.println("Rate of interest is :"+rate +"%");
  }

}

class SBIBank extends Bank
{
	
	 void getRateOfInterest()
	  {
		  rate=8.5;
		  System.out.println("SBI Rate of interest is :"+rate +"%");
	  }
	 
	  void showBankDetails()
	  {
		  System.out.println("IFSCCode: SBIN5689");
		  System.out.println("Bank Name: State Bank Of India");
	  }


}

class HDFCBank extends Bank
{
	
	 void getRateOfInterest()
	  {
		  rate=9.5;
		  System.out.println("HDFC Rate of interest is :"+rate +"%");
	  }


}



public class DynamicDispatchDemo {

	public static void main(String[] args) {
		
		Bank b;
		b= new SBIBank();
		b.getRateOfInterest();
		//b.showBankDetails();
		
		b= new HDFCBank();
		b.getRateOfInterest();
		
		System.out.println("---------------------------------------");
		SBIBank s1= new SBIBank();
		s1.getRateOfInterest();
		s1.showBankDetails();
	}
	
}
