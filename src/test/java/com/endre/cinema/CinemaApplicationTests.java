package com.endre.cinema;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertTrue;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CinemaApplicationTests {

    @LocalServerPort
    private int port = 0;

    private String path = "/movies";
    private int age = 15;


    @Before
    public void setUp() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }

    @Test
    public void successfullyGetListOfMovies() {

       given()
                .get(path)
                .then()
                .statusCode(200)
                .assertThat()
                .body("size()", greaterThan(0));
    }
}
