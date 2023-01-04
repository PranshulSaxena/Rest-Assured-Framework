package sendingRequestUsingGenerics;

import org.testng.annotations.Test;
import genericUtilities.BaseClassWithSpecBuilder;
import genericUtilities.EndPointsLibrary;
import pojoClassForBDD.ProjectDetailsPojo;

import static io.restassured.RestAssured.*;

public class addProject extends BaseClassWithSpecBuilder {
	
	@Test
	public void createProject()
	{
		ProjectDetailsPojo pdp = new ProjectDetailsPojo("Pranshul","ash","developing",56);
		
		given()
			.spec(requestSpec)
			.body(pdp)
			
		.when()
			.post(EndPointsLibrary.createProject)
			
		.then()
			.assertThat()
			.statusCode(201)
			.log().all();
	}

}
