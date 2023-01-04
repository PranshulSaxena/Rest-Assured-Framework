package genericUtilities;

import io.restassured.response.Response;

public class ResAssuredLibrary {
	
	/**
	 * This method will return json data from the corresponding response body
	 * @param response
	 * @param path
	 * @return
	 * @@author Pranshul Saxena
	 */
	public String getJsonData(Response response, String path)
	{
		String jsonData = response.jsonPath().get(path);
		return jsonData;
	}

}
