import java.io.IOException;

public class Q1C {
	public static void checkException() {
		throw new IOException("Exception handled"); 
		/* if we don't throw the exception it will cause compilation problem 
		 * hence we must use 'throws' keyword in such case, hence it will show error at compilation time
		 */
	}
	public static void main(String[] args)  {
		Q1C var = new Q1C();
		Q1C.checkException(); 
		System.out.println("rest of code");
	}

}
