package Java8Programs;

import java.util.Arrays;
import java.util.List;

public class PrintFirstAElement {
	
	public static void main(String[] args) {
		
		List<Integer>myList =Arrays.asList(22,13,15,16,18,20);
		myList.stream().findFirst().ifPresent(System.out::println);
	}

}
