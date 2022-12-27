package com.example.demo;

public class Student {

	int rollno;
	String name;
	String city;
	
	
	public Student(int rollno, String name, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}
	
	  public String toString()
	  {
		  return  rollno +" " + name +" " +city;
	  }
		
       public static void main(String args []) {
    	   Student s=new Student(101 ,"Anu", "Guntur");
    	   Student s1=new Student(102 ,"Suresh", "Hyd");
    	   
    	   System.out.println(s);  //compiler writes here s.toString()
    	   System.out.println(s1); //compiler writes here s1.toString()
    	   
    	   
    	   
       }
       
		
	}
	
