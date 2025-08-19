package com.thetestingacademy.Ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab19_TESTNG_DependsOnMethods {

    @Test
    public void serverStartedOK(){
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOK")
    public void Test1(){
        System.out.println("Method 1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOK")
    public void Test2(){
        System.out.println("Method 2");
        Assert.assertTrue(true);
    }
}
