package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final int GAME_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER_1 = 100;
    private static final int MAX_RANDOM_NUMBER_2 = 100;
    private static String[][] questionAndAnswerArray = new String[GAME_COUNT][2];

    public static String[][] getQuestionAndAnswerArray() {
        return questionAndAnswerArray;
    }

    public static char someOperate() {
        Random random = new Random();
        char[] operate = {'+', '-', '*'};
        int index = random.nextInt(operate.length);
        return operate[index];
    }

    public static int someNumber1() {
        Random random = new Random();
        int randomNumber1 = random.nextInt(MAX_RANDOM_NUMBER_1);
//
        return randomNumber1;
    }

    public static int someNumber2() {
        Random random = new Random();
        int randomNumber2 = random.nextInt(MAX_RANDOM_NUMBER_2);
//        String StringRandomNumber2 = Integer.toString(randomNumber2);
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

    public static void createArray() {
        final var description = "What is the result of the expression?";
        int i = 0;
        while (i < GAME_COUNT) {
            int randomNumber1 = someNumber1();
            String stringRandomNumber1 = Integer.toString(randomNumber1);
            int randomNumber2 = someNumber2();
            String stringRandomNumber2 = Integer.toString(randomNumber2);
            char operate = someOperate();

            String stringResult = calculate(randomNumber1, randomNumber2, operate);
            questionAndAnswerArray[i][0] = "Question: "
                    + stringRandomNumber1
                    + " "
                    + operate
                    + " "
                    + stringRandomNumber2;
            questionAndAnswerArray[i][1] = stringResult;
            i++;

        }
        Engine.makeAnswers(description, getQuestionAndAnswerArray());
    }

    public static void calcGame() {
        Calc.createArray();
    }
}
