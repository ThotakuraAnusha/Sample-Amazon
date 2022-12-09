package com.example.demo;

public class Main2 {
	public static void main(String[] args) {
		
		int [][] array =new int[3][3];
		System.out.println("Two Dimensional Array:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				array [i][j]=i*j;  //assign value to to each Array element
				System.out.println(array [i][j]+ " ");
			}
			System.out.println(" ");
		}
	}

}
