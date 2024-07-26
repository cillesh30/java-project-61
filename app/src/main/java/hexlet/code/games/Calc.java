package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final int GAME_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER_1 = 100;
    private static final int MAX_RANDOM_NUMBER_2 = 100;

    public static char someOperate() {
        Random random = new Random();
        char[] operate = {'+', '-', '*'};
        int index = random.nextInt(operate.length);
        return operate[index];
    }

    public static String[][] questionAndAnswerArray = new String[GAME_COUNT][2];

    public static void calcGame() {
        final var description = "What is the result of the expression?";

        Random random = new Random();
        int i = 0;

        while (i < GAME_COUNT) {
            int randomNumber1 = random.nextInt(MAX_RANDOM_NUMBER_1);
            int randomNumber2 = random.nextInt(MAX_RANDOM_NUMBER_2);
            int result = 0;
            char operate = someOperate();

            if (operate == '+') {
                result = randomNumber1 + randomNumber2;
            } else if (operate == '-') {
                result = randomNumber1 - randomNumber2;
            } else if (operate == '*') {
                result = randomNumber1 * randomNumber2;
            }

            String stringResult = Integer.toString(result);
            questionAndAnswerArray[i][0] = "Question: " + randomNumber1 + " " + operate + " " + randomNumber2;
            questionAndAnswerArray[i][1] = stringResult;
            i++;

        }
        Engine.makeAnswers(description, questionAndAnswerArray);
    }
}
