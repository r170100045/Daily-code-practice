import java.util.*;
public class TowerOfHanoi {
	static void moveDiscs(int n, Stack<Integer> tower1, Stack<Integer> tower2, Stack<Integer> tower3) {
		if(n==0) {
			return;
		}
		moveDiscs(n-1, tower1, tower3, tower2);
		tower3.push(tower1.pop());
		moveDiscs(n-1, tower2, tower1, tower3);
	}
	public static void main(String[] args) {
		Stack<Integer> tower1 = new Stack<Integer>();
		Stack<Integer> tower2 = new Stack<Integer>();
		Stack<Integer> tower3 = new Stack<Integer>();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of discs");
		int n = scn.nextInt();
		for(int i=1; i<=n; i++) {
			tower1.push(n-i+1);
		}
		moveDiscs(n, tower1, tower2, tower3);
		
		System.out.println(Arrays.toString(tower3.toArray()));

	}

}
