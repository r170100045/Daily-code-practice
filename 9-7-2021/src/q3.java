import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int zeroc=0, negc=0, posc=0;
			for(int i=1; i<=5; i++){
				int a = scn.nextInt();
				if(a>0) {
					posc++;
				}else if(a<0) {
					negc++;
				}else {
					zeroc++;
				}
			}
			System.out.println(negc);
			System.out.println(posc);
			System.out.println(zeroc);
			
	}

}
