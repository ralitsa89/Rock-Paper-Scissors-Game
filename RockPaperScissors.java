import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        {
            System.out.print("Choose [r]ock [p]aper or [s]cissors: ");
            String answer = scanner.next();
            String playerMove = "";
            if (answer.equals("r") || answer.equals("rock")) {
              playerMove += "rock";
                System.out.printf("You choose %s .%n", playerMove);
            } else if (answer.equals("p") || answer.equals("paper")) {
                playerMove += "paper";
               System.out.printf("You choose %s .%n", playerMove);
            } else if (answer.equals("s") || answer.equals("scissors")) {
                playerMove += "scissors";
                System.out.printf("You choose %s .%n", playerMove);
            } else {
                System.out.println("Invalid Input.Try again...");
                return;
            }
            Random random = new Random();
            int computerRandomNum = random.nextInt(3);
            String computerMove = "";
            switch (computerRandomNum){
                case 0:
                    computerMove = "rock";
                    break;
                case 1:
                    computerMove = "paper";
                    break;
                case 2:
                    computerMove = "scissors";
                    break;
            }
            System.out.printf("The computer choose %s.%n", computerMove);
            if(playerMove.equals("rock") && computerMove.equals("scissors") ||
                    playerMove.equals("paper") && computerMove.equals("rock") ||
                    playerMove.equals("scissors") && computerMove.equals("paper")){
                System.out.println("You win.");
            }else if(playerMove.equals("rock") && computerMove.equals("paper") ||
                    playerMove.equals("paper") && computerMove.equals("scissors") ||
                    playerMove.equals("scissors") && computerMove.equals("rock")){
                System.out.println("You lose.");
            }else {
                System.out.println("This game was a draw.");
            }
        }
    }
}