package interviewQuestions;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WritingAPI_ResponsesIntoJsonFile_AsInputStream_WithoutBDD {
	@Test
	public void WritingResponseAsInputStream() throws IOException
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
		// Getting response as input stream and writing in to a file
		InputStream responseAsInputStream = response.asInputStream();
		// Creating a byte array with number of bytes of input stream (available()
		// method)
		byte[] responseAsInputStreamByte = new byte[responseAsInputStream.available()];
		// Reads number of bytes from the input stream and stores them into the byte
		// array responseAsInputStreamByte.
		responseAsInputStream.read(responseAsInputStreamByte);
		// Creating a target file
		File targetFileForInputStream = new File("src/main/resources/targetFileForInputStream.json");
		// Writing into files
		Files.write(responseAsInputStreamByte, targetFileForInputStream);
		
	}

}
