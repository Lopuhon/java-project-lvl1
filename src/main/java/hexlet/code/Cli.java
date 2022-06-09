package hexlet.code;
import java.util.Scanner;
public final class Cli {
    public  static void greeting() {
        String name;
        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }


}
