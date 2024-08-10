package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class Progression {
    private static final int GAME_CONT = 3;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_PROGRESSION_STEP = 100;
    private static final int MAX_FIRST_NUMBER = 100;
    private static final int PROGRESSION_LENGTH = 10;

    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }

        return progression;
    }

    public static void progressionGame() {
        String[][] questionAndAnswer = new String[GAME_CONT][2];
        final var description = "What number is missing in the progression?";
        int i = 0;
        while (i < GAME_CONT) {
            Random random = new Random();
            int step = Utils.generateNumber(MIN_NUMBER, MAX_PROGRESSION_STEP);
            int first = Utils.generateNumber(MIN_NUMBER, MAX_FIRST_NUMBER);
            String[] array = makeProgression(first, step, PROGRESSION_LENGTH);

            int hiddenItemNumber = random.nextInt(PROGRESSION_LENGTH);

            String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);
            String answer = progression[hiddenItemNumber];

            progression[hiddenItemNumber] = "..";
            String question = String.join(" ", progression);

            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
            i++;
        }
        Engine.makeAnswers(description, questionAndAnswer);
    }
}
