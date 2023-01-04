package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerializationAndDeserialization.EmployeeDetailsPojoWithArrayAndObject;
import pojoClassForSerializationAndDeserialization.GirlFriend;

public class SerializableofEmployeeWithArrayAndObject {
	@Test
	public void serializableofEmployeeWithArrayAndObject() throws JsonGenerationException, JsonMappingException, IOException
	{
		String[] gfEmail = {"Barbie123@gmail.com","Barbie456@gmail.com"};
		int[] gfContact = {987564,985632};
		
		String[] empEmail = {"ps123@gmail.com","ps456@gmail.com"};
		int[] empContact = {998877,112233};
		
		//Create the object for girl friend class
		GirlFriend gf1 = new GirlFriend("Barbie", "APPIS_05", gfEmail, gfContact, "Kahi toh rehti hogi");
		
		//Create the object for pojo class
		EmployeeDetailsPojoWithArrayAndObject emp = new EmployeeDetailsPojoWithArrayAndObject("Pranshul Saxena", "APPIS_24", empEmail, empContact, "M.P.", gf1);
	
		//Create the object for Object mapper
		ObjectMapper objMap = new ObjectMapper();
		
		////Write the value to json value
		objMap.writeValue(new File("./empData_GF.json"), emp);
	}

}
