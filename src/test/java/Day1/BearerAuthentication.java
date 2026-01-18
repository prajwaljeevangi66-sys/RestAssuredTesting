package Day1;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class BearerAuthentication {
	
	@Test
	
	public void GetToken() {
		given()
		  .header("Authorization","Bearer ghp_MdvuDTgywxu86uHghgrip")
		.when()
		   .get("https://api.github.com/user/repos")
		 .then()
		    .statusCode(200)
		    .body("name[0]",Matchers.equalTo("Sample-Repo")).log().body();
		
		
		
	}
	
	
	

}
