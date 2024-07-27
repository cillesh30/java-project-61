package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final int GAME_COUNT = 3;
    private static final int MAX_RANGE_DIGIT = 1000;
    public static String[][] questionAndAnswerArray = new String[GAME_COUNT][2];

    public static void evenGame() {
        final var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random random = new Random();
        int i = 0;

        while (i < GAME_COUNT) {
            int randomNumber = random.nextInt(MAX_RANGE_DIGIT) + 1;
            String stringRandomNumber = Integer.toString(randomNumber);

            String result = "";
            if (randomNumber % 2 == 0) {
                result = "yes";
            } else {
                result = "no";
            }

            questionAndAnswerArray[i][0] = "Question: " + stringRandomNumber;
            questionAndAnswerArray[i][1] = result;
            i++;
        }
        Engine.makeAnswers(description, questionAndAnswerArray);
    }
}
