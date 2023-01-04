package CRUD_With_BDD1;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddProjectWithSameNameTest {
	@Test
	public void AddProjectWithSameName()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Pranshul");
		jobj.put("projectName", "Shark Tank1");
		jobj.put("Status", "Developing");
		jobj.put("teamSize", 10);
		
		given()
			.body(jobj)
			.contentType(ContentType.JSON)
			
		.when()
			.post("/addProject")
			
		.then()
			.assertThat()
			.statusCode(409)
			.contentType(ContentType.JSON)
			.log().all();
	}

}
