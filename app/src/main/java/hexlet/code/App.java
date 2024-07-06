package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter." +
                "\n1 - Greet" +
                "\n2 - Even" +
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

            case 0:
                break;

            default:
                System.out.println("Incorrect number, please enter right number");
        }

    }

}


