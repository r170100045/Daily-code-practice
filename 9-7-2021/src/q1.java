import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scn.nextInt();
		System.out.println("Enter second number");
		int b = scn.nextInt();
		if(a>b) {
			System.out.println(a + " is larger");
		}else if(b>a) {
			System.out.println(b + " is larger");

		}else {
			System.out.println("These numbers are equal");

		}
		

	}

}
