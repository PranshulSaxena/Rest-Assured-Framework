package CRUD_With_BDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class updateProjectTest {
	@Test
	public void updateProject()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Pran");
		jobj.put("projectName", "December28");
		jobj.put("status", "under Discussion");
		jobj.put("teamSize", 15);
		
		given()
			.body(jobj)
			.contentType(ContentType.JSON)
			
		.when()
			.put("/projects/TY_PROJ_403")
			
		.then()
			.assertThat().statusCode(200)
			.contentType(ContentType.JSON)
			.log().all();
		
			
		
		
		
	}

}
