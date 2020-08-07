package com.github.perschola;

import org.junit.Assert;
import org.junit.Test;

public class ThreadPartOneTest {
    public static void main(String[] args) {
        //Given
        Thread t1 = new Thread(new ThreadPartOne());
        Thread t2 = new Thread(new ThreadPartOne());

        //When
        t1.start();
        t2.start();
    }
}
