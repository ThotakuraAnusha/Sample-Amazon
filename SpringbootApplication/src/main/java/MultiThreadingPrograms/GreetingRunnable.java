package MultiThreadingPrograms;

/**
 * This program runs two greetings Threads in parallel
 */

public class GreetingRunnable implements Runnable {

	public GreetingRunnable(String string) {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {

		GreetingRunnable r1 = new GreetingRunnable("Hello");
		GreetingRunnable r2 = new GreetingRunnable("GoodBye");

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
