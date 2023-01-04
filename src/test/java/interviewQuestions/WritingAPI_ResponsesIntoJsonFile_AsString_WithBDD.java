package interviewQuestions;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.http.ContentType;

public class WritingAPI_ResponsesIntoJsonFile_AsString_WithBDD {
	@Test
	public void WritingResponseAsString() throws IOException
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
			.asString()
			.getBytes();
		
		File targetFileForString = new File("src/main/resources/targetFileForStringWithBDD.json");
		
		Files.write(response, targetFileForString);
	}

}
