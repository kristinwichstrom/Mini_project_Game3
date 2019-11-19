import java.util.ArrayList;

public class Questions {

    int maximumGuesses = 20;    // Variable of the maximum amount of guesses the player can have, before game over
    int actualGuesses = 0;      // Variable to count the actual guesses the player has has
    boolean questionFound = true;

    private String[] QUESTIONS = {"What is the Capital of USA?", "What Italian city has a leaning tower?", "What fictional detective lived at 221b baker Street (last name)"
            + "How many points does a snowflake traditionally have?", "Which email service is owned by Microsoft?", "What is often seen as the smallest unit of memory? (kilobyte)",
            " Is Java a type of OS?", "Which continent is the largest?", "How many Lord of the Rings films are there?", "Which kind of alcohol is Russia notoriously known for?", "Which animal can be seen on the Porsche logo?" +
            "What animals are pearls found in?"};

    private Questions ( int maximumGuesses, int actualGuesses, boolean questionFound) {
        this.maximumGuesses = maximumGuesses;
        this.actualGuesses = actualGuesses;
        this.questionFound = questionFound;

        }
    }
