package MultiThreadingPrograms;

class MultithreadDemo extends Thread {
	public void run() {
		try {

			// Display the threads is running

			System.out.println("Thread " + Thread.currentThread().getId() + "is running");
		} catch (Exception e) {
			// Throwing an Exception
			System.out.println("Exception caught");

		}
	}
}

//MainClass
public class MultiThreadingProgram1 {

	public static void main(String[] args) {

		int n = 8; // number of Threads

		for (int i = 0; i < n; i++) {
			MultithreadDemo t1 = new MultithreadDemo();
			t1.start();
		}
	}

}
