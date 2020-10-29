package com.cbellmont;

import java.util.Random;

public class Dormilon extends Thread {

    final int numRepeticiones = 5;

    private Callback callback;

    Dormilon(Callback callback){
        this.callback = callback;
    }

    @Override
    public void run() {
        try {
            Random r = new Random();
            for (int i = 0; i < numRepeticiones; i++) {
                int sleepingTime = r.nextInt(7000) + 1000;
                sleep(sleepingTime);
                callback.iterationDone(i,getName(), sleepingTime);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
