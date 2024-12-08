package adrianretamosa.puzzlecombinationlocksfeature;

// Import the Arrays class:
import java.util.Arrays;

// Import the Scanner class to read user inputs:
import java.util.Scanner;

public class PuzzleCombinationLocksFeature {

    // Main method:
    public static void main(String[] args) {
        
        // Print a message indicating that the feature has been initialised:
        System.out.println("Puzzle Combination Lock Feature Initialised!");
        
        // Print the available symbols for the player:
        System.out.println("Available symbols: " + Arrays.toString(PuzzleGeneration.getSymbols()));
        
        // Generate a random combination using the PuzzleGenerator class:
        String[] combination = PuzzleGeneration.generateCombination();
        
        // The following line only has debugging purposes:
        System.out.println("(Debugging: Generated combination is " + Arrays.toString(combination) + ")");
        
        // Start a guessing game:
        int lives = 5; 
        System.out.println("Guess the combination by entering 4 symbols separated by spaces");
        System.out.println("You have " + lives + " lives left");

        // Open scanner for user input:
        Scanner scanner = new Scanner(System.in);
        
        // Add a boolean flag to track if the puzzle has been solved:
        boolean solved = false;

        // Loop while there are lives left and the puzzle is not solved:
        while (!solved && lives > 0) {
            System.out.print("Your guess: ");
            
            // Get user input as a single string:
            String input = scanner.nextLine(); 
            
            // Split the input into an array:
            String[] playerGuess = input.split(" "); 
            
            // Validate the guess:
            solved = PuzzleGeneration.validateCombination(combination, playerGuess);

            // Tell the user if they solved the puzzle or not:
            if (solved) {
                System.out.println("Congratulations! You solved the puzzle!");
            } else {
                
                // Take one life:
                lives--;
                
                // If the user still has lives:
                if (lives > 0) {
                    System.out.println("Incorrect combination. You have " + lives + " lives left. Try again.");
                } 
                
                // If the user ran out of lives:
                else {
                    System.out.println("You have no lives left. Game over!");
                }
            }
        }

        // Close the scanner at the very end:
        scanner.close();
    }
}
