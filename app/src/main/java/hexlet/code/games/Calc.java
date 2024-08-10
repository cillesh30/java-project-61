package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calc {
    private static final int GAME_COUNT = 3;
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static char someOperate() {
        Random random = new Random();
        char[] operate = {'+', '-', '*'};
        int index = random.nextInt(operate.length);
        return operate[index];
    }

    public static int someNumber1() {
        int randomNumber1 = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        return randomNumber1;
    }

    public static int someNumber2() {
        int randomNumber2 = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        return randomNumber2;
    }

    private static String calculate(int randomNumber1, int randomNumber2, char operate) {
        int result = 0;

        if (operate == '+') {
            result = randomNumber1 + randomNumber2;
        } else if (operate == '-') {
            result = randomNumber1 - randomNumber2;
        } else if (operate == '*') {
            result = randomNumber1 * randomNumber2;
        }
        String stringResult = Integer.toString(result);
        return stringResult;
    }

    public static void createQuestionAnswer() {
        String[][] questionAndAnswer = new String[GAME_COUNT][2];
        final var description = "What is the result of the expression?";
        int i = 0;
        while (i < GAME_COUNT) {
            int randomNumber1 = someNumber1();
            String stringRandomNumber1 = Integer.toString(randomNumber1);
            int randomNumber2 = someNumber2();
            String stringRandomNumber2 = Integer.toString(randomNumber2);
            char operate = someOperate();

            String stringResult = calculate(randomNumber1, randomNumber2, operate);
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

    public static void calcGame() {
        Calc.createQuestionAnswer();
    }
}
