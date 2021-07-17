import java.io.*;
import java.util.Scanner;
public class PhoneNumberAddress {
	public static void main(String [] args) throws IOException {
		BufferedWriter br = new BufferedWriter(new FileWriter("G:\\Beehyv\\combinations.txt"));
		char[][] letters = {{'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}, {'J', 'K', 'L'}, {'M', 'N', 'O'}, 
				{'P', 'R', 'S'}, {'T', 'U', 'V'}, {'W', 'X', 'Y'}};
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter the first digit");
		int first = scn.nextInt();// first number of the four digit number
		System.out.println("Enter the second digit");
		int second = scn.nextInt();
		System.out.println("Enter the third digit");
		int third = scn.nextInt();
		System.out.println("Enter the fourth digit");
		int fourth = scn.nextInt();
		int count = 1;// for numbering the letter combination
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					for(int l=0; l<3; l++) {
						br.write(letters[first-2][i]);
						br.write(letters[second-2][j]);
						br.write(letters[third-2][k]);
						br.write(letters[fourth-2][l]);
						br.write(" "+count+"\n");
						count++;
					}
				}
			}
		}
		br.close();
		scn.close();
	}



}
