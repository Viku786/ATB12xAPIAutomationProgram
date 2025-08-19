package com.thetestingacademy.Ex_04_RestAssured_HTTPS_Methods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab13_PATCH_NonBDD {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_Patch_Non_BDD(){
        String token = "925dcede9844278";
        String BookingId = "1608";

        String  payloadPatch = "{\n" +
                "    \"firstname\": \"Vikash\",\n" +
                "    \"lastname\": \"Singh\"\n" +
                "}\n";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+BookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payloadPatch).log().all();

        response = r.when().log().all().patch();

        vr = response.then().log().all();
        vr.statusCode(200);
    }
}
