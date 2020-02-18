/*
 * The SecretWord class holds a String of the different words the player could have to guess.
 * Since the word is supposed to possibly vary, a method for getting a random word is created as well.
 */
import java.util.Random;    //Import random object

public class SecretWord {

    public String [] words = {"Mozzarella", "Intermezzo", "Chimpanzee", "Bamboozled", "Pickpocket", "Backgammon"};

    // Method for getting a random word
    public String getRandomWord() {

        Random rand = new Random();
        return words[rand.nextInt(words.length)]; // Generated a random number between 0-5 (length of String)
    }
}
