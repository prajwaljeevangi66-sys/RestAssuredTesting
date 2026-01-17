package Day1;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class BasicAuthentication {
	
	@Test
	
	public void Body() {
		
		given()
		      .auth().basic("postman","password")
		     .when()
		         .get("https://postman-echo.com/basic-auth")
		      .then()
		          .statusCode(200)
		          .body("authenticated",Matchers.equalTo(true));
		          
		
		
	}

	

}
