package com.example.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinked {
   public static void main(String[] args) {
	
	  List <String >l1= new ArrayList<String>();//Create Object
	  
	  l1.add("abc");
	  l1.add("cde");
	  l1.add("anu");
	  l1.add("Siddu");
	  
	  System.out.println("ArrayList:"+l1);
	  
	  
	  List <String> l2 =new LinkedList<String>();
	  l2.add("Benz");
	  l2.add("Ferrari");
	  l2.add("Audi");
	  l2.add("Volvo");
	  System.out.println("LinkedList:"+l2);
	
}
}