package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int GAME_COUNT = 3;
    private static final int MIN_RANGE_DIGIT = 0;
    private static final int MAX_RANGE_DIGIT = 1000;

    public static void evenGame() {
        String[][] questionAndAnswer = new String[GAME_COUNT][2];
        final var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int i = 0;
        while (i < GAME_COUNT) {
            int randomNumber = Utils.generateNumber(MIN_RANGE_DIGIT, MAX_RANGE_DIGIT);
            String stringRandomNumber = Integer.toString(randomNumber);

            String result = randomNumber % 2 == 0 ? "yes" : "no";

            questionAndAnswer[i][0] = stringRandomNumber;
            questionAndAnswer[i][1] = result;
            i++;
        }
        Engine.makeAnswers(description, questionAndAnswer);
    }
}
