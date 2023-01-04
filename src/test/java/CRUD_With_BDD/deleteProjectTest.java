package CRUD_With_BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class deleteProjectTest {
	@Test
	public void deleteProject()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		when()
			.delete("/projects/TY_PROJ_402")
			
		.then()
			.assertThat().statusCode(204)
			.contentType(ContentType.JSON)
			.log().all();
	}

}
