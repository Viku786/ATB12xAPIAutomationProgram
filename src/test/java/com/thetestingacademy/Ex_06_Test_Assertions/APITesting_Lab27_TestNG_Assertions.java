package com.thetestingacademy.Ex_06_Test_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting_Lab27_TestNG_Assertions {

    @Test(enabled = true)
    public void test_Hard_Assertion_Example(){
        System.out.println("Start of the program");
        Assert.assertEquals("Vikash","vikash");
        System.out.println("End of the Program");
    }

    @Test
    public void test_Soft_Assertion_Example(){
        SoftAssert softassert = new SoftAssert();
        softassert.assertEquals("Vikash","vikash");
        System.out.println("End of the Program");
        softassert.assertAll();
    }
}
