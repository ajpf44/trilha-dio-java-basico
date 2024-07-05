package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDesafios {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//desafio2(list);
		//desafio4(list);
		//desafio10(list);
		List<Integer> list2 = Stream.generate(() -> 1).
				limit(20).toList();
		
		System.out.println(desafio18(list));
		System.out.println(desafio18(list2));
		
	}
	static <T> boolean desafio18(List<T> list) {
		return list.stream().allMatch( n-> n==list.get(0));
	}
	static void desafio10(List<Integer> list) {
		Predicate<Integer> pred = n -> {
			if(n % 3 == 0 || n % 5 == 0) {
				return true;
			}
			
			return false;
		};
		
		list.stream()
		.filter(pred).forEach(System.out::println);
	}
	
	static void desafio2(List<Integer> list) {
		list.stream()
			.filter(n -> n%2==0)
			.forEach(System.out::println);
	}
	
	static void desafio4(List<Integer> list) {
		List<Integer> new_list = list.stream()
				.filter(n -> n % 2 == 0).toList();
		
		new_list.forEach(System.out::println);
	}
}
