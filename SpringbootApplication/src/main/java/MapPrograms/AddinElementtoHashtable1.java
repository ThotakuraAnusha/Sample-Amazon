package MapPrograms;

import java.util.Hashtable;

public class AddinElementtoHashtable1 {
	
	public class GFG {
	    public static void main(String[] args)
	    {
	        // Create an empty Hashtable
	        Hashtable<String, Integer> ht = new Hashtable<>();
	  
	        // Add elements to the hashtable
	        ht.put("vishal", 10);
	        ht.put("sachin", 30);
	        ht.put("vaibhav", 20);
	  
	        // Print size and content
	        System.out.println("Size of map is:- " + ht.size());
	        System.out.println(ht);
	  
	        // Check if a key is present and if
	        // present, print value
	        if (ht.containsKey("vishal")) {
	            Integer a = ht.get("vishal");
	            System.out.println("value for key"  + " \"vishal\" is:- " + a);
	                              
	        }
	    }
	}

}
