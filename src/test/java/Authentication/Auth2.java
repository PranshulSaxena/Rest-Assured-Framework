package Authentication;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Auth2 {
	@Test
	public void authentication()
	{
		
		//------------------For Token Generation------------------
		
		Response response = given().log().all()
			.formParam("client_id", "APPIS")
			.formParam("client_secret", "b176df1281f9c8f5aa099ce27beeb8ad")
			.formParam("grant_type", "client_credentials")
			.formParam("redirect_uri", "https://appis.com")
			.formParam("code", "authorization_code")
			
		.when()
			.post("http://coop.apps.symfonycasts.com/token");
			
		System.out.println(response);
		
		String token = response.jsonPath().getString("access_token");
		System.out.println("Token: "+token);
		
		//------------------For Authentication------------------
		
		given()
			.auth()
			.oauth2(token)
			.pathParam("userId", 4172)
			
		.when()
			.post("http://coop.apps.symfonycasts.com/api/{userId}/barn-unlock")
			
		.then()
			.log().all();
		
		
	}

}
