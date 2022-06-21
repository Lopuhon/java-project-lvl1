package hexlet.code;
import java.util.Scanner;

public class App {
    public static String greet = "1 - Greet";
    public static String even = "2 - Even";
    public static String calc = "3 - Calc";
    public static void main(String[] args) {
        System.out.println("Please enter the game " +
                "number and press Enter.\n" +
                greet+ "\n" +
                even + "\n" +
                calc + "\n" +
                "0 - Exit\n" +
                "Your choice: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1 -> Cli.greeting();
            case 2 -> Even.startGame();
            case 3 -> Calc.startGame();
            case 0 -> System.out.println("Exit");
        }
    }
}
