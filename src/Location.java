import java.util.Random;  // Import Random
import java.util.Scanner;  //Import Scanner

public class Location {                                                                  // Creates class called Location

    private String locationName;                                                         // Declaring String parameter called LocationName
    private int locationNumber;                                                          // Declaring int parameter called buildingNumber
    private String category;                                                             //
    private String[][] questions;                                                      // Declaring a two-dimensional String array named questions, to be able to hold both question and answer.

    public Location(String locationName, int locationNumber, String category, String[][] questions) {    // Constructor for the Location class. Listing the different parameters used in the Location object.
        this.locationName = locationName;                                                // locationName initializes the field called houseName.
        this.locationNumber = locationNumber;                                            // initializes buildingNumber
        this.questions = questions;
        this.category = category;
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

    public String[][] getQuestions() {
        return questions;
    }                    // To be able to get the entire question array

    public String getQuestion(int index) {
        return questions[index][0];
    }     // To be able to get a question given index

    public String getAnswer(int index) {
        return questions[index][1];
    }       // To be able to get a answer given index

    // New method to get a question and answer

    public void answerRoomQuestion() {
        Random rand = new Random();                                           // Declare random object
        Scanner in = new Scanner(System.in);                                  // Declare scanner object named "in".
        int counter = 0;                                                      // Declare a counter which counts the players guesses
        System.out.println("Library");
        while (counter <= 5) {
            int random = rand.nextInt(questions.length);                      // Generates a random integer between 0-2
            System.out.println(questions[random][0]);                         // Prints a random question
            String answer = in.nextLine();
            if (in.equals(questions[random][1])) {                            // Compares the players answer to the correct answer
                System.out.println("That is the correct answer! Good job.");
                break;                                                       // Breaks out of while loop
            } else {
                System.out.println("Incorrect answer");

            }
        }
    }
}