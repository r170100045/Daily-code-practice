package userScore;

import java.util.Scanner;

public class UserScoreException {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a score");
			String score = scn.nextLine();
			try {
				int scoreInt = Integer.parseInt(score) ;
				try {
					if(scoreInt<0 || scoreInt>100) {
						throw new ScoreException("score exception found");
					}
				}catch (ScoreException e) {
					System.out.println(e);
					System.out.println("The score must be >= 0 and <= 100!");
					System.out.println("Do you want to enter another score?");
					String response = scn.nextLine();
					if(response.equals("Y")||response.equals("Yes")) {
						continue;
					}else if(response.equals("No")) {
						return;
					}
				}
			}catch(NumberFormatException e) {
				System.out.println(e);
				System.out.println("You must enter a number for the score!");
				System.out.println("Do you want to enter another score?");
				String response1 = scn.nextLine();
				if(response1.equals("Y")||response1.equals("Yes")) {
					continue;
				}else if(response1.equals("No")) {
					return;
				}
			}
			System.out.println("User entered a valid score");
			break;
		}
		
		
		
		
		
	}

}
