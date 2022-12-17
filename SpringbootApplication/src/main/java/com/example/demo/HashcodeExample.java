package com.example.demo;

public class HashcodeExample {
	public static void main(String[] args) {
		
		String s =new String("Anusha");
		String s1 =new String("Anusha");
		
		System.out.println(s.equals(s1));
		
		 if(s.equals(s1)) 
			 //checking the equality of objects using equals() methods
		 {
		 
	            System.out.println("s& s1 are equal variables, and their respective hashvalues are:" + " "+ s.hashCode() + " & " + s1.hashCode());  
	          
		 }
		 else
		 {
			 System.out.println("s& s1 are equal variables, and their respective hashvalues are:" + " "+ s.hashCode() + " & " + s1.hashCode());  
		 }
		
	}
		
	
}
	
   