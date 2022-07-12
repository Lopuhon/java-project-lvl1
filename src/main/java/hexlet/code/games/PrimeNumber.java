package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {
    public static final int RANDOM = 100;
    public static final int LIMIT_LENGTH_ARRAYS = 3;

    public static void startGame() {
        Engine.start("Answer 'yes' if given number is prime. Otherwise answer 'no'.",generateRoundData());
    }

    public static boolean isNumberPrime(int number) {
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
    private static String[][] generateRoundData() {
        String[][] roundsData = new String[LIMIT_LENGTH_ARRAYS][2];
        for (int i = 0; i < LIMIT_LENGTH_ARRAYS; i++) {
            int number = Utils.generateRandomNumber(RANDOM);
            var answer = isNumberPrime(number) ? "yes" : "no";
            var question = String.valueOf(number);
            roundsData[i] = new String[] {question, answer};
        }
        return roundsData;
    }
}
