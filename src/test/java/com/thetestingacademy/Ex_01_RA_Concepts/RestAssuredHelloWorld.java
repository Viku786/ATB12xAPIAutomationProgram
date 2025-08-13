package com.thetestingacademy.Ex_01_RA_Concepts;

import io.restassured.RestAssured;

public class RestAssuredHelloWorld {
    public static void main(String[] args) {


        //https://api.postalpincode.in/pincode/842001

        RestAssured.given().
                baseUri("https://api.postalpincode.in")
                .basePath("/pincode/842001")



                .when()
                .get()



                .then()
                .log().all().statusCode(200);
    }
}
