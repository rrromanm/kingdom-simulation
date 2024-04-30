package org.example;

import utility.collection.ArrayList;

public class Deposit
{
    private ArrayList<ArrayList<Valuable>> arrayList;
    public Deposit(){
        arrayList = new ArrayList<>();
    }
    public int size(){
        return arrayList.size();
    }
    public synchronized void put(ArrayList<Valuable> ores) throws InterruptedException{
        while(size() >= 100){
            wait();
        }
        arrayList.add(ores);
        notifyAll();
    }
    public synchronized ArrayList<Valuable> take(int numValuables) throws InterruptedException {
        return arrayList;
    }

}
