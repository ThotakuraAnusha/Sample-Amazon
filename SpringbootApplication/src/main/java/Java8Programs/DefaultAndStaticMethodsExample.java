package Java8Programs;


interface TestInterface2
{
	//abstract method
	
	public void square(int a);
	
	//Default method
	default void show()
	{
		System.out.println("Default method executed successfully");
	}
	//static method
	static void run()
	{
		System.out.println("Static method executecd successfully");
	}
		
}

public class DefaultAndStaticMethodsExample implements TestInterface2 {

	@Override
	public void square(int a) {
		System.out.println("Square of a is :"+a*a);
	}
	public static void main(String[] args) {
		
		DefaultAndStaticMethodsExample d =new DefaultAndStaticMethodsExample();
		d.show();
		TestInterface2.run();
	}
		
		
	}
	
