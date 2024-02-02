package com.intermediate;

import java.util.Arrays;

public class RightRotateArray {
	
	static void rotateOnce(int ar[])
	{
		int len=ar.length;
		int lastE= ar[len-1];
		
		// shifting
		for(int i=len-1;i>0;i--)
		{
			ar[i]=ar[i-1];
		}
		
		ar[0]= lastE;
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------------------");
		for(int i=0;i<3;i++)
		{
		   rotateOnce(arr);
		   System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("---------------------------");
		System.out.println(Arrays.toString(arr));
		
		
	}

}
