package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void userName(Scanner scanner) {
        System.out.println("May I have your name?");

        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}