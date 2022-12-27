package Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgramUsingMap {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>l1 =new ArrayList<Integer>();
		l1.add(15);
		l1.add(65);
		l1.add(45);
		l1.add(65);
		l1.add(56);
		l1.add(34);
		l1.add(98);
		System.out.println(l1);
		List<Integer>updateMarks=l1.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updateMarks);
		
		
	}

}
