
package hexlet.code;

import hexlet.code.games.Cli;
//import hexlet.code.games.Even;
//import hexlet.code.games.GCD;
//import hexlet.code.games.Prime;
//import hexlet.code.games.Progression;
//import java.util.Random;
import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import java.util.Scanner;
import static hexlet.code.games.Calc.questionAndAnswerArray;


public class Engine {
    private static final int GAME_COUNT = 3;

    public static void makeAnswers(String description, Object[][] questionAndAnswerArray) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        int l = 0;
        while (l < GAME_COUNT) {
        System.out.println(questionAndAnswerArray[l][0]);
        System.out.println("Your answer: ");
        Scanner scanner2 = new Scanner(System.in);
        int answer = scanner2.nextInt();
        Object obj = questionAndAnswerArray[l][1];
        int elementValue = ((Number) obj).intValue();

        if (answer == elementValue) {
            System.out.println("Correct!");
            l = l + 1;

        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + elementValue + "'.");
            System.out.println("Let's try again, " + userName + "!");
            break;
        }
    }
            if (l == GAME_COUNT) {
        System.out.println("Congratulations, " + userName + "!");
    }
    }
}