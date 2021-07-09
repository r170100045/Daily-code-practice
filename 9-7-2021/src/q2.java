import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");;
		int n = scn.nextInt();
		int div = 10000;
		while(n>0) {
			if(n/div<10&&n/div>0) {
			System.out.print(n/div + " ");
			}
			else if(n/div==0) {
				System.out.println("number has less than five digits");
				break;
			}
			else {
					System.out.println("number has more than five digits");
					break;
			}
			n = n%div;
			div = div/10;
		}
		System.out.println();
		}

}
