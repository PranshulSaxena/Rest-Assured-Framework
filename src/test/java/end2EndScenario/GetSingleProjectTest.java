package end2EndScenario;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import genericUtilities.BaseClassWithSpecBuilder;
import genericUtilities.EndPointsLibrary;
import genericUtilities.ExcelLibrary;
import io.restassured.http.ContentType;

public class GetSingleProjectTest extends BaseClassWithSpecBuilder{
	@Test
	public void getSingleProject() throws Throwable
	{
		ExcelLibrary eLib = new ExcelLibrary();
		String proID = eLib.readDataFromExcel("Sheet1", 0, 0);
		
		given()
			.spec(requestSpec)
			.pathParam("id", proID)
			
		.when()
			.get(EndPointsLibrary.getSingleProject+"{id}")
		
		.then()
			.assertThat()
			.contentType(ContentType.JSON)
			.statusCode(200)
			.log().all();
	}

}
