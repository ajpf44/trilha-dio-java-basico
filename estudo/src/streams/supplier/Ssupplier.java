package streams.supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ssupplier {
	public static void main(String[] args) {
		Supplier<String> supplier = ()-> "beatiful string";
		
		List<String> strList = Stream
				.generate(supplier)
				.limit(4)
				.collect(Collectors.toList());
		
		List<String> sList = Stream
				.generate(()->"mr puffles noodles")
				.limit(3)
				.toList();
		
		strList.forEach(s->System.out.println(s));
		sList.forEach(System.out::println);
	}
}
