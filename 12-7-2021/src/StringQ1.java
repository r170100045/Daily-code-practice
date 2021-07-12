import java.util.Scanner;

public class StringQ1 {
	static String getHexadecimalEq(String str){
		String hexa = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int ascii = (int)ch;
			hexa+= Integer.toHexString(ascii);
		}
		return hexa;
	}
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	String str = scn.next();
	System.out.println(getHexadecimalEq(str));
	
	}
}
