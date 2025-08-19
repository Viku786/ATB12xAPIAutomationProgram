package com.thetestingacademy.Ex_05_TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_Lab20_TESTNG_Parameter {

    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Hi , I am a demo");
        System.out.println("You are running this Parameter");

        if (value.equalsIgnoreCase("firefox")){
            System.out.println("Start the Firefox");
        }

        if (value.equalsIgnoreCase("chrome")){
            System.out.println("Start the Chrome");
        }
    }
}
