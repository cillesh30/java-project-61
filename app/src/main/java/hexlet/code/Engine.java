
package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static final int GREET = 1;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME = 6;
    private static final int EXIT = 0;

    public static void gameEngine() {
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n5 - Progression"
                + "\n6 - Prime"
                + "\n0 - Exit");

        Scanner scanner0 = new Scanner(System.in);
        int number = scanner0.nextInt();
        Random random = new Random();

        switch (number) {
            case GREET:
                System.out.println("Welcome to the Brain Games!");
                Scanner scanner2 = new Scanner(System.in);
                Cli.userName(scanner2);
                break;

            case GAME_EVEN:
                Scanner scanner3 = new Scanner(System.in);
                Cli.userName(scanner3);
                Even.evenGame();
                break;

            case GAME_CALC:
                Scanner scanner4 = new Scanner(System.in);
                Cli.userName(scanner4);
                Calc.calcGame();
                break;

            case GAME_GCD:
                Scanner scanner5 = new Scanner(System.in);
                Cli.userName(scanner5);
                GCD.gcdGame();
                break;

            case GAME_PROGRESSION:
                Scanner scanner6 = new Scanner(System.in);
                Cli.userName(scanner6);
                Progression.progressionGame();
                break;

            case GAME_PRIME:
                Scanner scanner7 = new Scanner(System.in);
                Cli.userName(scanner7);
                Prime.primeGame();
                break;

            case EXIT:
                break;

            default:
                System.out.println("Incorrect number, please enter right number");
        }

    }
}
