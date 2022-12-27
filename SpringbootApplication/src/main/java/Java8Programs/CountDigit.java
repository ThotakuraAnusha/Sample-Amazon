package Java8Programs;

import java.util.Arrays;
import java.util.List;

public class CountDigit {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 45, 78, 76, 87, 65);
		long count = list.stream().count();
		System.out.println(count);
	}

}
