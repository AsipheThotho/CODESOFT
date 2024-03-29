
package numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean replay;
        String replayInput;

        do {
            int attempts = 0;
            int randomNumber = random.nextInt(100) + 1; // Add 1 to ensure the number is between 1 and 100 
            int userGuess;
            
            System.out.println("===================================================");
            System.out.println("\t       Number Guessing Game!");
            System.out.println("===================================================");
            System.out.println("Guess a number between 1 and 100 in 5 attempts !!");
            System.out.println("===================================================");

            while (attempts < 5) {  // Limiting to 5 attempts
                
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    System.out.println("Your score is: "+ (10 - ((attempts)*2)+2)+" (The score starts at 10 and deducts 2 points for each attempt made)");
            
                    System.out.println("\nThank you for playing!");
                    System.exit(0);
                    
                } else if (userGuess < randomNumber) {
                    System.out.println("Try again! a HIGHER number this time");
                    
                } else {
                    System.out.println("Try again! a LOWER number this time");
                }
            }

            if (attempts == 5) {
                System.out.println("\nOhh Sorry, you've exceeded the maximum number of attempts. The correct number was: " + randomNumber);
                System.out.println("Your score is: "+ (10 - ((attempts)*2))+" (The score starts at 10 and deducts 2 points for each attempt made)");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            replayInput = scanner.next().toLowerCase();
            replay = replayInput.equals("yes") || replayInput.equals("ye")|| replayInput.equals("y");

        } while (replay);

        System.out.println("\nThank you for playing!");
        
    }
}