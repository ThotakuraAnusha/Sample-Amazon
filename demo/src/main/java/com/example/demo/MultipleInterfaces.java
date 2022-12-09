package com.example.demo;

interface GFG
{
	public default void display()
	{
		System.out.println("GEEKFORGEEKS");
	}
}
interface gfg
{
	public default void display()
	{
		System.out.println("geekforgeek");
	}
}

public class MultipleInterfaces implements GFG ,gfg {
	public void display()
	{
		GFG.super.display();
	   gfg.super.display();
	}
	
	public static void main(String[] args) {
	MultipleInterfaces multipleinterface =new MultipleInterfaces();
				multipleinterface.display();	
		
	}
}
