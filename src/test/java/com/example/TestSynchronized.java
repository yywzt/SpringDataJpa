package com.example;

import org.junit.Test;

/**
 * @author yanzt
 * @date 2019/4/10 17:27
 * @describe
 */
public class TestSynchronized {

    private int number = 100;

    @Test
    public void test(){
        for(int i=0;i<5;i++){
            new Thread(() -> {
                System.out.println("ThreadName: " + Thread.currentThread().getName());
                System.out.println("number-s: " + number--);
                System.out.println("number-e: " + number);
            }).start();
        }
    }

}