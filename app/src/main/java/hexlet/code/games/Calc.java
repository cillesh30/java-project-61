package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    private static final int GAME_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER_1 = 100;
    private static final int MAX_RANDOM_NUMBER_2 = 100;

    public static char someOperate() {
        Random random = new Random();
        char[] operate = {'+', '-', '*'};
        int index = random.nextInt(operate.length);
        return operate[index];
    }

    public static void calcGame() {
        System.out.println("What is the result of the expression?");

        Random random = new Random();
        int i = 0;
        Cli cli = new Cli();
        while (i < GAME_COUNT) {
            int randomNumber1 = random.nextInt(MAX_RANDOM_NUMBER_1);
            int randomNumber2 = random.nextInt(MAX_RANDOM_NUMBER_2);
            int result = 0;
            char operate = someOperate();

            if (operate == '+') {
                result = randomNumber1 + randomNumber2;
            } else if (operate == '-') {
                result = randomNumber1 - randomNumber2;
            } else if (operate == '*') {
                result = randomNumber1 * randomNumber2;
            }

            System.out.println("Question: " + randomNumber1 + " " + operate + " " + randomNumber2);
            System.out.println("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == result) {
                System.out.println("Correct!");
                i = i + 1;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + cli.getName() + "!");
                break;
            }
        }
        if (i == GAME_COUNT) {
            System.out.println("Congratulations, " + cli.getName() + "!");
        }
    }
}
