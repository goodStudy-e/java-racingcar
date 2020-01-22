package domain;

import java.util.Random;

public class RandomNumberGenerator {

    public int getRandomNumber() {
        final int bound = 9;
        Random random = new Random();
        return random.nextInt(bound);
    }

}
