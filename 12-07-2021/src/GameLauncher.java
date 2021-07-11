import java.util.Scanner;

class GuessGame{
	Scanner scn = new Scanner(System.in);
//	System.out.println("Enter target");
	int target;
	void startGame(int target) {
		Player p1 = new Player();
		System.out.println("Enter Guess1");
		int g1 = p1.setGuess(scn.nextInt());
		Player p2 = new Player();
		System.out.println("Enter Guess2");
		int g2 = p2.setGuess(scn.nextInt());
		Player p3 = new Player();
		System.out.println("Enter Guess3");
		int g3 = p3.setGuess(scn.nextInt());
		this.target = target;
		if(g1 == this.target) {
			System.out.println("Player1 wins");
		}else {
			System.out.println("Player1 guess again");
		}
		if(g2 == this.target) {
			System.out.println("Player2 wins");
		}else {
			System.out.println("Player2 guess again");
		}
		if(g3 == this.target) {
			System.out.println("Player3 wins");
		}else {
			System.out.println("Player3 guess again");
		}
		
		
	}
}
class Player{
	int guess;
	int setGuess(int guess) {
		this.guess = guess;
		return this.guess;
	}
}
public class GameLauncher {
	public static void main(String[] args) {
		GuessGame game1 = new GuessGame();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the target");
		int target = scn.nextInt();
		game1.startGame(target);
	}

}
