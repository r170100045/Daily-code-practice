import java.io.IOException;

public class Q1B {
	public static void checkException() throws IOException {
		throw new IOException("exception found");
	}

	public static void main(String[] args) {
		Q1B p = new Q1B();
		try {
			p.checkException();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of code runs fine");

	}

}
