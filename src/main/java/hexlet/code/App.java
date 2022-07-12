package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.NOD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static String greet = "1 - Greet";
    public static String even = "2 - Even";
    public static String calc = "3 - Calc";
    public static String nod = "4 - NOD";
    public static String progression = "5 - progression";
    public static void main(String[] args) {
        System.out.println("Please enter the game " +
                "number and press Enter.\n" +
                greet+ "\n" +
                even + "\n" +
                calc + "\n" +
                nod +"\n" +
                progression + "\n" +
                "0 - Exit\n" +
                "Your choice: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1 -> Cli.greeting();
            case 2 -> Even.startGame();
            case 3 -> Calc.startGame();
            case 4 -> NOD.startGame();
            case 5 -> Progression.startGame();
            case 0 -> System.out.println("Exit");
        }
    }
}
