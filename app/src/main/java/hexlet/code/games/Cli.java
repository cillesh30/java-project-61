package hexlet.code.games;
import java.util.Scanner;

public class Cli {
    private static String name;

    public static void userName(Scanner scanner) {
        System.out.println("May I have your name?");

        String name1 = scanner.nextLine();
        name = name1;
        System.out.println("Hello, " + name1 + "!");
    }

    public static String getName() {

        return name;
    }
}
