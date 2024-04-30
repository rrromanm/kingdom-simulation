package org.example;

import utility.collection.ArrayList;

import java.util.Random;

public class ValuableTransporter implements Runnable {

    private Deposit deposit;
    private int quantity;
    private ArrayList<Valuable> transportedValuables;
    private Random rand;
    public ValuableTransporter(Deposit deposit){
        this.deposit = deposit;
        quantity = rand.nextInt(151) + 50;
        transportedValuables = new ArrayList<>();
    }
    @Override
    public void run() {
        while (true){
            int currentValuables = 0;
            while (currentValuables < quantity) {
                try {
                    // Get the next valuable from the deposit
                    ArrayList<Valuable> batch = deposit.take(1);
                    transportedValuables.addAll(batch);
                    currentWorth += calculateWorth(batch);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Sleep for a little while
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
