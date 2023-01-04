package uploadAnddownloadImage;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class uploadImageTestWithoutBDD {

	@Test
	public void UploadImage()
	{
		File file = new File("C:\\Users\\acer\\Downloads\\BlackPanther.jpg");
		
		Response response = RestAssured
		.given()
			.multiPart("file", file, "multipart/form-data")
			.post("https://the-internet.herokuapp.com/upload")
			.thenReturn();
		
			response.prettyPrint();
		
		
		//	System.out.println(response.prettyPrint());
			
	}
}
