package CRUD_With_BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class getSpecificProjectTest {
	@Test
	public void getSpecificProject()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		when()
			.get("/projects/TY_PROJ_403")
			
		.then()
			.assertThat().statusCode(200)
			.contentType(ContentType.JSON)
			.log().all();
	
	}
}
