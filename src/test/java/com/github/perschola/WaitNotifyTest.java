package com.github.perschola;

public class WaitNotifyTest {
    public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter1 = new Waiter(msg);
        Thread waiterThread1 = new Thread(waiter1, "waiter1");
        waiterThread1.start();
        Waiter waiter2 = new Waiter(msg);
        Thread waiterThread2 = new Thread(waiter2, "waiter2");
        waiterThread2.start();
        Notifier notifier = new Notifier(msg);
        Thread notifierThread = new Thread(notifier, "notifier");
        notifierThread.start();
        System.out.println("All the threads are started");
    }
}
