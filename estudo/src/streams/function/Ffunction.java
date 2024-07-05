package streams.function;

import java.util.Arrays;
import java.util.List;

public class Ffunction {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		//Function<Integer, Integer> times_two = num-> num *2;
		//goes as parameter at .map();
		List<Integer> nums_square = nums.stream()
				.map(n->n*n)
				.toList();
		
		nums_square.forEach(System.out::println);
	}
}
