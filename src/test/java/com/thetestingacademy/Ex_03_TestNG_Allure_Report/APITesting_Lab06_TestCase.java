package com.thetestingacademy.Ex_03_TestNG_Allure_Report;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06_TestCase {
    String pincode ;
    @Test
    public void test_GET_POSITIVE_TC1(){
        pincode ="842001";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)

                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }


}
