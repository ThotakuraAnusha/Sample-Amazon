package com.example.demo;

import java.util.Scanner;

/** 
    This program reads a sequence of values and print them ,marking the largest value.
 
 */

public class PrintLargestElement {
	
	private static final int LENGTH = 0;

	public static void main(String[] args) {
		
		final int Length =100;
		double [] values =new double[LENGTH];
		int currentSize =0;
		
		//Read inputs
		
		System.out.println("Please enter values: ");
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextDouble() && currentSize<values.length)
		{
			values [currentSize] =sc.nextDouble();
			currentSize++;
		}
		
		//Find largest value
		
		double largest =values[0];
		for(int i=0;i<=currentSize;i++)
		{
			if(values[i] >largest)
			{
				largest =values[i];
			}
		}
		
		//print all values  ,marking the largest
		
		
		for (int i=0;i<currentSize;i++)
		{
			System.out.println(values[i]);
		if (values[i] == largest) 
		{
			System.out.println("<====== largest value");
		}
		System.out.println();
	}

}
}
