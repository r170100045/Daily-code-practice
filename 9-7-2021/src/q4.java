import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
//			storing the details of all the employees in emp array.
			int [][] emp = new int [3][3];
			for(int i=0; i<3; i++) {
				for(int j=0; j<2; j++) {
					emp[i][j] = scn.nextInt();
				}
			}
			for(int i=0; i<3; i++) {
				if(emp[i][0]<=40) {
					System.out.println(emp[i][0]*emp[i][1]);
				}else {
					System.out.println(emp[i][1]*40 + ((float)emp[i][1]/2)*(emp[i][0]-40));
				}
			}
	}

}
