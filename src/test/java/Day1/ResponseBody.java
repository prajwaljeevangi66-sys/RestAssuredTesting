package Day1;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ResponseBody {
	
	@Test
	public void  SResponseBody() {
		
		given()
		 .when()
		     .get("https://fakestoreapi.com/products/1")
		  .then()
		       .log().body();
		
	}
//	"category": "men's clothing",
//	@Test
	
//	public void stringResponseBody() {
//		
//		
//		String responseBody = given()
//				             .when()
//				                 .get("https://fakestoreapi.com/products/1")
//				                 .getBody().asString();
//		Assert.assertTrue(responseBody.contains("men's clothing"));
//		
//	}
	
	
	@Test
	
	public void Validate() {
		
		given()
		     .when()
		          .get("https://fakestoreapi.com/products/1")
		      .then()
		           
		           .body("category",Matchers.equalTo("men  clothing")).log().body();
		
	}
	
	
	
	

}
