package uploadAnddownloadImage;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

public class UploadImageTestWithBDD {

	@Test
	public void UploadImage()
	{
		File file = new File("C:\\Users\\acer\\Downloads\\BlackPanther.jpg");
		
		given()
			.multiPart("file", file, "multipart/form-data")
			.post("https://the-internet.herokuapp.com/upload")
			.thenReturn()
			.then().log().all();
		
			
	}
}
