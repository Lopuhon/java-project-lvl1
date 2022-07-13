package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateRandomNumber(int num) {
            Random random = new Random();
            num = random.nextInt(num);
            return num;
    }
}
