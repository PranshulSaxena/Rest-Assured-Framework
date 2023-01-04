package interviewQuestions;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.http.ContentType;

public class WritingAPI_ResponsesIntoJsonFile_AsByteArray_WithBDD {
	@Test
	public void WritingResponseAsByte() throws Throwable
	{
		String jsonBody = "{\r\n"
				+ "   \"username\":\"admin\",\r\n"
				+ "   \"password\":\"password123\"\r\n"
				+ "}";
		
		byte[] response = given()
			.contentType(ContentType.JSON)
			.baseUri("https://restful-booker.herokuapp.com/auth")
			.body(jsonBody)
			
		.when()
			.post()
			
		.then()
			.extract()
			.response()
			.asByteArray();
		
		File targetFileForByteArray = new File("src/main/resources/targetFileForByteArrayWithBDD.json");
		
		Files.write(response, targetFileForByteArray);
	}

}
