/*
 *  The location class hold the different variables and parameters
 */

import java.util.Random;  // Import Random
import java.util.Scanner;  //Import Scanner

public class Location {                                                                  // Creates class called Location

    private String locationName;                                                         // Declaring String parameter called LocationName
    private int locationNumber;                                                          // Declaring int parameter called buildingNumber
    private String category;                                                             // Declare String parameter for category
    private String[][] questions;                                                        // Declaring a two-dimensional String array named questions, to be able to hold both question and answer.
    private char secretLetter;
    private boolean visited = false;

    // Initialization constructor. Listing the different parameters used in the Location object.
    public Location(String locationName, int locationNumber, String category, String[][] questions, char secretLetter) { // this. kunne like så godt vært en annen verdi
        this.locationName = locationName;                                                // locationName initializes the field called houseName.
        this.locationNumber = locationNumber;                                            // initializes buildingNumber
        this.questions = questions;
        this.category = category;
        this.secretLetter = secretLetter;
    }

    /*
     * Getters for the parameters which is to be used. Enables access to parameters from other classes.
     */

    public String getLocationName() {
        return locationName;

    }

    public String getCategory() {
        return category;
    }

    public boolean getVisited() {     //
        return visited;
    }


    /*
     * Method to give player a question, get an answer and check whether this is correct. If correct return secretCharacter, mark location as visited and return.
     * For each time the player guesses wrong, the counter prints the remaining attempts.
     * If incorrect five times, leave location without marking as visited or returning secretLetter.
     */

    public char answerRoomQuestion() {
        if (visited) {
            System.out.println("You have visited this room, please go to one of the rooms you haven't visited yet.");

            //return 0;                                                             // FEIL
            return secretLetter;                                                    // Ny RETTELSE

        }
        Random rand = new Random();                                               // Declare random object
        Scanner in = new Scanner(System.in);                                      // Declare scanner object named "in".
        int counter = 0;                                                          // Declare a counter which counts the players guesses

        System.out.println("\nYou are now in the "+ locationName + " in building number " + locationNumber + ".");
        while (counter <= 4) {
            int random = rand.nextInt(questions.length);                          // Generates a random integer between 0-2 (the length of questions)
            System.out.println("Here is your question: " + questions[random][0]); // Prints a random question
            System.out.print("\nYour answer: ");
            String answer = in.nextLine();                                        // The answer from the user
            if (answer.equalsIgnoreCase(questions[random][1])) {                  // Compares the players answer to the correct answer and ignores whether the player writes case letters or not
                System.out.println("\nThat is the correct answer! Good job. Which location do you want to visit now?\n");
                visited = true;
               return secretLetter;
            } else {
                System.out.println("\nThat is an incorrect answer. Please try a new question.");
                //System.out.printf("\nYou have %d tries left before the game is over.\n", 5 - counter-1); // FEIL: HER SKULLE DET IKKE VÆRE -1 !!!
                System.out.printf("\nYou have %d tries left before the game is over.\n", 4 - counter);    // NY RETTELSE!!!
                counter++;
            }
        }
        System.out.println("\n\tThe game will now start again.");
        System.out.println("\t__________________________________\n");
        return 0;                                                               // If counter goes over 5, then return 0
    }
}
