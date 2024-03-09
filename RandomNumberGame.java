package codsoftTask_1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); 
	        Random random = new Random(); 
	        
	        int minRange = 1;  
	        int maxRange = 100;  
	        int maxAttempts = 10;
	        
	        boolean playAgain = true;  // Variable to control whether the user wants to play again
	        int roundsPlayed = 0;  // Counter for the number of rounds played
	        int totalAttempts = 0;  // Counter for the total attempts made across all rounds
	        
	        while (playAgain) {  // Start the game loop for multiple rounds
	            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;  // Generate the target random number
	            int attempts = 0;  // Counter for the current round's attempts
	            roundsPlayed++;  // Increment the rounds played counter
	            
	            System.out.println("Round " + roundsPlayed + ":");
	            System.out.println("Guess the number between " + minRange + " and " + maxRange);
	            
	            while (attempts < maxAttempts) {  // Start the loop for guessing within a round
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();  // Read user's guess
	                attempts++;  // Increment the attempts counter
	                
	                if (userGuess == targetNumber) {
	                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	                    totalAttempts += attempts;  // Add the attempts to the total attempts counter
	                    break;  // Exit the loop if the guess is correct
	                } else if (userGuess < targetNumber) {
	                    System.out.println("Too low! Try again.");
	                } else {
	                    System.out.println("Too high! Try again.");
	                }
	            }
	            
	            if (attempts == maxAttempts) {
	                System.out.println("Sorry, you've reached the maximum number of attempts. The number was: " + targetNumber);
	            }
	            
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgainResponse = scanner.next();  // Ask the user if they want to play again
	            playAgain = playAgainResponse.equalsIgnoreCase("yes");  // Update the playAgain variable
	        }
	        
	        double averageAttemptsPerRound = (double) totalAttempts / roundsPlayed;  // Calculate average attempts per round
	        System.out.println("Game over. Rounds played: " + roundsPlayed);
	        System.out.println("Your average attempts per round: " + averageAttemptsPerRound);
	        
	        scanner.close();  // Close the scanner
	    }
	}

