package com.example.demo;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {

		final ArrayList list = new ArrayList();

		list.add(new String("str"));
		
		list.add("str1");
		
		list.add("str2");
		
		//System.out.println(list);
		
		final StringBuffer str = new StringBuffer("java");
		//str = "";
		
		System.out.println(str);
		
		str.append(" app");
		
		System.out.println(str);
		
	//	list = new ArrayList();
	}
}
