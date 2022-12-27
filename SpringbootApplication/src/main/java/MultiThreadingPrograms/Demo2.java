package MultiThreadingPrograms;

public class Demo2 {
	
	public static void main(String[] args) {
		Demo2 d =new Demo2();
		try {
			d.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("wait method called"+d);
		
	}
	

}
