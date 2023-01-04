package CRUD_With_BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClassForBDD.ProjectDetailsPojo;

public class addProjectUsingPojoTest {
	@Test
	public void addProjectUsingPojo() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		ProjectDetailsPojo pdj = new ProjectDetailsPojo("PS","Acer","developed", 56);
		
		given()
			.contentType(ContentType.JSON)
			.body(pdj)
			
		.when()
			.post("/addProject")
			
		.then()
			.contentType(ContentType.JSON)
			.statusCode(201)
			.log().all();
		
	}
	

}
