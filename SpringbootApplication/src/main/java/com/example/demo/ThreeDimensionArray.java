package com.example.demo;

import java.util.Scanner;

/*
 * 1 - Program for Reading 3D array and print 3D array elements in java 8
 */

public class ThreeDimensionArray {

	public void printArray(int[][][] intArray) {

		System.out.println("3-d array is given below :");
		// print the elements of array

		for (int i = 0; i < 1; i++)
			for (int j = 0; j < 3; j++)
				for (int z = 0; z < 3; z++)
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
		int[][][] intArray = new int[m][n][o];
		System.out.println("Enter the elements of the Array: ");
		// loop for row
		for (i = 0; i < m; i++)
			// inner for loop for column
			for (j = 0; j < n; j++)
				for (k = 0; k < o; k++)
					intArray[i][j][k] = sc.nextInt();

		return intArray;

	}

	public static void main(String[] args) {

		// initialize 3-d array
		// int[][][] intArray = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } } };
		ThreeDimensionArray td = new ThreeDimensionArray();
		int[][][] readArray = td.readArray();
		td.printArray(readArray);

	}

}
