package PostRequestUsingDifferentWays;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequestUsingHashMap {
	@Test
	public void postRequestHashMap()
	{
		HashMap hp = new HashMap();
		hp.put("createdBy", "Pranshul");
		hp.put("projectName", "Bulwasor");
		hp.put("status", "Pata nahi");
		hp.put("teamSize", 15);
		
		baseURI = "http://localhost";
		port = 8084;
		
		given()
			.body(hp)
			.contentType(ContentType.JSON)
			
		.when()
			.post("/addProject")
			
		.then()
			.assertThat()
			.statusCode(201)
			.contentType(ContentType.JSON)
			.log().all();
	}

}
