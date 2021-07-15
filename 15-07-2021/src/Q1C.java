import java.io.IOException;

public class Q1C {
	public static void checkException() throws IOException{
		throw new IOException("Exception handled");
	}
	public static void main(String[] args) throws IOException {
		Q1C var = new Q1C();
		var.checkException();
		System.out.println("rest of code");
	}

}
