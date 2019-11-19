import java.util.Random;  // Import Random
import java.util.Scanner;  //Import Scanner

public class FinalGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);         // Declare scanner object named "in".
        Random rand = new Random();                  // Declare random object
        Location location [] = new Location[10];     // Declare an array of Location objects

        location[0] = new Location("library", 26);
        location[1] = new Location("student house", 13);
        location[2] = new Location("RUC bar", 06);
        location[3] = new Location("canteen", 01);
        location[4] = new Location("HumTek house", 05);
        location[5] = new Location("FabLab", 06);
        location[6] = new Location("SamBas house", 06);
        location[7] = new Location("Solar pavilion", 01);
        location[8] = new Location("the big auditorium", 26);
        location[9] = new Location("the big auditorium", 13);
        location[10] = new Location("student administration", 06);

        while (true) {    //Start of while loop
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

                System.out.println("The next building I can see is x in building number x. \n" +
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
