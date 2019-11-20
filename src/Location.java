import java.util.Random;  // Import Random
import java.util.Scanner;  //Import Scanner

public class Location {                                                                  // Creates class called Location

    private String locationName;                                                         // Declaring String parameter called LocationName
    private int locationNumber;                                                          // Declaring int parameter called buildingNumber
    private String category;                                                             //
    private String[][] questions;                                                        // Declaring a two-dimensional String array named questions, to be able to hold both question and answer.
    private char secretLetter;
    private boolean visited = false;

    public Location(String locationName, int locationNumber, String category, String[][] questions, char secretLetter) {    // Constructor for the Location class. Listing the different parameters used in the Location object.
        this.locationName = locationName;                                                // locationName initializes the field called houseName.
        this.locationNumber = locationNumber;                                            // initializes buildingNumber
        this.questions = questions;
        this.category = category;
        this.secretLetter = secretLetter;
    }
    public Location(String locationName) {                                               // Constructor for student administration
        this.locationName = locationName;                                                // locationName initializes the field called houseName.

    }

    public String getLocationName() {
        return locationName;
    }

    public int getLocationNumber() {
        return locationNumber;
    }

    public String getCategory() {
        return category;
    }

    public boolean getVisited() {     //
        return visited;
    }

    // New method to get a question and answer, returns char

    public char answerRoomQuestion() {
        if (visited) {
            System.out.println("You have visited this room, please go to one of the rooms you haven't visited yet.");

            return 0;                                                         // Exits method

        }
        Random rand = new Random();                                           // Declare random object
        Scanner in = new Scanner(System.in);                                  // Declare scanner object named "in".
        int counter = 0;                                                      // Declare a counter which counts the players guesses
        System.out.println(locationName);
        while (counter <= 5) {
            int random = rand.nextInt(questions.length);                      // Generates a random integer between 0-2
            System.out.println(questions[random][0]);                         // Prints a random question
            String answer = in.nextLine();
            if (answer.equals(questions[random][1])) {                        // Compares the players answer to the correct answer
                System.out.println("That is the correct answer! Good job. Which location do you want to visit now?");
                visited = true;
               return secretLetter;
            } else {
                System.out.println("Incorrect answer");
                counter++;
            }
        }
        return 0;                                                              // If counter goes over 5, then return 0
    }
}