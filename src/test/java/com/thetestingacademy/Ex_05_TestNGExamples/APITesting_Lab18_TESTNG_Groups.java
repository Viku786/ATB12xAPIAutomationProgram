package com.thetestingacademy.Ex_05_TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab18_TESTNG_Groups {

    @Test(groups = {"sanity","reg"})
    public void test_sanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"reg"})
    public void test_regRun(){
        System.out.println("Reg");
        Assert.assertTrue(true);
    }

    @Test(groups = {"smoke","reg"})
    public void test_smokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(true);
    }
}
