package fibonacci;

public class Main {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		for(int i =0; i < 46; ++i) {
			System.out.println(fibonacci(i));
		}
		long time2 = System.currentTimeMillis();
		System.out.println("fim");
		System.out.println(MiliToSeconds(time2 - time1));
	}
	
	static double MiliToSeconds(long mili) {
		return (double)mili/1000;
	}
	
	static int fibonacci(int index) {		
		if( index  == 1 || index == 0)  return index;
		
		return fibonacci(index - 1) + fibonacci(index - 2);
	}
	
	static boolean isPrimeRight(int num) {
		for(int i =2 ; i < num; ++i) {
			if(num % i == 0 ) return false;
		}
		
		return true;
	}
	static boolean isPrimeGuess (int num) { 
		if( num == 2) return true;
		if(num == 3) return true;
		if( num % 2 == 0) return false;
		if( num % 3 == 0) return false;
		
		for(int i =5; i <= num; i+=2) {
			if( num % i == 0) return false;
		}
		
		return true;
	}
}
