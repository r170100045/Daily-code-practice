import java.util.Scanner;


class GuessGame {
    Player p1;
    Player p2;
    Player p3;

        void startGame() {
            p1 = new Player();
            p2 = new Player();
            p3 = new Player();

            int guessp1=0;
            int guessp2=0;
            int guessp3=0;

            boolean p1isright =false;
            boolean p2isright =false;
            boolean p3isright =false;

            int targetNumber =(int )(Math.random()*10);
            System.out.println("Target number is from 0-9");

            while(true) {
                System.out.println("Target number is "+targetNumber);

                p1.guess();
                p2.guess();
                p3.guess();

                guessp1 =p1.number;
                System.out.println("Player one guessed "+guessp1);

                guessp2 =p2.number;
                System.out.println("Player two guessed "+guessp2);

                guessp3 =p3.number;
                System.out.println("Player three guessed "+guessp3);

                if (guessp1==targetNumber) {
                    p1isright=true;
                }
                if (guessp2==targetNumber) {
                    p2isright=true;
                }
                if(guessp3==targetNumber) {
                    p3isright=true;
                }

                if(p1isright||p2isright||p3isright) {
                    System.out.println("Atleast one of the three guessed it right!");
                    System.out.println("Player one wins? "+p1isright);
                    System.out.println("Player two wins? "+p2isright);
                    System.out.println("Player three wins? "+p3isright);
                    break;
                }else {
                    System.out.println("All players will try again");
                }
            }
        }
}

class Player {
    int number;
        public void guess() {
            number=(int) (Math.random()*10);
        }
}
public class GameLauncher {
	public static void main(String[] args) {
		GuessGame game1 = new GuessGame();
		game1.startGame();
	}

}
