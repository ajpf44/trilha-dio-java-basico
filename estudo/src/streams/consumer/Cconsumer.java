package streams.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Cconsumer {
	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7);
		
		//nums.forEach(cconsumer);
		
		nums.stream()
			.filter(n-> n % 2 ==0)
			.forEach(n->System.out.println(n));
	}
	public static Consumer<Integer> cconsumer =
		num->{
			if(isPrime(num)) {
				System.out.println("O número " + num + " é primo");
			}else {
				System.out.println("O número " + num + " não é primo");
			}
		};
	
	private static boolean isPrime(int num) {
		
		if(num < 2) return false;
		if(num % 2 ==0 ) return num == 2;
		
		for(int i =3; i < num; i+=2) {
			if( num % i == 0) return false;
		}
		
		return true;
	}
}
