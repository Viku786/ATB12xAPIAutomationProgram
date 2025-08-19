package com.thetestingacademy.Ex_04_RestAssured_HTTPS_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab09_GET_NONBDD_Style {

            RequestSpecification r;
            Response response;
            ValidatableResponse vr;
            String pincode;

            @Test
            public void test_Get_NonBDD_Style(){

                 pincode ="560048";
                //Divide them into 3 parts
                //given() - Part1

                r = RestAssured.given();
                r.baseUri("https://api.zippopotam.us");
                r.basePath("/IN/"+pincode);

                //When - Part 2
                response = r.when().log().all().get();

                System.out.println(response.asString());

                //Then - Part 3 -> Validation
                vr = response.then().log().all();
                vr.statusCode(200);
                // Write the further test cases or assertions also here

            }

    @Test
    public void test_Get_NonBDD_Style2() {

        pincode = "@";
        //Divide them into 3 parts
        //given() - Part1

        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        //When - Part 2
        response = r.when().log().all().get();

        System.out.println(response.asString());

        //Then - Part 3 -> Validation
        vr = response.then().log().all();
        vr.statusCode(404);
    }

}
