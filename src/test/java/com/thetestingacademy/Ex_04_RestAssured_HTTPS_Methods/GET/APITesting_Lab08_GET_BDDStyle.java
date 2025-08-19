package com.thetestingacademy.Ex_04_RestAssured_HTTPS_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab08_GET_BDDStyle {

    //BDD Style
    String pincode;
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
