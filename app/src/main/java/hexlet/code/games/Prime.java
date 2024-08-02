package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    private static final int GAME_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 1000;
    private static String[][] questionAndAnswerArray = new String[GAME_COUNT][2];

    public static String[][] getQuestionAndAnswerArray() {
        return questionAndAnswerArray;
    }

    public static String[] definitionPrime() {
        Random random = new Random();
        int randomNumber = random.nextInt(MAX_RANDOM_NUMBER) + 1;
        String stringRandomNumber = Integer.toString(randomNumber);

        String rightAnswer = "yes";
        if (randomNumber <= 1) {
            rightAnswer = "no";
        } else {
            for (int k = 2; k <= Math.sqrt(randomNumber); k++) {
                if (randomNumber % k == 0) {
                    rightAnswer = "no";
                    break;
                }
            }
        }
        return new String[]{stringRandomNumber, rightAnswer};
    }

    public static void primeGame() {
        final var description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int i = 0;
        while (i < GAME_COUNT) {
            String[] questionAndAnswer = definitionPrime();

            questionAndAnswerArray[i][0] = "Question: " + questionAndAnswer[0];
            questionAndAnswerArray[i][1] = questionAndAnswer[1];
            i++;

        } Engine.makeAnswers(description, getQuestionAndAnswerArray());
    }
}
