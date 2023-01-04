package interviewQuestions;

import java.io.File;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WritingAPI_ResponsesIntoJsonFile_AsString_WithoutBDD {
	@Test
	public void WritingResponseAsString() throws Throwable
	{
		String jsonBody = "{\r\n"
				+ "   \"username\":\"admin\",\r\n"
				+ "   \"password\":\"password123\"\r\n"
				+ "}";
		// Create a request specification
		RequestSpecification request = RestAssured.given();
		
		request.contentType(ContentType.JSON);
		request.baseUri("https://restful-booker.herokuapp.com/auth");
		request.body(jsonBody);
		// Calling POST method on URI. After hitting we get Response
		Response response = request.post();
		// Getting response as a string and writing in to a file
		String responseAsString = response.asString();
		// Converting into byte array before writing
		byte[] responseAsStringByte = responseAsString.getBytes();
		// Creating a target file
		File targetFileForString  = new File("src/main/resources/targetFileForString.json");
		// Writing into files
		Files.write(responseAsStringByte, targetFileForString);
	
	}

}
