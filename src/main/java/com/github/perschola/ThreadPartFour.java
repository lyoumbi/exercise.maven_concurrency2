package com.github.perschola;

public class ThreadPartFour implements Runnable {

    @Override
    public void run() {
        int counter = 1;
        while(counter <= 3) {
            try {
                Thread.sleep(1000);
                System.out.println("running thread name is: " + Thread.currentThread().getName());
                System.out.println("running thread priority is: " + Thread.currentThread().getPriority());
                System.out.println("======================================");
                counter++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
