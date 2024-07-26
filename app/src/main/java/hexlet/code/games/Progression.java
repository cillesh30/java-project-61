package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final int GAME_CONT = 3;
    private static final int MAX_PROGRESSION_STEP = 100;
    private static final int MAX_FIRST_NUMBER = 100;
    private static final int AMOUNT_OF_NUMBERS = 10;
    public static Object[][] questionAndAnswerArray = new Object[GAME_CONT][2];

    public static void progressionGame() {
        final var description = "What number is missing in the progression?";
        int i = 0;
        while (i < GAME_CONT) {
            Random random = new Random();
            int progressionStep = random.nextInt(MAX_PROGRESSION_STEP) + 1;
            int firstNumber = random.nextInt(MAX_FIRST_NUMBER) + 1;

            int[] array = new int[AMOUNT_OF_NUMBERS];
            int j = 0;
            for (j = 0; j < array.length; j++) {
                array[j] = firstNumber;
                firstNumber = firstNumber + progressionStep;
            }

            int hiddenItemNumber = random.nextInt(AMOUNT_OF_NUMBERS);
            int hiddenValueNumber = array[hiddenItemNumber];

            String[] hiddenArray = new String[AMOUNT_OF_NUMBERS];
            for (int k = 0; k < AMOUNT_OF_NUMBERS; k++) {
                hiddenArray[k] = String.valueOf(array[k]);
            }
            hiddenArray[hiddenItemNumber] = "..";

            StringBuilder sb = new StringBuilder();
            for (int m = 0; m < hiddenArray.length; m++) {
                sb.append(hiddenArray[m]);

                if (m < hiddenArray.length - 1) {
                    sb.append(" ");
                }
            }
            String result = sb.toString();

            questionAndAnswerArray[i][0] = result;
            questionAndAnswerArray[i][1] = hiddenValueNumber;
            i++;
        }
        Engine.makeAnswers(description, questionAndAnswerArray);
    }
}
