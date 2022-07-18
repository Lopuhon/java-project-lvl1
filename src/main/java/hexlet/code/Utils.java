package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateRandomNumber(int highEdge) {
            Random random = new Random();
            highEdge = random.nextInt(highEdge);
            return highEdge;
    }
}
