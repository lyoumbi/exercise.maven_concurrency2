package com.github.perschola;

public class AccountTest {
    public static void main(String[] args) {
        //Given
        Thread reema = new Thread(new Account(), "Reema");
        Thread ranjeet = new Thread(new Account(), "Ranjeet");
        Account account = new Account();

        //Then
        reema.start();
        ranjeet.start();
    }
}
