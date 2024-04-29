package org.example;
import java.util.Random;

public class Mine
{
    private static Mine instance;
    private Random random;
    private Mine(){
        random = new Random();
    }

    public static Mine getInstance() {
        if (instance == null) {
            instance = new Mine();
        }
        return instance;
    }

    public Valuable generateValuable() {
        String[] valuableTypes = {"Diamond", "GoldNugget", "Jewel", "Ruby", "WoodenCoin"};
        String randomType = valuableTypes[random.nextInt(valuableTypes.length)];

        return Valuable.getInstance(randomType);
    }
}
