import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declarations
        String playerA;
        String playerB;
        String playAgain;
        boolean done=false;
        boolean doneA=false;
        boolean doneB=false;

        //outside loop for repeat of game
        do {
            System.out.println("Player A enter rock, paper, or scissors: [R,P,S]");
            playerA=input.next();

            //bulletproof input for player A
            do {
                if (playerA.equalsIgnoreCase("R")||(playerA.equalsIgnoreCase("P")||(playerA.equalsIgnoreCase("S")))) {
                doneA=true;
                } else {
                    System.out.println("Invalid input, please try again");
                    playerA=input.next();
                }
            } while (!doneA);
            //end of player A loop
            System.out.println();
            System.out.println("Player B enter rock, paper, or scissors: [R,P,S]");
            playerB=input.next();

            //bulletproof input for player B
            do {
                if (playerB.equalsIgnoreCase("R")||(playerB.equalsIgnoreCase("P")||(playerB.equalsIgnoreCase("S")))) {
                    doneB=true;
                } else {
                    System.out.println("Invalid input, please try again");
                    playerB= input.next();
                }
            } while (!doneB);
            //end of player B loop

            //game process
            if (playerA.equalsIgnoreCase("R")&&(playerB.equalsIgnoreCase("P"))) {
                System.out.println("Paper beats rock, player B wins!");
            } else if (playerA.equalsIgnoreCase("R")&&(playerB.equalsIgnoreCase("S"))) {
                System.out.println("Rock beats scissors, player A wins!");
            } else if (playerA.equalsIgnoreCase("R")&&(playerB.equalsIgnoreCase("R"))) {
                System.out.println("Tie, nobody wins!");
            } else if (playerA.equalsIgnoreCase("P")&&(playerB.equalsIgnoreCase("R"))) {
                System.out.println("Paper beats rock, player A wins!");
            } else if (playerA.equalsIgnoreCase("P")&&(playerB.equalsIgnoreCase("S"))) {
                System.out.println("Scissors beats paper, player B wins!");
            } else if (playerA.equalsIgnoreCase("P")&&(playerB.equalsIgnoreCase("P"))) {
                System.out.println("Tie, nobody wins!");
            } else if (playerA.equalsIgnoreCase("S")&&(playerB.equalsIgnoreCase("R"))) {
                System.out.println("Rock beats scissors, player B wins!");
            } else if (playerA.equalsIgnoreCase("S")&&(playerB.equalsIgnoreCase("P"))) {
                System.out.println("Scissors beats paper, player A wins!");
            } else if (playerA.equalsIgnoreCase("S")&&(playerB.equalsIgnoreCase("S"))) {
                System.out.println("Tie, nobody wins!");
            }

            //bulletproof input for play again
            System.out.println("Would you like to play again? : [Y,N]");
            playAgain=input.next();

            if (playAgain.equalsIgnoreCase("Y")) {
                done=false;
            } else if (playAgain.equalsIgnoreCase("N")) {
                done=true;
            } else {
                System.out.println("Invalid input, please try again");
            }
        } while (!done);
        System.out.println("Thanks for playing!");
    }
}