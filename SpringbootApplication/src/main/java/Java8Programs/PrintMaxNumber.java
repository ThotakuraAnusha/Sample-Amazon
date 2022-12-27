package Java8Programs;

import java.util.Arrays;
import java.util.List;

public class PrintMaxNumber {
	public static void main(String[] args) {
		
		List<Integer>myList =Arrays.asList(34,78,98,123,65,129,567,456);
		int max= myList.stream().max(Integer::compare).get();
		System.out.println(max);
	}

}
