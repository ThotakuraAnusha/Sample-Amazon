package com.example.demo;

public class Student2 {
	
	String name;
	int rollno;
	
	public Student2(String name ,int rollno)
	{
		this.name =name;
		this.rollno=rollno;
		
	}
	public String toString()
	{
		return name +" "+rollno;
	}
	public static void main(String[] args) {
		
		Student2 s1 =new Student2("Anusha" ,102);
		Student2 s2 =new Student2("Akhila" ,103);
		
		System.out.println("before add toString method:" +s1);
		System.out.println("after add toString method:" +s1.toString());
		System.out.println("before add toString method:" +s2);
		System.out.println("after add toString method:" +s2.toString());
		
	}

}
