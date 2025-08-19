package com.thetestingacademy.Ex_05_TestNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_Lab25_TESTNG_MostlyUsed_Annotation {

    @BeforeTest
    void demo2(){
        System.out.println("Before Test");
    }

    @Test
    void demo5(){
        System.out.println("Test");
    }

    @AfterTest
    void demo7(){
        System.out.println("After Test");
    }
}
