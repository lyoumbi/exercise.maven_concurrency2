package com.github.perschola;

public class ThreadPartThree implements Runnable {
    private int counter = 1;

    public void run() {
        System.out.println(Thread.currentThread());
        while(counter <= 5) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(counter);
            counter++;
        }
    }
}
