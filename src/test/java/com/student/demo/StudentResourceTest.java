package com.student.demo;

import io.quarkus.test.junit.QuarkusTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class StudentResourceTest {

    @Test
    public void hello() {
        given()
          .when().get("/student/test")
          .then()
             .body(is("hello"));
    }


    @Test
    public void helloTest() {
      String content="hello";
      assertEquals(content,"hello");
    }
}