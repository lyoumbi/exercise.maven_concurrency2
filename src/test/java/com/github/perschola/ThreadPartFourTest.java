package com.github.perschola;

public class ThreadPartFourTest {
    public static void main(String[] args) {
        //Given
        Thread t1 = new Thread(new ThreadPartFour());
        Thread t2 = new Thread(new ThreadPartFour());
        Thread t3 = new Thread(new ThreadPartFour());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
