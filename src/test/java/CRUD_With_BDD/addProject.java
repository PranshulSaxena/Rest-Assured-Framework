package CRUD_With_BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class addProject {
	@Test
	public void createProjectTest()
	{
		//Step 1:- Create Pre-requisite
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Pranshul");
		jobj.put("projectName", "Shark Tank1");
		jobj.put("Status", "Developing");
		jobj.put("teamSize", 10);
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 2:- Send the request
		given()
			.body(jobj)
			.contentType(ContentType.JSON)
		
		.when()
			.post("/addProject")
		
		.then()
			.assertThat().statusCode(201)
			.contentType(ContentType.JSON).log().all();
	}

}
