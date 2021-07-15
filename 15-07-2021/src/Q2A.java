import java.io.IOException;

public class Q2A {
	public static void checkException() throws IOException {
		throw new IOException("exception found");
	}

	public static void main(String[] args) {
		Q2A p = new Q2A();
		try {
			p.checkException();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of code runs fine");

	}

}
