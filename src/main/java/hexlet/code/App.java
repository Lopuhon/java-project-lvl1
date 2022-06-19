package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game " +
                "number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit\n" +
                "Your choice: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1 -> Cli.greeting();
            case 2 -> Even.startGame();
            case 0 -> System.out.println("Exit");
        }
    }
}
