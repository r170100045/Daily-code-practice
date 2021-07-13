import java.util.ArrayList;
import java.util.Scanner;

public class LudicNumbers {
	static ArrayList<Integer> getLudic(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		for(int i=1; i<list.size(); i++) {
			int first = list.get(i);
			int remove = first + i;
			while(remove<list.size()) {
				list.remove(remove);
				remove = remove + first -1;
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(getLudic(n));
	}

}
