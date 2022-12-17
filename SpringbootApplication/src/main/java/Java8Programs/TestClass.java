package Java8Programs;

interface TestInterface
{
	//abstract method
	public void square(int a);
	
	default void show()
	{
		System.out.println("Default method Executed");
	}
}
class TestClass implements TestInterface
{

	@Override
	public void square(int a) {
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		
		TestClass t  =new TestClass();
		t.square(5);
		
		
		//Default method executed
		
		t.show();
		
		
	}
		
		
	}
	
	