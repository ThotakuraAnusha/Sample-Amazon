package MultiThreadingPrograms;
class MyThread extends Thread 
{
	public void run()
	{
	for(int i =0;i<10;i++)
	{
		System.out.println("child Thread");
		MyThread.yield();
		//Thread.holdsLock(getClass())
	}
		
		
	}
}

public class ThreadYieldMethodDemo {
	public static void main(String[] args) {
		MyThread  t1 =new MyThread();
		t1.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main Thread");
		}
		
		
	}

}
