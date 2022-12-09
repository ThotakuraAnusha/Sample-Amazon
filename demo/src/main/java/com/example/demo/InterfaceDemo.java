package com.example.demo;
interface NewInterface
{
	//static method
	public static void hello() {
		System.out.println("Hello ,New Static method here");
	}
	//public and abstract method of interface
	public void overrideMethod(String str);
}
public class InterfaceDemo implements NewInterface {
	public static void main(String[] args) {
		InterfaceDemo interfacedemo =new InterfaceDemo();
		//call static method of interface
		NewInterface.hello();
		//call abstract method of interface
		interfacedemo.overrideMethod("hello ,override method here");
		
	}
  //implementing interface method
	@Override
	
	public void overrideMethod(String str)
	{
		System.out.println(str);
	}
	
	
}
