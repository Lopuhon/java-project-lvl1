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

    public static final int GREET_NUMBER = 1;
    public static final int EVEN_NUMBER = 2;
    public static final int CALC_NUMBER = 3;
    public static final int NOD_NUMBER = 4;
    public static final int PROGRESSION_NUMBER = 5;
    public static final int PRIME_NUMBER = 6;
    public static final int EXIT_NUMBER = 0;
    public static void main(String[] args) {
        System.out.println("Please enter the game "
                +
                "number and press Enter.\n"
                +
                greet
                + "\n" +
                even
                + "\n" +
                calc
                + "\n" +
                nod
                +"\n" +
                progression
                + "\n" +
                prime
                + "\n" +
                "0 - Exit\n"
                +
                "Your choice: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case GREET_NUMBER -> Cli.greeting();
            case EVEN_NUMBER -> Even.startGame();
            case CALC_NUMBER -> Calc.startGame();
            case NOD_NUMBER -> NOD.startGame();
            case PROGRESSION_NUMBER -> Progression.startGame();
            case PRIME_NUMBER -> PrimeNumber.startGame();
            case EXIT_NUMBER -> System.out.println("Exit");
            default -> System.out.println(" No more option. Try again");
        }
    }
}
