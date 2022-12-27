package MapPrograms;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// Adding elements to the Map
		// using standard put() method
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);
		map.put("vinay", 60);
		map.put("vijay", 90);
		map.put("veera", 70);
		map.put("vani", 50);
		map.put("vyshanavi", 40);
		map.put("Kumar", 90);
		map.put("veena", 20);
		// Print size and content of the Map
		System.out.println("Size of map is:- " + map.size());

		// Printing elements in object of Map
		System.out.println(map);
	}

}
