package adrianretamosa.puzzlecombinationlocksfeature;

// Import the Arrays class:
import java.util.Arrays;

// Add the random class to obtain arbitrary numbers:
import java.util.Random;

public class PuzzleGeneration {
    
    // Define a constant array for the symbols:
    private static final String[] SYMBOLS = {"@", "#", "$", "%", "&", "*"};
    private static final int COMBINATION_LENGTH = 4;
    
    // Method to generate a random combination of symbols:
    public static String[] generateCombination() {
        
        // Get a random object:
        Random random = new Random();
        
        // New string to hold the symbols:
        String[] combination = new String[COMBINATION_LENGTH];
        
        // Randomly pick symbols for the combination:
        for (int i = 0; i < COMBINATION_LENGTH; i++) {
            combination[i] = SYMBOLS[random.nextInt(SYMBOLS.length)];
        }
        
        // Return the combination string:
        return combination;
    }
    
    // Getter method:
    public static String[] getSymbols() {
        return SYMBOLS;
    }    
    
    // Validate the user's guess against the generated combination:
    public static boolean validateCombination(String[] combination, String[] playerGuess) {
        
        // Ensure the input length matches:
        if (playerGuess.length != 4) {
            System.out.println("Invalid guess length. Please enter exactly 4 symbols.");
            return false;
        }

        // Check if all symbols match:
        return Arrays.equals(combination, playerGuess);
    }
}
