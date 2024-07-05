package streams.binaryOperator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BbinaryOperator {
	public static void main(String[] args) {
		List<Integer> nums = IntStream.range(0,10)
				.boxed()
				.collect(Collectors.toList());
		
		//BinaryOperator<Integer> doSum = (n1,n2)->n1+n2;
		//goes as parameter at reduce
		//or the ez way: (n1,n2)->n1+n2
		
		int sum = nums.stream()
				.reduce((n1,n2)->n1+n2)
				.orElse(0);
		
		System.out.println(sum);
	}
}
