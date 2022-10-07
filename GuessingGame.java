import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int guessAmount = 0;
            int secretNum = random.nextInt(101);

            System.out.println("""
                    Welcome to the guessing game!
                    Guess a number between 0-100!
                    Good Luck!
                    """);

            while (true) {
                int guessInput;

                System.out.println("Enter number: ");
                guessInput = scan.nextInt();
                guessAmount++;

                if (guessCorrect(guessInput, secretNum)) {
                    System.out.println("You Won!\n");
                    System.out.println("It took you " + guessAmount + " times to guess the correct number.\n" +
                            "----------------------------------------------------------------------------------");
                    break;
                } else if (guessInput < secretNum) {
                    System.out.println("Higher! - Try again!\n");
                } else {
                    System.out.println("Lower! - Try again!\n");
                }
            }
        }

    }
    static boolean guessCorrect(int guessInput, int secretNum) {
        return guessInput == secretNum;
    }
}