package validation;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class StaticResponseValidation {
	@Test
	public void getAllProjects()
	{
		String expectedProjectName = "My Project";
		
		Response response = when().get("http://localhost:8084/projects");
		
		Object actualProjectName = response.jsonPath().get("[0].projectName");
	
		Assert.assertEquals(expectedProjectName, actualProjectName);
	}

}
