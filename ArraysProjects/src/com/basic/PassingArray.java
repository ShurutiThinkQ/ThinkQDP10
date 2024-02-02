package com.basic;

import java.util.Arrays;

public class PassingArray {
	
	static void squareElements(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=ar[i]*ar[i];
					
		}
		
		System.out.println("Inside method");
		System.out.println(Arrays.toString(ar));
		
	}
	
		
	public static void main(String[] args) {
		
		int arr[]= {5,6,0,2,2};
		
			
		System.out.println(arr); // Object inherit
		
		squareElements(arr);
		
		System.out.println(Arrays.toString(arr));
		

		
	}
}	
