package com.github.perschola;

public class Account implements Runnable {
    private static Double accountBalance;

    public Account() {
        accountBalance = 50D;
    }

    public void withdraw(Double amount) {
        accountBalance -= amount;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (Account.class) {
                if(accountBalance >= 10D) {
                    System.out.printf("\n%s is going to withdraw", Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                        withdraw(10D);
                        System.out.printf("\n%s completed the withdraw", Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.printf("\nNot enough in account for %s to withdraw %.2f", Thread.currentThread().getName(), accountBalance);
                }
            }
        }
    }
}
