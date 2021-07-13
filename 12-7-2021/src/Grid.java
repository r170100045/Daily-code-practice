
public class Grid {

	public static void main(String[] args) {
		int start = 5;
		int end = 6;
		for(int i=1; i<=9; i++) {
			for(int j=1; j<start; j++) {
				System.out.print("  ");
			}
			for(int j=start; j<=end; j++) {
				System.out.print(" -");
			}
			System.out.println();
//			for(int j=end+1; j
			if(i<5) {
				start--;
				end++;
			}else {
				start++;
				end--;
			}
		}
	}

}
