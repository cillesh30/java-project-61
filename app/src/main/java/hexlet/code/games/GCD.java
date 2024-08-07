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

    public static int minMaxNumber(boolean min) {
        Random random = new Random();
        int number1 = random.nextInt(MAX_NUMBER_1) + 1;
        int number2 = random.nextInt(MAX_NUMBER_2) + 1;
        int minNumber = Math.min(number1, number2);
        int maxNumber = Math.max(number1, number2);
        return min ? minNumber : maxNumber;
    }

    public static String maxDivider(int minNumber, int maxNumber) {
        int maxDivider = 1;
        for (int j = minNumber; j > 0; j = j - 1) {
            if (maxNumber % j == 0 && minNumber % j == 0) {
                maxDivider = j;
                break;
            }
        }
        String stringMaxDivider = Integer.toString(maxDivider);
        return stringMaxDivider;
    }

    public static void gcdGame() {
        final var description = "Find the greatest common divisor of given numbers.";
        int i = 0;
        while (i < GAME_COUNT) {
            int minNumber = minMaxNumber(true);
            int maxNumber = minMaxNumber(false);

            String stringMinNumber = Integer.toString(minNumber);
            String stringMaxNumber = Integer.toString(maxNumber);

            questionAndAnswerArray[i][0] = "Question: " + stringMinNumber + " " + stringMaxNumber;
            questionAndAnswerArray[i][1] = maxDivider(minNumber, maxNumber);
            i++;
        }
        Engine.makeAnswers(description, getQuestionAndAnswerArray());
    }
}
