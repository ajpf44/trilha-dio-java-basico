package loops;

public class loops {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		
		for(int i: arr) {
			System.out.println(i);
			
			if( i > 3 ) break;
		}		
	}
}
