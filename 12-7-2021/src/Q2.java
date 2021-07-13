import java.util.Scanner;

public class Q2 {
	static String swapString(String str) {
		String first = "";
		String last = "";
		int f = 0;
		int l = str.length()-1;
		while(true) {
			if(str.charAt(f) != ' ') {
				first += str.charAt(f);
			}else {
				break;
			}
			f++;
		}
		while(true) {
			if(str.charAt(l) != ' ') {
				last = str.charAt(l)+last;
			}else {
				break;
			}
			l--;
		}
		String newStr = "";
		for(int i=l-1; i>=f+1; i--) {
			newStr += str.charAt(i);
		}
		newStr = last + " " + newStr + " " + first;
		return newStr;
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(swapString(str));

	}

}
