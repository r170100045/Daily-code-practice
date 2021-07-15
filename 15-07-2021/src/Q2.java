
public class Q2 {
	public static void checkException() throws ArithmeticException {
		throw new ArithmeticException("Arithmetic exception found"); 
//		if we use throws clause or not the unchecked exception propagates in the method calling stack,
//		it is meaningless to use throws clause here
	}

	public static void main(String[] args) {
		Q2 var = new Q2();
		try {
			var.checkException();
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of code");

	}

}
