package com.enhancedforloop;

import java.util.Arrays;

public class SumOfEven {
	public static void main(String[] args) {
		
		int ar[]= {4,6,7,2,1,0};
		System.out.println(Arrays.toString(ar));
		int sumE=0;
		for(int x:ar)
		{
			if(x%2==0)
			{
				sumE+=x;
			}
		}
		
		System.out.println(sumE);
	}

}
