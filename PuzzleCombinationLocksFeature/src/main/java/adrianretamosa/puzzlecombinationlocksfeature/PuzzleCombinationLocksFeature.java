package adrianretamosa.puzzlecombinationlocksfeature;

// Main feature class:

import java.util.Arrays;

public class PuzzleCombinationLocksFeature {
    
    // Define a constant ArrayList to hold the symbols used in the combination locks:
    static String[] SYMBOLS = {"@", "#", "$", "%", "&", "*"};

    // Main method:
    public static void main(String[] args) {
        
        // Print a message indicating that the feature has been initialised:
        System.out.println("Puzzle Combination Lock Feature Initialised!");
        
        // Print the available symbols for the player:
        System.out.println("Available symbols: " + Arrays.toString(SYMBOLS));
        
        // Feature will continue here...
    }
}
