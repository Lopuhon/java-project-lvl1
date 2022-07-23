package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final int NUMBER_RANDOM = 100;
    public static final int ARRAYS_LENGTH = 3;
    public static final char[] OPERATORS = {'+', '-', '*'};
    public static final int VARIANT_OPERATORS = 3;


    public static void startGame() {
        Engine.start("What is the result of the expression?", generateRoundData());
    }

    public static int calculate(int a, int b, char c) {
        return switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new RuntimeException("Unsupported operator");
        };
    }

    public static String[][] generateRoundData() {
        String[][] roundsData = new String[ARRAYS_LENGTH][2];
        for (int i = 0; i < roundsData.length; i++) {
            int firstNum = Utils.generateRandomNumber(NUMBER_RANDOM);
            int secondNum = Utils.generateRandomNumber(NUMBER_RANDOM);
            int v = Utils.generateRandomNumber(VARIANT_OPERATORS);
            char operator = OPERATORS[v];
            var question = firstNum + " " + operator + " " + secondNum;
            var answer = String.valueOf(calculate(firstNum, secondNum, operator));
            roundsData[i] = new String[]{question, answer};
        }
        return roundsData;

    }

}
