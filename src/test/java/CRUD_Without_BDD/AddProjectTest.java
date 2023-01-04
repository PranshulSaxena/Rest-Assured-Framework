package CRUD_Without_BDD;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest {
	@Test
	public void addFirstProject()
	{
		//Create json body using json-simple
		JSONObject jObj = new JSONObject();
		jObj.put("Created By", "Prans");
		jObj.put("ProjectName", "Pikachu");
		jObj.put("Status", "created");
		jObj.put("Team Size", 150);
		
		//Pre-request for the script
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.body(jObj);
		reqSpec.contentType(ContentType.JSON);
		
		//Action
		Response response = reqSpec.post("http://localhost:8084/addProject");
		
		//Validation
//		System.out.println(response.getContentType());
//		System.out.println(response.getTime());
//		System.out.println(response.getTimeIn(TimeUnit.MILLISECONDS));
//		System.out.println(response.getSessionId());
		System.out.println(response.getStatusCode());
//		System.out.println(response.getStatusLine());
//		response.then().log().all();
//		response.prettyPeek();
//		System.out.println("=========================================");
//		response.then().assertThat().contentType(ContentType.JSON);
		//response.then().assertThat().time(lessThan(500));
		response.then().assertThat().statusCode(200);
		//response.then().assertThat().statusLine("Ok");
		
	}
}
