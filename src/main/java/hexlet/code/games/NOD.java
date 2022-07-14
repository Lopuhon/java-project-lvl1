package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class NOD {

    public static final int NUMBER_RANDOM = 100;
    public static final int ARRAYS_LENGTH = 3;

    public static void startGame() {
        Engine.start("Find the greatest common divisor of given numbers.", generateRoundData());
    }
    public static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
    public static String[][] generateRoundData() {
        String[][] roundsData = new String[ARRAYS_LENGTH][2];
        for (int i = 0; i < ARRAYS_LENGTH; i++) {
            int firstNum = Utils.generateRandomNumber(NUMBER_RANDOM);
            int secondNum = Utils.generateRandomNumber(NUMBER_RANDOM);
            var question = firstNum + " " + secondNum;
            var answer = String.valueOf(gcd(firstNum, secondNum));
            roundsData[i] = new String[]{question, answer};
        }
        return  roundsData;
}
}
