import java.util.Random;  // Import Random
import java.util.Scanner;  //Import Scanner

public class FinalGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);         // Declare scanner object named "in".
        Random rand = new Random();                  // Declare random object
        Location location[] = new Location[11];      // Declare an array of Location objects

        /**
         * The 2d String stores two arrays; question and answer.
         * For each string there are three sets of questions and answers.
         */
        String questions1[][] = {{"What is the last name of danish writer that wrote 'the little mermaid'", "Andersen"}, {"What nationality was the playwright Henrik Ibsen?", "Norwegian"}, {"His last name is Potter, what is his first?", "Harry"},};
        String questions2[][] = {{"How many eyes does a bee have?", "Five"}, {"Do sponges have hearts?", "no"}, {"Which large animal eats bamboo?", "Panda"}};
        String questions3[][] = {{"What alcohol is often mixed with tonic?", "Gin"}, {"Which country invented tea?", "China"}, {"Which kind of alcohol is Russia notoriously known for?", "Vodka"}};
        String questions4[][] = {{"What’s the primary ingredient in hummus?", "Chickpeas"}, {"Which country is responsible for giving us pizza?", "Italy"}, {"W", "2"}};
        String questions5[][] = {{"Is Java a type of OS?", "No"}, {"Which email service is owned by Microsoft?", "Hotmail"}, {"Which is the computer named after a fruit? ", "Apple"}};
        String questions6[][] = {{"Who is famous for The Theory of Relativity (last name)? ", "Einstein"}, {"Which plant has flowers but no leaves?", "Cactus"}, {"What organ of Albert Einstein was preserved after his death?", "Brain"}};
        String questions7[][] = {{"What is the Capital of USA?", "Washington DC"}, {"Which is the world's second highest mountain?", "K2"}, {"The biggest desert in the world is?", "Sahara"}};
        String questions8[][] = {{"Which planet is the hottest in the solar system?", "Venus"}, {"Which planet is the blue?", "Earth"}, {"Which planet is the red?", "Mars"}};
        String questions9[][] = {{"Which continent is the largest?", "Asia"}, {"Which country is the largest in area?", "Russia"}, {"Which planet is the largest?", "Jupiter"}};
        String questions10[][] = {{"Where did the ancient Olympic Games originate?", "Greece"}, {"Who was the first man to step on the moon (last name)?", "Armstrong"}, {"In which country are the ancient pyramids located?", "Egypt"}};

        // Declares the the individual location objects
        location[0] = new Location("Library", 26, "literature", questions1);
        location[1] = new Location("Student House", 14, "animals", questions2);
        location[2] = new Location("RUC bar", 13, "drinks", questions3);
        location[3] = new Location("Canteen", 01, "foods", questions4);
        location[4] = new Location("HumTek House", 06, "technology", questions5);
        location[5] = new Location("FabLab", 05, "science", questions6);
        location[6] = new Location("SamBas House", 21, "geography", questions7);
        location[7] = new Location("Solar Pavilion", 0, "the solar system", questions8);
        location[8] = new Location("The big auditorium", 00, "big things", questions9);
        location[9] = new Location("The small auditorium", 44, "history", questions10);
        location[10] = new Location("Student administration", 23, "o", questions4);

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

            // The for loop goes through the different locations the player can visit, and prints a list of all the options
            for (int locationIndex = 0; locationIndex < location.length - 1; locationIndex++) {

                System.out.println(locationIndex + " " + location[locationIndex].getLocationName() + " " + location[locationIndex].getCategory());

            }
            System.out.print("\nSo, where do you want to go?\nType here: ");

            int input = -1; //spør brage

            /**
             * The try and catch statement is to prevent player from writing characters instead of numbers.
             * The try statement defines a block of code to be tested, which in this case .....
             * While the catch statement catches this exception if it's thrown. If exception is thrown, the println is printed.
             */
            try {
                input = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException error) {
                System.out.println("\nPlease only write integers.");
            }
            // If statement checks whether the number is the given ones (between 0 and 9)
            if (input < 0 || input > 10) {
                System.out.println("\nThis an invalid command, please try again.");

                // If the user writes an invalid command continue with the loop
                continue;
            }
            /**
             * The switch statement is used for comparing the input from user to the different cases. There are 10 cases, representing the different buildings.
             * Once the case is located, and the input is correct, a the println is executed telling the player the name of the building that is chosen.
             * The break statement tells Java to break out of the switch, and continue on in the program.
             */
            switch (input) {

                case 0:
                    System.out.println("Library");
                    int random = rand.nextInt(location[input].getQuestions().length);
                    System.out.println(location[input].getQuestion());     // Calls the location object library and gets
                    break;
                case 1:
                    System.out.println("Student house");
                    break;
                case 2:
                    System.out.println("RUC bar");
                    break;
                case 3:
                    System.out.println("Canteen");
                    break;
                case 4:
                    System.out.println("HumTek house");
                    break;
                case 5:
                    System.out.println("FabLab");
                    break;
                case 6:
                    System.out.println("SamBas house");
                    break;
                case 8:
                    System.out.println("Solar pavilion");
                    break;
                case 9:
                    System.out.println("The big auditorium");
                    break;
                case 10:
                    System.out.println("The small auditorium");
                    break;
            }

        }
    }
}


//System.out.println("That is correct! Good job. Which building do you want to go to now?").
//System.out.println("Welcome to the student administration building. Do you have the secret word?" + "\nType here: )
//If (input == ) {
//System.out.println ("Congratulations! You have found the secret word!. Do You want to play again? Y/N?
//}