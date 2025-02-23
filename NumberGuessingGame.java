import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        System.out.println("Welcome to the Number Guessing Game!");

	        boolean playAgain = true;

	        while (playAgain) {int randomNumber = random.nextInt(100) + 1;
            int userGuess = 0;
            int attempts = 0;
            System.out.println("\nI have generated a number between 1 and 100. Can you guess it?");
            
            while (userGuess != randomNumber) {
                System.out.print("Enter your guess (or type -1 to quit): ");
                userGuess = scanner.nextInt();

                if (userGuess == -1) {
                    System.out.println("You chose to quit. The number was: " + randomNumber);
                    break;
                }
                System.out.println("\nI have generated a number between 1 and 100. Can you guess it?");
	            
	            while (userGuess != randomNumber) {
	                System.out.print("Enter your guess (or type -1 to quit): ");
	                userGuess = scanner.nextInt();
                    if (userGuess == -1) {
	                    System.out.println("You chose to quit. The number was: " + randomNumber);
	                    break;
	                }
	                System.out.print("\nDo you want to play again? (yes/no): ");
		            String response = scanner.next().toLowerCase();
		            playAgain = response.equals("yes");

		            if (!playAgain) {
		                System.out.println("Thank you for playing! Goodbye!");

		            }
	        }
	        }
	}
	}
}