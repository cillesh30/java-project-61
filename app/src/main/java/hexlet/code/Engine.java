package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static void gameEngine() {
    System.out.println("Please enter the game number and press Enter." +
                    "\n1 - Greet" +
                    "\n2 - Even" +
                    "\n3 - Calc" +
                    "\n0 - Exit");

    Scanner scanner0 = new Scanner(System.in);
    int number = scanner0.nextInt();
//        if (number == 1) {
//            System.out.println("Welcome to the Brain Games!");
//            Scanner scanner2 = new Scanner(System.in);
//            Cli.userName(scanner2);
//        } else {
//            System.out.println("Incorrect number, please enter right number");
//        }

    Random random = new Random();

        switch (number) {
        case 1:
            System.out.println("Welcome to the Brain Games!");
            Scanner scanner2 = new Scanner(System.in);
            Cli.userName(scanner2);
            break;

        case 2:
            Scanner scanner3 = new Scanner(System.in);
            Cli.userName(scanner3);
            Even.evenGame();
            break;

        case 3:
            Scanner scanner4 = new Scanner(System.in);
            Cli.userName(scanner4);
            Calc.calcGame();
            break;

        case 0:
            break;

        default:
            System.out.println("Incorrect number, please enter right number");
        }

    }
}