package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression {
    public static final int LIMIT_LENGTH_ARRAYS = 3;
    public static final int MIN_LENGTH_ARRAYS = 5;
    public static final int MAX_LENGTH_ARRAYS = 10;
    public static final int MAX_START_INDEX = 10;
    public static final int MAX_STEPS_ARRAYS = 8;
    public static final int MIN_VALUE = 2;
    public static void startGame() {
        Engine.start("What number is missing in the progression?", generateRoundData());
    }

public static String hiddenElement(int[] a, int b) {
    var result = new StringJoiner(" ");
    for (int i = 0; i < a.length; i++) {
        int element = a[i];
        if (i == b) {
            result.add("..");
        } else {
            result.add(String.valueOf(element));
        }
    }
    return result.toString();
}

public  static int[] generateSequence(int startIndex, int difference, int length) {
        int[] a = new int[length];
        a[0] = startIndex;
        int result = startIndex;
        for (int i = 0; i < a.length; i++) {
            result = result + difference;
            a[i] = result;
        }
        return a;
}

private static String[][] generateRoundData() {
    String[][] roundsData = new String[LIMIT_LENGTH_ARRAYS][2];
    for (int i = 0; i < LIMIT_LENGTH_ARRAYS; i++) {
        int randomLength = MIN_LENGTH_ARRAYS + Utils.generateRandomNumber(MAX_LENGTH_ARRAYS - MIN_LENGTH_ARRAYS + 1);
        int startIndex = MIN_VALUE + Utils.generateRandomNumber(MAX_START_INDEX - MIN_VALUE + 1);
        int difference = MIN_VALUE + Utils.generateRandomNumber(MAX_STEPS_ARRAYS - MIN_VALUE + 1);
        int[] a = generateSequence(startIndex, difference, randomLength);
        int randomNumber = Utils.generateRandomNumber(a.length - 1);
        var question = hiddenElement(a, randomNumber);
        var answer = String.valueOf(a[randomNumber]);
        roundsData[i] = new String[] {question, answer};
    }
    return roundsData;
    }
}
