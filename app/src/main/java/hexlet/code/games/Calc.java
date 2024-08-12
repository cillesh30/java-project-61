package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int GAME_COUNT = 3;
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static char someOperate() {
        char[] operate = {'+', '-', '*'};
        int index = Utils.generateNumber(0, operate.length - 1);
        return operate[index];
    }

    private static int calculate(int randomNumber1, int randomNumber2, char operate) {
        int result = 0;

        if (operate == '+') {
            result = randomNumber1 + randomNumber2;
        } else if (operate == '-') {
            result = randomNumber1 - randomNumber2;
        } else if (operate == '*') {
            result = randomNumber1 * randomNumber2;
        }
        return result;
    }

    public static void calcGame() {
        String[][] questionAndAnswer = new String[GAME_COUNT][2];
        final var description = "What is the result of the expression?";
        int i = 0;
        while (i < GAME_COUNT) {
            int randomNumber1 = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String stringRandomNumber1 = Integer.toString(randomNumber1);
            int randomNumber2 = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String stringRandomNumber2 = Integer.toString(randomNumber2);
            char operate = someOperate();

            int result = calculate(randomNumber1, randomNumber2, operate);
            String stringResult = Integer.toString(result);
            questionAndAnswer[i][0] = stringRandomNumber1
                        + " "
                        + operate
                        + " "
                        + stringRandomNumber2;
            questionAndAnswer[i][1] = stringResult;
            i++;
        }
        Engine.makeAnswers(description, questionAndAnswer);
    }
}
