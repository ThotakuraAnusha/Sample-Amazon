package Java8Programs;

import java.util.Arrays;
import java.util.List;

public class Sayble {
	public static void main(String[] args) {
		
		List<Integer>myList =Arrays.asList(10,20,30,40,50,60);
		myList.stream().filter(n -> n%2==0).forEach(System.out::println);
		

	}
	

}
