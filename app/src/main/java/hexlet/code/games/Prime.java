package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    private static final int GAME_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 1000;

    public static void primeGame() {
        int i = 0;
        while (i < GAME_COUNT) {
            Random random = new Random();
            int randomNumber = random.nextInt(MAX_RANDOM_NUMBER) + 1;

            String rightAnswer = "yes";
            if (randomNumber <= 1) {
                rightAnswer = "no";
                break;
            } else {
                for (int k = 2; k <= Math.sqrt(randomNumber); k++) {
                    if (randomNumber % k == 0) {
                        rightAnswer = "no";
                        break;
                    }
                }
            }

            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'."
                    + "\nQuestion: " + randomNumber);
            System.out.println("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            Cli cli = new Cli();

            if (answer.equals("yes") && rightAnswer.equals("yes")) {
                System.out.println("Correct!");
                i = i + 1;
            } else if (answer.equals("no") && rightAnswer.equals("no")) {
                System.out.println("Correct!");
                i = i + 1;
            } else if (answer.equals("yes") && rightAnswer.equals("no")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + cli.getName() + "!");
                break;
            } else if (answer.equals("no") && rightAnswer.equals("yes")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + cli.getName() + "!");
                break;
            }
        }
        if (i == GAME_COUNT) {
            Random random = new Random();
            Cli cli = new Cli();
            System.out.println("Congratulations, " + cli.getName() + "!");
        }
    }
}
