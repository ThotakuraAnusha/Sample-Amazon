package com.example.demo;

public class TwoDimesionalArray {

	public static void main(String[] args) {

		int[][] a = new int[3][3];
		System.out.println("Array elements are :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = i + 1;
				System.out.print(a [i][j] + " ");
			}
			System.out.println( );
		}

	}
}