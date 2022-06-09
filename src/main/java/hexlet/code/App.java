package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game " +
                "number and press Enter.\n" +
                "1 - Greet\n" +
                "0 - Exit\n" +
                "Your choice: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1) {
            Cli.greeting();
        } else{ System.out.println("exit");}
    }
}
