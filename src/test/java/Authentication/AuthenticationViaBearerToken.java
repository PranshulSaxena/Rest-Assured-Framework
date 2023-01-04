package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AuthenticationViaBearerToken {
	@Test
	public void authThroughBearerToken()
	{
		baseURI = "https://api.github.com";
		
		JSONObject js = new JSONObject();
		js.put("name", "MyFirstRepoCreatedViaRestAssured");
		
		given()
			.auth()
			.oauth2("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")
			.body(js)
			.contentType(ContentType.JSON)
			
		.when()
			.post("/user/repos")
			
		.then()
			.assertThat()
			.statusCode(201)
			.log().all();
	}

}
