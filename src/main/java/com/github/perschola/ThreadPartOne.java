package com.github.perschola;

public class ThreadPartOne implements Runnable {
    private int counter = 1;

    public void run() {
        while(counter <= 4) {
            System.out.println(counter);
            counter++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
