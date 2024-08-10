package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int GAME_COUNT = 3;
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 1000;

    private static Object[] isPrime() {
        int randomNumber = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        String stringRandomNumber = Integer.toString(randomNumber);

        boolean rightAnswer = true;
        if (randomNumber <= 1) {
            rightAnswer = false;
        } else {
            for (int k = 2; k <= Math.sqrt(randomNumber); k++) {
                if (randomNumber % k == 0) {
                    rightAnswer = false;
                    break;
                }
            }
        }
        return new Object[] {stringRandomNumber, rightAnswer};
    }

    public static void primeGame() {
        String[][] questionAndAnswer = new String[GAME_COUNT][2];
        final var description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int i = 0;
        while (i < GAME_COUNT) {
            Object[] result = isPrime();
            String question = (String) result[0];
            boolean isPrime = (boolean) result[1];

            String rightAnswer = isPrime ? "yes" : "no";

            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = rightAnswer;
            i++;

        } Engine.makeAnswers(description, questionAndAnswer);
    }
}
