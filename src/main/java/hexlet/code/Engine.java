package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS = 3;

    public static void start(String task, String[][] roundsData) {
        System.out.println("Welcome to the Brain Games!\nMay i have your name?");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello," + name +"!" + "\n" + task);

        for (int round = 0; round < ROUNDS; round++) {
            System.out.println("Question: " + roundsData[round][0]);
            System.out.println("Your answer:");
            String answer = sc.nextLine();

            if(roundsData[round][1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was: " +
                        roundsData[round][1] + " Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
