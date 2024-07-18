package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void evenGame() {
        Random random = new Random();
        int i = 0;
        while (i <3) {
            int randomNumber = random.nextInt(1000) + 1;
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'." +
                    "\nQuestion: " + randomNumber);
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
        if (i==3) {
            System.out.println("Congratulations, " + cli.getName() + "!");
        }
    }
}
