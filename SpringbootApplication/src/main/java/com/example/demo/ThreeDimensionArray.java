package com.example.demo;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 1 - Program for Reading 3D array and print 3D array elements in java 83
 * 
 * 
 */

public class ThreeDimensionArray {
	int height;
	int lenght;
	int width;
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	

	public void printArray(int[][][] intArray) {

		System.out.println("3-d array is given below :");
		// print the elements of array
	//	int rowNumber = intArray.length;
	//	int coloumnNumber = intArray ;
	//	int height = intArray.length;
	//	intArray
		
		System.out.println("row number " + this.lenght);
		System.out.println("column number " + this.width);
		System.out.println("height " + this.height);

		for (int i = 0; i < this.lenght; i++)
			for (int j = 0; j < this.width; j++)
				for (int z = 0; z < this.height; z++)   
					System.out.println("intArray [" + i + "][" + j + "][" + z + "] = " + intArray[i][j][z]);
	}

	// here we need to write a code from reading from key board and once done it
	// will return the 3d array;
	public int[][][] readArray() {
		
		HashMap map = new HashMap();
		int m, n, o, i, j, k;
		Scanner sc = new Scanner(System.in);
		// taking row as input
		System.out.println("Enter the number of rows: ");
		
		// taking column as input
		this.lenght= m = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		// taking row as input
		n = sc.nextInt();
		this.width= n;
		System.out.println("Enter the number of heigh: ");
		o = sc.nextInt();
		this.height =o;
		
		System.out.println(m+" " + n +"  " +o);
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
		td.printArray(readArray);

	}

}
