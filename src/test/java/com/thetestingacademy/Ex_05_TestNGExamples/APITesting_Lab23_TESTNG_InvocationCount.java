package com.thetestingacademy.Ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab23_TESTNG_InvocationCount {

    @Test(invocationCount = 2)
    public void test01(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 3)
    public void test02(){
        System.out.println("Bye");
    }
}
