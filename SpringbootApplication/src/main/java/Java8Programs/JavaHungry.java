package Java8Programs;

import java.util.Arrays;
import java.util.List;

public class JavaHungry {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 12, 14, 16, 34, 56, 23, 45, 15);
		myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

	}

}
