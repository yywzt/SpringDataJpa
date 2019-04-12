package com.example;

import org.junit.Test;

import java.util.Date;

/**
 * @author yanzt
 * @date 2019/4/10 15:46
 * @describe
 */
public class TestDate {

    @Test
    public void test1(){

        Date start = new Date();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date end = new Date();
        System.out.println(start.before(end));
        System.out.println(start.after(end));
        System.out.println(start.equals(end));
        System.out.println(start.compareTo(end));
        System.out.println(end.compareTo(start));
    }
    @Test
    public void test2(){

        Date start = new Date();
        Date end = start;
        System.out.println(start.before(end));
        System.out.println(start.after(end));
        System.out.println(start.equals(end));
        System.out.println(start.compareTo(end));
    }

    @Test
    public void test3(){

        Date start = new Date();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date end = new Date();
        long l = end.getTime() - start.getTime();
        System.out.println();
        System.out.println(new Date(start.getTime()));
        System.out.println(new Date(end.getTime()));
    }
}
