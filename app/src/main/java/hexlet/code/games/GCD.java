package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int GAME_COUNT = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static int maxDivider(int minNumber, int maxNumber) {
        int maxDivider = 1;
        for (int j = minNumber; j > 0; j = j - 1) {
            if (maxNumber % j == 0 && minNumber % j == 0) {
                maxDivider = j;
                break;
            }
        }
        return maxDivider;
    }

    public static void gcdGame() {
        String[][] questionAndAnswer = new String[GAME_COUNT][2];
        final var description = "Find the greatest common divisor of given numbers.";
        int i = 0;
        while (i < GAME_COUNT) {
            int number1 = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int number2 = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int minNumber = Math.min(number1, number2);
            int maxNumber = Math.max(number1, number2);

            String stringMinNumber = Integer.toString(minNumber);
            String stringMaxNumber = Integer.toString(maxNumber);
            int maxDivider = maxDivider(minNumber, maxNumber);
            String stringMaxDivider = Integer.toString(maxDivider);

            questionAndAnswer[i][0] = stringMinNumber + " " + stringMaxNumber;
            questionAndAnswer[i][1] = stringMaxDivider;
            i++;
        }
        Engine.makeAnswers(description, questionAndAnswer);
    }
}
