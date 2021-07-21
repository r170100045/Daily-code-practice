import java.util.*;
public class ConcateLinkedLists {
	static void concatLists(LinkedList<Character> l1, LinkedList<Character> l2) {
		l1.addAll(l2);
	}
	public static void main(String[] args) {
		LinkedList<Character> l1 = new LinkedList<>();
		l1.add('c');
		l1.add('d');
		l1.add('e');
		l1.add('g');
		LinkedList<Character> l2 = new LinkedList<>();
		l2.add('p');
		l2.add('o');
		l2.add('r');
		concatLists(l1, l2);
		System.out.println(Arrays.toString(l1.toArray()));
	}

}
