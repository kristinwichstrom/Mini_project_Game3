import java.util.Scanner;                                                                        //  Import Scanner
import java.util.Random;                                                                         //  Import Random (to select random words for array)

public class HangmanGame2 {

    public static void main(String[] args) {
        String[] secretWord = {
                "hello", "shirt", "apple", "horse", "snail"
        };                                                                                       // Declares String array called secretWord, and adds five elements to the array

        Scanner scanner = new Scanner(System.in);                                                // Declares Scanner variable called scanner to get input from user
        Random random = new Random();                                                            // Declares Random variable called random
        int maximumTries = 8;                                                                    // Declares int variable, gives it a value of 8 tries

        boolean userPlaying = true;                                                              // Declares boolean value called userPlaying as true. The boolean will be used to indicate whether the user is playing (by guessing correct or still playing) or not (guessing wrong)
        while (userPlaying) {                                                                    // Start of while loop: Everytime the loop starts it tests the variable userPlaying
            System.out.println("\nWelcome to the hangman game!\n" +
                    "Try to guess a word. You have the maximum of eight tries. Good luck.\n");   // While userPlaying is true, print this to screen
            char[] WordToGuess = secretWord[random.nextInt(secretWord.length)].toCharArray();    // Uses a random word from the secretWord array. Calls the random object and returns an int between 0 and length of the secretWord array (5). The toCharArray breaks down each letter of the word to single characters
            char[] guessesByPlayer = new char[WordToGuess.length];                               // Creates an empty char array to store user input to keep track of amount of tries

            for (int i = 0; i < secretWord.length; i++) {
                guessesByPlayer[i] = '•';                                                        // Creates a bullet to represent each character in the word
            }

            boolean wordFound = false;                                                           // Declare a boolean to indicate whether the user has or not found the word.
            int guesses = 0;                                                                     // Declare int to keep track of how many tries the user has had

            while (!wordFound && guesses != maximumTries) {                                      // While the user has not found the word and the amount of guesses is not equal to the maxiumum of tries the user has
                printArray(guessesByPlayer);                                                     // Prints bullets
                System.out.printf("\nYou have %d tries left before the game is over. ", maximumTries - guesses);
                System.out.println("\nPlease enter one character : ");
                char userInput = scanner.nextLine().charAt(0);                                   // Creates a new char array for the userInput and stores only the first letter

                guesses++;                                                                       // Increment guesses variable

                for (int i = 0; i < secretWord.length; i++) {
                    if (WordToGuess[i] == userInput) {                                           // If the user guesses a character which is equal to one of the words
                        guessesByPlayer[i] = userInput;                                          // Substitutes the bullets with the input from user
                    }
                    if (isWordFound(guessesByPlayer)) {                                          // If the word is completed by the user the wordFound must be true, and executes next lines of code
                        wordFound = true;
                        System.out.println("\nCongratulations!");
                        printArray(WordToGuess);                                                 // Prints the word the user i guessing
                        System.out.println("is the correct answer :)");
                    }
                }
                if (!wordFound) System.out.println("You've had the max amount of guesses."      // If the word is not found by the user, print this line + the the variable must be false.
                        + " The game is over...");
                userPlaying = false;
            }
        }
    }

    public static void printArray(char[] newArray) {                                           // Declares printArray. Used for printing char arrays
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }

    public static boolean isWordFound(char[] array) {                                        // Implementating isWordFound which takes in a char array
        for (int i = 0; i < array.length; i++) {
            if (array [i] == '•')
                return false;                                                                // If loop is executed and finds a bullet, then it must mean that the word is not guessed, and returns false
        }
        return true;                                                                        // If the for loop is executed and has not found any bullets, the word is guessed and return true
    }
}


