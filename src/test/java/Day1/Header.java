package Day1;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Header {

    @Test
    public void printAllHeaders() {

        given()
        .when()
            .get("https://fakestoreapi.com/products")
        .then()
            .log().headers();
    }

    @Test
    public void specificHeaders() {

        Response response =
            given()
            .when()
                .get("https://fakestoreapi.com/products");

        System.out.println(response.getHeader("Content-Type"));
    }
}
