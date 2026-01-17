package Day1;

import java.net.ResponseCache;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import static io.restassured.RestAssured.*;

public class HTTP {
	public static void main(String[] args) {
//		RestAssured.baseURI = "https://fakestoreapi.com/products";
//		RequestSpecification requestSpec = RestAssured.given();
//		Response response = requestSpec.get();
//		System.out.println(response.prettyPrint());
		
		
		RestAssured.given()
		.when()
		   .get("https://fakestoreapi.com/products")
		   
		.then()
		    .log().all();
		
		
		
	}
	

}
