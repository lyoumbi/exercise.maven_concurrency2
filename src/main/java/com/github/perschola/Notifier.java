package com.github.perschola;

public class Notifier implements Runnable {
    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }


    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (msg) {
            msg.setMessage(name + " Notifier word done");
            msg.notifyAll();
        }
    }
}
