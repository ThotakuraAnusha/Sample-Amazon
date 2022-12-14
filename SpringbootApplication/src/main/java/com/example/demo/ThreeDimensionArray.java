package com.example.demo;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 1 - Program for Reading 3D array and print 3D array elements in java 83
 * 
 * 
 */

public class ThreeDimensionArray {

	public void printArray(int[][][] intArray) {

		System.out.println("3-d array is given below :");
		// print the elements of array
		System.out.println("row number " + intArray.length);
		System.out.println("column number " + intArray[0].length);
		System.out.println("height " + intArray[0][0].length);

		for (int i = 0; i < intArray.length; i++)
			for (int j = 0; j < intArray[0].length; j++)
				for (int z = 0; z < intArray[0][0].length; z++)
					System.out.println("intArray [" + i + "][" + j + "][" + z + "] = " + intArray[i][j][z]);
	}

	// here we need to write a code from reading from key board and once done it
	// will return the 3d array;
	public int[][][] readArray() {

		int m, n, o, i, j, k;
		Scanner sc = new Scanner(System.in);
		// taking row as input
		System.out.println("Enter the number of rows: ");

		// taking column as input
		m = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		// taking row as input
		n = sc.nextInt();
		System.out.println("Enter the number of heigh: ");
		o = sc.nextInt();

		System.out.println(m + " " + n + "  " + o);
		int[][][] intArray = new int[m][n][o];
		System.out.println("Enter the elements of the Array: ");
		// loop for row
		for (i = 0; i < m; i++)
			// inner for loop for column
			for (j = 0; j < n; j++)
				for (k = 0; k < o; k++)
					intArray[i][j][k] = 0; // sc.nextInt();

		return intArray;

	}

	public static void main(String[] args) {

		ThreeDimensionArray td = new ThreeDimensionArray();
		int[][][] readArray = td.readArray();
		
		System.out.println("============printarray starts====================");
		td.printArray(readArray);

	}

}
