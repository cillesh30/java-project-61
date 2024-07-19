package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
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

        int gameCount = 3;
        while (i < gameCount) {
            int maxRandomNumber1 = 100;
            int maxRandomNumber2 = 100;
            int randomNumber1 = random.nextInt(maxRandomNumber1);
            int randomNumber2 = random.nextInt(maxRandomNumber2);
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
        if (i == gameCount) {
            System.out.println("Congratulations, " + cli.getName() + "!");
        }
    }
}
