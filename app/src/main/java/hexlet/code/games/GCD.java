package hexlet.code.games;
import java.util.Random;
import java.util.Scanner;

public class GCD {
//    public static int minNumber() {
//
//
//        Random random = new Random();
//        int number1 = random.nextInt(100);
//        int number2 = random.nextInt(100);
//        int minNumber = Math.min(number1, number2);
//    }

    public static void gcdGame() {
        int i = 0;
        while (i < 3) {
            Random random = new Random();
            int number1 = random.nextInt(100) + 1;
            int number2 = random.nextInt(100) + 1;
            int minNumber = Math.min(number1, number2);
            int maxNumber = Math.max(number1, number2);

            System.out.println("Find the greatest common divisor of given numbers." +
                    "\nQuestion: " + number1 + " " + number2);

//            int result = 0;

            int maxDivider = 1;
            for (int j = minNumber; j > 0; j = j - 1) {
                if (maxNumber % j == 0 && minNumber % j == 0) {
                    maxDivider = j;
                    break;
                }
            }

//            while (maxDivider > 0) {
//                if (maxNumber % maxDivider == 0 && minNumber % maxDivider == 0) {
//                    break;
//                } else
//                    maxDivider = minNumber - 1;
//            }

            System.out.println("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            Cli cli = new Cli();

            if (answer == maxDivider) {
                System.out.println("Correct!");
                i = i + 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + maxDivider + "'.");
                System.out.println("Let's try again, " + cli.getName() + "!");
                break;
            }

            }
        if (i == 3) {
            Random random = new Random();
            Cli cli = new Cli();
            System.out.println("Congratulations, " + cli.getName() + "!");
        }

    }
}

