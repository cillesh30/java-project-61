package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int GAME_COUNT = 3;
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 1000;

    private static boolean isPrime(int numberX) {
        if (numberX < 2) {
            return false;
        } else {
            for (int k = 2; k <= Math.sqrt(numberX); k++) {
                if (numberX % k == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void primeGame() {
        String[][] questionAndAnswer = new String[GAME_COUNT][2];
        final var description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int i = 0;
        while (i < GAME_COUNT) {
            int randomNumber = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String stringRandomNumber = Integer.toString(randomNumber);
            boolean result = isPrime(randomNumber);

            String stringResult = result ? "yes" : "no";

            questionAndAnswer[i][0] = stringRandomNumber;
            questionAndAnswer[i][1] = stringResult;
            i++;

        } Engine.makeAnswers(description, questionAndAnswer);
    }
}
