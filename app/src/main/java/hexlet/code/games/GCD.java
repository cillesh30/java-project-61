package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    private static final int GAME_COUNT = 3;
    private static final int MAX_NUMBER_1 = 100;
    private static final int MAX_NUMBER_2 = 100;
    private static String[][] questionAndAnswerArray = new String[GAME_COUNT][2];

    public static String[][] getQuestionAndAnswerArray() {
        return questionAndAnswerArray;
    }

    public static void gcdGame() {
        final var description = "Find the greatest common divisor of given numbers.";
        int i = 0;
        while (i < GAME_COUNT) {
            Random random = new Random();
            int number1 = random.nextInt(MAX_NUMBER_1) + 1;
            int number2 = random.nextInt(MAX_NUMBER_2) + 1;
            int minNumber = Math.min(number1, number2);
            int maxNumber = Math.max(number1, number2);


            int maxDivider = 1;
            for (int j = minNumber; j > 0; j = j - 1) {
                if (maxNumber % j == 0 && minNumber % j == 0) {
                    maxDivider = j;
                    break;
                }
            }
            String stringMaxDivider = Integer.toString(maxDivider);

            questionAndAnswerArray[i][0] = "Question: " + number1 + " " + number2;
            questionAndAnswerArray[i][1] = stringMaxDivider;
            i++;
        }
        Engine.makeAnswers(description, getQuestionAndAnswerArray());
    }
}
