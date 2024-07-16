package hexlet.code.games;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Progression {
    public static void progressionGame() {
        int i = 0;
        while (i < 3) {
            Random random = new Random();
            int progressionStep = random.nextInt(15) + 1;
            int firstNumber = random.nextInt(100) + 1;

            int[] array = new int[9];
            int j = 0;
            for (j = 0; j < array.length; j++) {
                array[j] = firstNumber;
                firstNumber = firstNumber + progressionStep;
            }

            int hiddenItemNumber = random.nextInt(9);
            int hiddenValueNumber = array[hiddenItemNumber];

            String[] hiddenArray = new String[9];
            for (int k = 0; k < 9; k++) {
                hiddenArray[k] = String.valueOf(array[k]);
            }
            hiddenArray[hiddenItemNumber] = "..";

            System.out.println("What number is missing in the progression?\n" +
                    "Question: " + Arrays.toString(hiddenArray));

            System.out.println("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();

            if (answer == hiddenValueNumber) {
                System.out.println("Correct!");
                i = i + 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + hiddenValueNumber + "'.");
                break;
            }
        }
        if (i == 3) {
            Random random = new Random();
            Cli cli = new Cli();
            System.out.println("Congratulations, " + cli.getName() + "!");
        }
    }
}
