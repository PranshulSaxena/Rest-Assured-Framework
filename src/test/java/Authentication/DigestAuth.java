package Authentication;

import static io.restassured.RestAssured.*;

public class DigestAuth {
	
	public void authDigest()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		given()
			.auth()
			.digest("rmgyantra", "rmgy@9999")
			
		.when()
			.get("/login")
			
		.then()
			.assertThat()
			.log().all();
	}

}
