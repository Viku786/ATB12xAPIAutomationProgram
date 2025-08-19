package com.thetestingacademy.Ex_05_TestNGExamples;

import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class APITesting_Lab17_TESTNG_Priority {

    @Test(priority = 1)
    public void test_t1(){
        System.out.println("1");
    }

    @Test(priority = 4)
    public void test_t4(){
        System.out.println("4");
    }

    @Test(priority = 3)
    public void test_t2(){
        System.out.println("3");
    }

    @Test(priority = 2)
    public void test_t3(){
        System.out.println("2");
    }

}
