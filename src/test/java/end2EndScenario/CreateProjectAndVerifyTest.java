package end2EndScenario;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilities.BaseClassWithSpecBuilder;
import genericUtilities.EndPointsLibrary;
import io.restassured.response.Response;
import pojoClassForBDD.ProjectDetailsPojo;

public class CreateProjectAndVerifyTest extends BaseClassWithSpecBuilder {
	@Test
	public void createAndVerify() throws Throwable
	{
		//Step 1: Create Project using Post
		ProjectDetailsPojo pdp = new ProjectDetailsPojo("Pranshul","Charizard24","developing",56);
		
		Response response = given()
			.spec(requestSpec)
			.body(pdp)
			
		.when()
			.post(EndPointsLibrary.createProject);
		
		//Step 2: Capture the response and retrieve project ID
		String proID = rLib.getJsonData(response, "projectId");
		
		System.out.println(proID);
		
		//Step 3:
		String query = "select * from project;";
		String actData = dLib.executeQueryAndGetData(query, 1, proID);
		System.out.println(actData);
		
		//Step 4:Validate
		
		Assert.assertEquals(actData, proID);
		
		
		
		
		
	}
}
