package Java8Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
		
		List<Integer>myList=Arrays.asList(98,15,56,78,98,78,98,76,90,65,15);
		Set<Integer> set = new HashSet();
		myList.stream().filter(n ->!set.add(n))
        .forEach(System.out::println);
		
	}

}
