package com.intermediate;

import java.util.Arrays;

public class SeparateNegativePositive {
	// at the end : negative
	static void shiftNegative(int ar[])
	{
		int left=0;
		int right= ar.length-1;
		
		while(left<right)
		{
			while(ar[left]>0 && left<right)
				left++;
			while(ar[right]<0 && left<right)
				right++;
			if(left<right)
			{
				int tmp= ar[left];
				ar[left]= ar[right];
				ar[right]=tmp;
				left++;
				right--;
				
			}
			
		}
		
	}
	
	static void shiftNegative2(int ar[])
	{
		for(int i=1;i<ar.length;i++)
		{
			for(int j=ar.length-1;j>=0;j--)
			{
				if(ar[i]<0 &&i<j)
				{
					int temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]= {3,4,-1,6,-7,8,-5,2,9};
		System.out.println(Arrays.toString(arr));
		
//		shiftNegative(arr);
//		
//		System.out.println(Arrays.toString(arr));
		
		shiftNegative2(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
