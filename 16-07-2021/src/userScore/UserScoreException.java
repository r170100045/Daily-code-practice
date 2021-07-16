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
					String response = new String();
					while(true) {
						System.out.println("Do you want to enter another score?");
						response = scn.nextLine();
						if(response.equals("Y")||response.equals("Yes")) {
							break;
						}else if(response.equals("No")) {
							break;
						}else {
							System.out.println("enter valid input");
							continue;
						}
					}if(response.equals("Y")||response.equals("Yes")) {
						continue;
					}else if(response.equals("No")) {
						System.out.println("Bye!");
						return;
					}
					
				}
			}catch(NumberFormatException e) {
				System.out.println(e);
				System.out.println("You must enter a number for the score!");
				String response = new String();
				while(true) {
					System.out.println("Do you want to enter another score?");
					response = scn.nextLine();
					if(response.equals("Y")||response.equals("Yes")) {
						break;
					}else if(response.equals("No")) {
			break;
					}else {
						System.out.println("enter valid input");
						continue;
					}
				}if(response.equals("Y")||response.equals("Yes")) {
					continue;
				}else if(response.equals("No")) {
					System.out.println("Bye!");
					return;
				}
				
			}
			System.out.println("User entered a valid score");
			break;
		}
		
		
		
		
		
	}

}
