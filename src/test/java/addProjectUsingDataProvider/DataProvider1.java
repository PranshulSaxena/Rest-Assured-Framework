package addProjectUsingDataProvider;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClassForBDD.ProjectDetailsPojo;

public class DataProvider1 {
	@Test(dataProvider = "testBody")
	public void dataProvider(String createdBy, String projectName, String status, int teamSize)
	{
		ProjectDetailsPojo pdp = new ProjectDetailsPojo(createdBy, projectName, status, teamSize);
		baseURI = "http://localhost";
		port = 8084;
		
		given()
			.body(pdp)
			.contentType(ContentType.JSON)
			
		.when()
			.post("/addProject")
			
		.then()
			.assertThat()
			.contentType(ContentType.JSON)
			.and().statusCode(201)
			.and().log().all();
	}
	
	@DataProvider
	public Object[][] testBody(){
		Object[][] obj = new Object[2][4];
		obj[0][0] = "Pranshul Kid";
		obj[0][1] = "Play schools";
		obj[0][2] = "Babaji ka Thullu";
		obj[0][3] = 55;
		
		obj[1][0] = "Pranshul Papa";
		obj[1][1] = "Normal Schools";
		obj[1][2] = "Tum se na ho paayega";
		obj[1][3] = 105;
		
		return obj;
		
	}

}
