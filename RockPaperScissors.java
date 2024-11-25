import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Main game loop
        //Keeps the game running until the user decides to stop.
        while (true) {


            // Array declaration containing the possible moves
            String[] rockPaperScissors = {"Rock", "Paper", "Scissors"};
            
            // Randomly selected from the rockPaperScissors array.
            String machineMoves = rockPaperScissors[new Random().nextInt(rockPaperScissors.length)];

            String endUserMove;
            //User input Loop
            // Ensures the user enters a valid move by prompting until a valid input is received
            while (true) {
                System.out.println("Please type your move (Rock, Paper, Scissors):");
                endUserMove = scanner.nextLine().toLowerCase(); // Convert to lowercase for case insensitivity
                if (endUserMove.equals("rock") || endUserMove.equals("paper") || endUserMove.equals("scissors")) {
                    break; // Exit loop if the user input is valid
                }
                System.out.println(endUserMove + " is not a valid move. Please try again."); // Prompt the user to re-enter a valid move
            }



            // Display the computer's move
            System.out.println("Machine has played: " + machineMoves);

            // Convert machine move to lowercase for case insensitivity
            String machineMovesLower = machineMoves.toLowerCase();

            // Determines the result of the game
            if (endUserMove.equals(machineMovesLower)) {
                System.out.println("The game was a tie!");
            } else if (endUserMove.equals("rock")) {
                if (machineMovesLower.equals("paper")) {
                    System.out.println("You Lose!");
                } else if (machineMovesLower.equals("scissors")) {
                    System.out.println("You Win!");
                }
            } else if (endUserMove.equals("paper")) {
                if (machineMovesLower.equals("scissors")) {
                    System.out.println("You Lose!");
                } else if (machineMovesLower.equals("rock")) {
                    System.out.println("You Win!");
                }
            } else if (endUserMove.equals("scissors")) {
                if (machineMovesLower.equals("rock")) {
                    System.out.println("You Lose!");
                } else if (machineMovesLower.equals("paper")) {
                    System.out.println("You Win!");
                }
            }

            // Ask the user if they want to play again
            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine().toLowerCase(); // Convert to lowercase for case insensitivity

            // Exit the loop if the user does not want to play again
            if (!playAgain.equals("y")) {
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
