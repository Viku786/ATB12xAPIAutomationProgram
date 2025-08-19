package com.thetestingacademy.Ex_04_RestAssured_HTTPS_Methods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab14_DELETE_NonBDD {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_Delete_Non_BDD(){
        String token = "6a749f11edc5ae8";
        String BookingId = "1608";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+BookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        // Delete required no Body

        response = r.when().delete();

        vr = response.then().log().all();
        vr.statusCode(201);
    }
}
