package Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgram1 {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(46);
		l.add(54);
		l.add(40);
		l.add(35);
		System.out.println(l);
		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
