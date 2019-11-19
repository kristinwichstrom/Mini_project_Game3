import java.util.Random;  // Import Random
import java.util.Scanner;  //Import Scanner

public class FinalGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);         //Declare scanner object named "in".
        Random rand = new Random();                  // Declare random object

        boolean userPlaying = true;                  // Declares boolean value called userPlaying as true. The boolean will be used to indicate whether the user is playing (by guessing correct or still playing) or not (guessing wrong)
        while (userPlaying) {
            System.out.println("\n\t\t\t\t\tWelcome the RUC Trivia game!\n" +
                    "\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                    "\nYour goal is to find a secret word and deliver it to the student administration. \n" +
                    "Each building holds a letter, where you'll have to collect each one of them to gather a word. " +
                    "\nBut it's not as simple as that. In each place you'll find a question  which you have to answer correctly." +
                    " You can guess 20 times before the game is over." +

                    " \n\nYou are now standing in the outside RUCs main entrance, next to the 'Kvadratroden'. To the left you can see the library, should we go in and see whats inside?\n"
                    + "\n\t\t\t Press 1 : enter\t\t Press 2: continue walking\t\t Press 3: Exit RUC campus");

            System.out.print("\n\t\t\t Type here: ");

            String input = in.nextLine();                           // Grabs next line from console

            while (!input.equals("1") && !input.equals("2") && !input.equals("3")) {
                System.out.println("This is an invalid command");

                input = in.nextLine();
            }
            if (input.equals("1")) {
                System.out.println("You are now standing inside the library in building x\n." +
                        "If you can guess the question in less than 20 tries, you will receive a letter and you are one step closer to the student administration");

            } else if (input.equals("2")) {

                System.out.println("The next building I can see is x in building x. \n" +
                        "Should we go in and see whats inside?\n" +
                        "\n" +
                        " \n\t\t\t Press 1 : Enter\t\t Press 2: Continue walking\t\t Press 3: Exit RUC campus");
                continue;

            } else if (input.equals("3")) {
                System.out.println("\nYou exit the RUC Campus, safe travels.");
                break;
            }
        }
        System.out.println("\nGame is over. Thank you for playing!"+
        "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
