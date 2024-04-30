package org.example;

import utility.collection.ArrayList;

public class Miner implements Runnable {
    private Mine mine;
    private Deposit deposit;

    public Miner(Mine mine, Deposit deposit) {
        this.mine = mine;
        this.deposit = deposit;
    }

    @Override
    public void run() {
        while (true) {
            // Mine valuable
            Valuable valuable = mine.generateValuable();

            // Put the valuable into the deposit
            try {
                ArrayList<Valuable> valuableList = new ArrayList<>();
                valuableList.add(valuable);
                deposit.put(valuableList);
                System.out.println("Miner put " + valuable.getType() + " into deposit.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Simulate mining time
            try {
                Thread.sleep(1000); // Adjust as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
