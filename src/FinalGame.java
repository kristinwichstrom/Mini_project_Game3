import java.util.Arrays;   // Import Arrays object
import java.util.Scanner;  // Import Scanner object

public class FinalGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                             // Declare scanner object named "in".
        Location location[] = new Location[11];                          // Declare an array of Location objects
        SecretWord secretWord = new SecretWord();                        // Declare secretWord object
        char[] secretLetter = secretWord.getRandomWord().toCharArray();  // Stores the random word as a char array
        char[] gatheredLetters = new char[10];                           // Declare char array with the size of 10 to store the letters

        /*
         * The two-dimensional String array stores two arrays; question and answer.
         * For each string there are three sets of questions and answers.
         */
        String questions1[][] = {{"What is the last name of danish writer that wrote 'The Little Mermaid'", "Andersen"}, {"What nationality was the playwright Henrik Ibsen?", "Norwegian"}, {"His last name is Potter, what is his first?", "Harry"},};
        String questions2[][] = {{"How many eyes does a bee have?", "Five"}, {"Do sponges have hearts?", "No"}, {"Which large animal eats bamboo?", "Panda"}};
        String questions3[][] = {{"What alcohol is often mixed with tonic?", "Gin"}, {"Which country invented tea?", "China"}, {"Which kind of alcohol is Russia notoriously known for?", "Vodka"}};
        String questions4[][] = {{"What’s the primary ingredient in hummus?", "Chickpeas"}, {"Which country is responsible for giving us pizza?", "Italy"}, {"What falling fruit supposedly inspired Isaac Newton to write the laws of gravity?", "Apple"}};
        String questions5[][] = {{"Is Java a type of OS?", "No"}, {"Which email service is owned by Microsoft?", "Hotmail"}, {"Which is the computer named after a fruit? ", "Apple"}};
        String questions6[][] = {{"Who is famous for The Theory of Relativity (last name)? ", "Einstein"}, {"Which plant has flowers but no leaves?", "Cactus"}, {"What organ of Albert Einstein was preserved after his death?", "Brain"}};
        String questions7[][] = {{"What is the Capital of USA?", "Washington DC"}, {"Which is the world's second highest mountain?", "K2"}, {"The biggest desert in the world is?", "Sahara"}};
        String questions8[][] = {{"Which planet is the hottest in the solar system?", "Venus"}, {"Which planet is the blue?", "Earth"}, {"Which planet is the red?", "Mars"}};
        String questions9[][] = {{"Which continent is the largest?", "Asia"}, {"Which country is the largest in area?", "Russia"}, {"Which planet is the largest?", "Jupiter"}};
        String questions10[][] = {{"Where did the ancient Olympic Games originate?", "Greece"}, {"Who was the first man to step on the moon (last name)?", "Armstrong"}, {"In which country are the ancient pyramids located?", "Egypt"}};

        // Declares the the individual location objects with matching parameters and variables.
        location[0] = new Location("Library", 26, "Literature", questions1, secretLetter[0]);
        location[1] = new Location("Student House", 14, "Animals", questions2, secretLetter[1]);
        location[2] = new Location("RUC bar", 13, "Drinks", questions3, secretLetter[2]);
        location[3] = new Location("Canteen", 01, "Foods", questions4, secretLetter[3]);
        location[4] = new Location("HumTek House", 06, "Technology", questions5, secretLetter[4]);
        location[5] = new Location("FabLab", 05, "Science", questions6, secretLetter[5]);
        location[6] = new Location("SamBas House", 21, "Geography", questions7, secretLetter[6]);
        location[7] = new Location("Solar Pavilion", 0, "The solar system", questions8, secretLetter[7]);
        location[8] = new Location("The big auditorium", 00, "Big things", questions9, secretLetter[8]);
        location[9] = new Location("The small auditorium", 44, "History", questions10, secretLetter[9]);

        // When the program is started, the following block of text is printed.
        System.out.println("\n\t\t\t\t\tWelcome the RUC Trivia game!\n" +
                "\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "\nYour goal is to find a secret word and deliver it to the student administration. \n" +
                "Each building holds a letter, and you must  collect each one of them to gather a word." +
                " You will have to visit ten different places, before your task is complete. " +
                "\nBut it's not as simple as that. Each place has it's own category, " +
                "where you will have to answer a question related the specific category." +
                "\nYou have five attempts per question before the game is over." +

                " \n\nYou are now standing in the outside RUCs main entrance, next to the 'Kvadratroden' monument. To the left you can see the library. \n" +
                "Now you have the option to choose which location to go to: \n");

                // The game executes inside the while loop
        while (true) {
            String visited = "";
                // The for loop goes through the different locations the player can visit, and prints a list of all the options
            for (int locationIndex = 0; locationIndex < location.length-1 ; locationIndex++) {        // -1 bak length pga. studieadmin.

                //If player has visited the location, print next line
                if (location[locationIndex].getVisited()) {
                    visited = "Visited";
                } else {
                    visited = "Not visited";
                }
                System.out.println("Choice: " + locationIndex + " | Location: " + location[locationIndex].getLocationName() + " | Category: " + location[locationIndex].getCategory() + " | " + visited);
            }
            System.out.println("\n--------------------------------------------------------------------------------------------------");
            System.out.println("These are the letters you have gathered until now: " + Arrays.toString(gatheredLetters)); // Prints a toString representation of the gathered letters
            System.out.println("If you have gathered all the letters type '10' to go to the student administration and hand it in.");
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.print("\nSo, where do you want to go?\nType here: ");

            /*
             * The try and catch statement is to prevent player from writing characters instead of numbers.
             * The try statement defines a block of code to be tested.
             * The catch statement catches this exception if it's thrown. If exception is thrown, the println is printed.
             */

            // Input is set to -1, if the user writes an invalid character the if sentence will not catch it as an valid input
            int input = -1;

            try {
                input = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException error) {      // NY: Her kan du også skrive Exeption e istedet, som tar alle feil
                System.out.println("\nPlease only write integers.");
            }
            // If statement checks whether the number is the given ones (between 0 and 10)
           // if (input < 0 || input > 11) {              / /FEIL: Her skulle det stått 10, hvis man skriver 11 kommer feilmelding
            if (input < 0 || input > 10) {                // RETTELSE
                System.out.println("\nThis an invalid command, please try again.\n");
                // If the user writes an invalid command continue with the loop
                continue;
            }
            /*
             * The if statement checks whether the player has gathered all the letters. If so, the player wins the game and a message is printed.
             * The program will exit afterwards.
             */
            if (input == 10) {
                if (Arrays.equals(gatheredLetters, secretLetter)) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                            "Congratulations you have now won the game! \n" +
                            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n ");
                    System.out.println("The secret word was: " + Arrays.toString(gatheredLetters));

                    System.exit(0);                 // Exits program
                } else {
                    System.out.print("\n-------------------------------------------------------------------------------\n");
                    System.out.print("You are now in the student administration.\nBut you have not gathered all the letters, please visit the remaining rooms.\n");
                    System.out.println("-------------------------------------------------------------------------------\n");
                }
            } else {
                gatheredLetters[input] = location[input].answerRoomQuestion();
            }

        }
    }
}
