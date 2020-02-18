import java.util.Scanner;

public class Player {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = 1;

        do {
            try {
                System.out.println("Enter first num: ");
                int num1 = input.nextInt();
                System.out.println("Enter second num: ");
                int num2 = input.nextInt();
                int sum = num1 / num2;
                System.out.println(sum);

                x=2;
            }
            catch (Exception error) {
                System.out.println("You cannot do that");
            }
            } while (x==1);
        }
    }
