import java.util.*;
public class IsAPalindrome {

	public static void main(String[] args) {
		String s = new String();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter string for checking if it is a palindrome or not!");
		s = scn.nextLine();
		Stack<Character> list = new Stack<Character>();
		for(int i=0; i<s.length(); i++) {
			Character ch = s.charAt(i);
			if(Character.isLetter(ch))
			list.push(ch);
		}
		
		Stack<Character> newStack = new Stack<Character>();
		for(int i=s.length()-1; i>=0; i--) {
			Character ch = s.charAt(i);
			if(Character.isLetter(ch))
				newStack.push(ch);
		}
		if(Arrays.equals(newStack.toArray(), list.toArray())) {
			System.out.println("String is a palindrome!");
		}else {
			System.out.println("String is not a palindrome!");
		}
		System.out.println(Arrays.toString(newStack.toArray()));
		System.out.println(Arrays.toString(list.toArray()));
		scn.close();
		
		
		
	}

}
