package com.example.demo;

public class ThreeDimensionArray {
	public void printArray(int[][][] intArray) {

		System.out.println("3-d array is given below :");
		// print the elements of array

		for (int i = 0; i < 1; i++)
			for (int j = 0; j < 3; j++)
				for (int z = 0; z < 3; z++)
					System.out.println("intArray [" + i + "][" + j + "][" + z + "] = " + intArray[i][j][z]);
	}

	// here we need to write a code from reading from key board and once done it will return the 3d array;
	public int[][][] readArray() {
		
		int[][][] intArray = new int[3][3][3];
		//bufferreader 
		
		return null;

	}

	//// 1 - Program for Reading 3D array and print 3D array elements in java 8

	public static void main(String[] args) {

		// initialize 3-d array
		int[][][] intArray = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } } };

	}

}
