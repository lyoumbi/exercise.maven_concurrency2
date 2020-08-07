package com.github.perschola;

public class ThreadPartThreeTest {
    public static void main(String[] args) {

        //Given
        Thread t1 = new Thread(new ThreadPartThree(), "My First Thread");
        Thread t2 = new Thread(new ThreadPartThree(), "My Second Thread");
        Thread t3 = new Thread(new ThreadPartThree(), "My Third Thread");

        //When
        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        t3.start();
    }
}
