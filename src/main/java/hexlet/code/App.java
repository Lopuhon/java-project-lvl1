package hexlet.code;

import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.NOD;

import java.util.Scanner;

public class App {
    private static String greet = "1 - Greet";
    private static String even = "2 - Even";
    private static String calc = "3 - Calc";
    private static String nod = "4 - NOD";
    private static String progression = "5 - progression";
    private static String prime = "6 - Prime number";
    public static void main(String[] args) {
        System.out.println("Please enter the game " +
                "number and press Enter.\n" +
                greet+ "\n" +
                even + "\n" +
                calc + "\n" +
                nod +"\n" +
                progression + "\n" +
                prime + "\n" +
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
            case 6 -> PrimeNumber.startGame();
            case 0 -> System.out.println("Exit");
        }
    }
}
