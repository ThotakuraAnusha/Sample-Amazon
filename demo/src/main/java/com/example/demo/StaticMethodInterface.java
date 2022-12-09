package com.example.demo;

interface PrintDemo {

	// Static Method
	static void hello() {
		System.out.println("Called from Interface PrintDemo");
	}
}

public class StaticMethodInterface implements PrintDemo {

	static public void main(String[] args) {

		// Call Interface method as Interface
		// name is preceding with method
		PrintDemo.hello();

		// Call Class static method
		hello();
	}

	// Class Static method is defined
	static void hello() {
		System.out.println("Called from Class");
	}
}
