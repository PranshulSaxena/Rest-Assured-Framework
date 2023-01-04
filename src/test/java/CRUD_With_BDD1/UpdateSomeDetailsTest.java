package CRUD_With_BDD1;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateSomeDetailsTest {
	@Test
	public void UpdateSomeDetails()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Pranshul Saxena");
		jobj.put("projectName", "october1217");
		jobj.put("status", "Developing");
		jobj.put("teamSize", 24);
		
		given()
			.body(jobj)
			.contentType(ContentType.JSON)
			
		.when()
			.put("/projects/TY_PROJ_404")

		.then()
			.statusCode(200)
			.contentType(ContentType.JSON)
			.statusLine("HTTP/1.1 200 ")
			.log().all();
		
		
	}
}
