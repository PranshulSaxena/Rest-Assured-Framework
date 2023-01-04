package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerializationAndDeserialization.EmployeeDetailsPojo;

public class SerializationOfEmployeeDetails {
	@Test
	public void serializationOfEmployee() throws Throwable, Throwable, Throwable
	{
		//Create the object for pojo class
		EmployeeDetailsPojo emp = new EmployeeDetailsPojo("Pranshul", "APPIS_024","Pranshul@24gmail.com", 812066, "M.P.");
		//Create the object for Object mapper
		ObjectMapper objMap = new ObjectMapper();
		//Write the value to json value
		objMap.writeValue(new File("./empData.json"), emp);
		
	}

}
