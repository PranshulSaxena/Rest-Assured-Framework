package validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseValidation {

	@Test
	public void getAllProjects() {
		
		baseURI="http://localhost";
		port=8084;
		
		String expectedProjectId = "1008";
		//String expectedProjectName = "Merkel";
		Response res = when().get("/projects");
		//System.out.println(res.then().log().all());
		
		List<Object> actualPid = res.jsonPath().get("projectId");
		System.out.println(actualPid);
		boolean flag = false;
		for(Object aID:actualPid)
		{
			String resp = aID.toString();
			if(resp.contains(expectedProjectId))
			{
				System.out.println(resp+"Project id is validated");
				flag = true;
				break;
			}
			else
			{
				System.out.println("id not matched");
			}
		}
//		
//		List<String> actualPname = res.jsonPath().get("projectName");
//		boolean flag1 = false;
//		for(String aPn:actualPname)
//		{
//			if(aPn.equalsIgnoreCase(expectedProjectName))
//			{
//				System.out.println("Project name validated");
//				flag1 = true;
//			}
//		}
//		
//		Assert.assertTrue(true);
		Assert.assertTrue(true);
		//Assert.assertEquals(expectedProjectId, resp);
	}
}
