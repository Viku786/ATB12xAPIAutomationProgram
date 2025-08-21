package com.thetestingacademy.Ex_06_Test_Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class APITesting_Lab26_RestAssured_Assertions {


    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String token;
    Integer BookingId;

    @Test
    public void test_Create_Booking_Post(){

        token = "896e4672e601214";
        BookingId = 4859;

        String  payload = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/");
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload).log().all();

        response = r.when().log().all().put();

        vr = response.then().log().all();
        vr.statusCode(200); //Rest Assured default Assertion

         vr.body("x.firstname", Matchers.equalTo("James"));
         vr.body("x.lastname", Matchers.equalTo("Brown"));

    }
}
