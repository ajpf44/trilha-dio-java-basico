package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
	public static void main(String[] args) {
		List<Integer> nums =new ArrayList<>(Arrays.asList(1,3,4));
		
		int sum = nums.stream().reduce(0, (a,b)->a+b);
		System.out.println(sum);
	}
}
