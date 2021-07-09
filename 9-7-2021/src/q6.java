import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int temp = n;
		int count = 0;
		while(temp>0) {
			temp = temp/10;
			count++;
		}
		if(count<5||count>5) {
			System.out.println("Enter a new number");
			n = scn.nextInt();
		}
//		now copying n to a new number as we want to operate n from both the sided
		int forw = n;
		int back = n;
		int div = 10000;
		for(int i=0; i<2; i++) {
			int a = forw/div;
			int b = back%10;
			forw = forw%div;
			back = back/10;
			div = div/10;
			if(a!=b) {
				System.out.println("not a palindrome");
				return;
			}
		}
		System.out.println("a palindrome");
		
		

	}

}
