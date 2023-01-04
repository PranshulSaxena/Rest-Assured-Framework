package PostRequestUsingDifferentWays;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequestUsingFile {
	
	@Test
	public void postRequestFile()
	{
		File file = new File("./src/main/resources/projectDetails.json");
		
		baseURI = "http://localhost";
		port = 8084;
		
		given()
			.body(file)
			.contentType(ContentType.JSON)

		.when()
			.post("./addProject")
			
		.then()
			.assertThat()
			.contentType(ContentType.JSON)
			.log().all();
	}

}
