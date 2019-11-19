import java.util.Enumeration;
import java.util.Random;  // Import Random
import java.util.Scanner;  //Import Scanner

public class GameMain {

    public static void main (String [] args) {

        Scanner in = new Scanner (System.in);        //Decare scanner object named "in".
        Random rand = new Random();                  // Declare random object


        // Game variables
        String [] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        // Player variables
        int health = 100;
        int attackDamage = 50;
        int healthPotion = 3;
        int healthPotionHeal = 30;
        int healthDropChance = 50; //Percent

        boolean running = true;

        System.out.println("\n\t\t\tWelcome to mysterious RUC campus!\n" +
                "\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "\nYour goal is to find a secret word and deliver it to the student administration. \n" +
                "Each building holds a letter, where you'll have to collect each one of them to gather a word. " +
            "\nBut it's not as simple as that. In each place you'll find a riddle, where a teacher  ." +

                " \nYou are now standing in the outside RUCs main entrance, next to the 'Kvadratroden'.\n");

        GAME:     //labeled while loop 'GAME'
        while (running) {
            System.out.println ("------------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth); //From random to The maximum value
            String enemy = enemies [rand.nextInt(enemies.length)];
            System.out.println("\to " + enemy + " has appeared o\n");

while (enemyHealth > 0 ) {
    System.out.println("\tYour HP: " + health);
    System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
    System.out.println("\nWhat would you like to do?");
    System.out.println("\t1. Attack");
    System.out.println("\t2. Drink health potion");
    System.out.println("\t3. Run!");

    String input = in.nextLine();  //Grabs next line from console
if (input.equals("1")) {
    int damageDealt = rand.nextInt(attackDamage);
    int damageTaken = rand.nextInt(enemyAttackDamage);

    enemyHealth-= damageDealt;
    health-= damageTaken;

    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage");
    System.out.println("\t> You receive " + damageTaken + " retaliation!");

    if (health <=1) {
        System.out.println("\t you have taken too much damage");
        break;  //breaks us out of the while loop
    }
}
else if (input.equals("2")) {
    if (healthPotion > 0) {
        health += healthPotionHeal;
        healthPotion--;  //minus one from the health potion
        System.out.println("\t You drink a health potion, healing yourself for" + healthPotionHeal +"."
                + "\n\t you know have " + health +"HP."
                + "\n\t you have " + healthPotion + " health potions left.\n");
    }
    else {
        System.out.println("\t> You have no health potions left! Defeat enemy for the chance to get one!\n");
    }
}
else if (input.equals("3")) {
    System.out.println("\t You chose to run away from the " + enemy + "!");
    continue GAME; //moves on to the next iteration of the loop and finds a new enemy.
}
else {     //If user has not typed 1,2 or 3, return to top of loop
    System.out.println("\tInvalid command.");
}
}
if (health < 1)    {
    System.out.println("You came out of the dungeon, weak from battle.");
    break;
}
    System.out.println ("-----------------------------------------------------");
    System.out.println (enemy + " was defeated!");
    System.out.println(" You have" + health + " HP left");
   if (rand.nextInt(100)>healthDropChance)    {
       healthPotion ++;
       System.out.println("The " + enemy + " dropped a health potion.");
       System.out.println("You have" + healthPotion + " health potion(s). ");
    }
    System.out.println ("---------------------------------------");
       System.out.println ("What would you like to do?");
       System.out.println ("1. Continue fighting?");
       System.out.println ("2. Exit dungeon?");

       String input = in.nextLine();

       while (!input.equals("1") && !input.equals("2"))  {
           System.out.println("Invalid command");

           input = in.nextLine();
       }
       if (input.equals("1"))  {
           System.out.println("You continue the adventure");
       }
       else if (input.equals("2"))  {
           System.out.println("You exit the dungeon, successful adventures");
           break;
       }
       
        }
        System.out.println("Thanks for playing!");
        }
    }

