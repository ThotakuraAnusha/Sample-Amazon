package com.example.demo;

public class Main {
	public static void main(String[] args) {
		// two dimensional array definition
		int[][] intArray = { { 1, 2 }, { 4, 8 } };
		// Access individual element of array
		int  val = intArray[0][1];
		// print the element
		System.out.println("Accessed array value = " + val);
		System.out.println("Contents of Array:");
		// print individual elements of array
		System.out.println(intArray[0][0] + " " + intArray[0][1]);
		System.out.println(intArray[1][0] + " " + intArray[1][1]);

	}
}
