import java.io.IOException;
import java.util.Scanner;

public class Q1A {

	public static void main(String[] args) {
		System.out.println("Enter the age of student");
		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt();
			try {
				if(age < 18) {
					throw new IOException("less than 18");
					}else {
					System.out.println("good to go");
				}
			}catch(Exception e) {
				System.out.println("exception handled");
			}
			System.out.print("rest of code runs fine");
			scn.close();

	}

}
