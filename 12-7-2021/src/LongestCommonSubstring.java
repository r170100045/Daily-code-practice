import java.util.Scanner;

public class LongestCommonSubstring {
	static String getLCS(String[] arr) {
		int n = arr.length;
		String s1 = arr[0];
		String lcs = "";
		int len = s1.length();
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<=len; j++) {
				String stem = s1.substring(i, j);
				int count=0;
				for(int k=1; k<n; k++) {
					count++;
					if(!arr[k].contains(stem))
						break;
				}
				if(count==n-1 && lcs.length()<stem.length()) {
					lcs = stem;
					
				}
			}
		}
		return lcs;

		
	}
	public static void main(String[] args) {
		String arr[] = { "grace", "graceful", "disgraceful","gracefully" };
		String stems = getLCS(arr);
		System.out.println(stems);
		
	}

}
