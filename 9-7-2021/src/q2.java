import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");;
		int n = scn.nextInt();
		while(n>0) {
			System.out.print(n%10 + " ");
			n = n/10;
		}
	}

}
