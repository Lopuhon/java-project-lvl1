package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int NUMBER_RANDOM = 100;
    public static final int LENGTH_ARRAYS = 3;

    public static void startGame() {
        Engine.start("Answer 'yes' if number even otherwise answer 'no'.", generateRoundData());
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String[][] generateRoundData(){
        String[][] roundsData = new String[LENGTH_ARRAYS][2];
        for(int i = 0; i < LENGTH_ARRAYS; i++) {
            int number = Utils.generateRandomNumber(NUMBER_RANDOM);
            var question = String.valueOf(number);
            var answer = isEven(number) ? "yes" : "no";
            roundsData[i] = new String[] {question, answer};
        }
        return roundsData;
    }
}