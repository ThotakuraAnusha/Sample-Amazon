package MapPrograms;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {

		HashMap m = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));

		//m.put(i1, "Anusha");
		//m.put(i2, "JavaDeveloper");
		System.out.println(m);
	}

}
