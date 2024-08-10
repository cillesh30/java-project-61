package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int GAME_COUNT = 3;
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 100;

    public static int minMaxNumber(boolean min) {
        int number1 = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
        int number2 = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
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
        String[][] questionAndAnswer = new String[GAME_COUNT][2];
        final var description = "Find the greatest common divisor of given numbers.";
        int i = 0;
        while (i < GAME_COUNT) {
            int minNumber = minMaxNumber(true);
            int maxNumber = minMaxNumber(false);

            String stringMinNumber = Integer.toString(minNumber);
            String stringMaxNumber = Integer.toString(maxNumber);

            questionAndAnswer[i][0] = stringMinNumber + " " + stringMaxNumber;
            questionAndAnswer[i][1] = maxDivider(minNumber, maxNumber);
            i++;
        }
        Engine.makeAnswers(description, questionAndAnswer);
    }
}
