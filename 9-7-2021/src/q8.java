
public class q8 {

	public static void main(String[] args) {
		long fact = 1;
//		time and space complexity would prevent us from calculating the factorial of 100.
		for(int i=1; i<=20; i++) {
			fact = fact*i;
			System.out.println(fact);
		}
		
	}

}
