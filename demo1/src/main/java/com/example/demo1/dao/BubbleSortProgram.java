package com.example.demo1.dao;

public class BubbleSortProgram {

	void bubbleSort(int arr[]) {
		int n = arr.length;
		//System.out.println(n);
		String str ="Anusha Java Developer";
		System.out.println("my name length is:"+ str.length());
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1])
				// swap arr[j+1] and arr[j]
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
	}
	/* prints the Array */

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String[] args) {
		BubbleSortProgram ob = new BubbleSortProgram();
		int arr[] = { 4, 7, 9, 8, 2, 6 };
		ob.bubbleSort(arr);
		System.out.println("Sorted Array:");
		ob.printArray(arr);

	}

}
