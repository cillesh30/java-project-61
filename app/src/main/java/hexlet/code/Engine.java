
package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int GAME_COUNT = 3;

    public static void makeAnswers(String description, String[][] questionAndAnswerArray) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        int l = 0;
        for (String[] someString : questionAndAnswerArray) {
            System.out.println("Question: " + questionAndAnswerArray[l][0]);
            System.out.println("Your answer: ");
            Scanner scanner2 = new Scanner(System.in);
            String answer = scanner2.nextLine();
            String elementValue = someString[1];

            if (answer.equals(elementValue)) {
                System.out.println("Correct!");
                l = l + 1;

            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '"
                        + elementValue
                        + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
