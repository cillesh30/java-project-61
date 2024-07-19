package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class Even {
    private static final int GAME_COUNT = 3;
    private static final int MAX_RANGE_DIGIT = 1000;

    public static void evenGame() {
        Random random = new Random();
        int i = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (i < GAME_COUNT) {
            int randomNumber = random.nextInt(MAX_RANGE_DIGIT) + 1;
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
            Scanner scanner2 = new Scanner(System.in);
            String answer = scanner2.nextLine();
            Cli cli = new Cli();
            if (answer.equals("yes") && randomNumber % 2 == 0) {
                System.out.println("Correct!");
                i = i + 1;
            } else if (answer.equals("yes") && randomNumber % 2 != 0) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + cli.getName() + "!");
                break;
            } else if (answer.equals("no") && randomNumber % 2 != 0) {
                System.out.println("Correct!");
                i = i + 1;
            } else if (answer.equals("no") && randomNumber % 2 == 0) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + cli.getName() + "!");
                break;
            } else {
                System.out.println("Wrond answer!");
                break;
            }
        }

        Cli cli = new Cli();
        if (i == GAME_COUNT) {
            System.out.println("Congratulations, " + cli.getName() + "!");
        }
    }
}
