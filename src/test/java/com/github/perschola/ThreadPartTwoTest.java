package com.github.perschola;

public class ThreadPartTwoTest {
    public static void main(String[] args) {
        //Given
        Thread t1 = new Thread(new ThreadPartTwo());
        Thread t2 = new Thread(new ThreadPartTwo());
        Thread t3 = new Thread(new ThreadPartTwo());

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
