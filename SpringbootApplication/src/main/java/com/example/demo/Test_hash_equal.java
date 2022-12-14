package com.example.demo;

public class Test_hash_equal {
	public static void main(String[] args) {
		
		String a ="Anu";
		String b ="Anu";
		
		//checking the equality of objects using equals()method
		if(a.equals(b))
		{
			System.out.println("a&b values are equal variables ,and their respective hash values are :" +" "+a.hashCode() +"&" +b.hashCode());
		}
		String c ="abc";
		String d ="cde";
		
		if(!c.equals(d))
		{
			System.out.println("c&d values are unequal variables ,and their respective hash values are :" +" "+c.hashCode() +"&" +d.hashCode());
		}
	}

}
