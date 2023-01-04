package CRUD_With_BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getAllProjectsTest {
	@Test
	public void getAllProject()
	{
		baseURI = "http://localhost";
		port = 8084;
		
	   when()
	   		.get("/projects")
	   		
	   .then()
	   		.assertThat().statusCode(200)
	   		.contentType(ContentType.JSON)
	   		.statusLine("HTTP/1.1 200 ")
	   		.log().all();
	}

}
