package PostRequestUsingDifferentWays;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class PostRequestUsingJson {

	public void postRequestJson()
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
