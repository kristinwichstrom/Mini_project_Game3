import java.util.Random;

public class SecretWord {

    public String [] words = {"Mozzarella", "Intermezzo", "Chimpanzzee", "Bamboozled", "Pickpocket", "Backgammon"};

    // Method for getting a random word
    public String getRandomWord() {

        Random rand = new Random();
        return words[rand.nextInt(words.length)];

    }
}
