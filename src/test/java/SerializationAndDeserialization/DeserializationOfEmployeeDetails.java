package SerializationAndDeserialization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerializationAndDeserialization.EmployeeDetailsPojo;

public class DeserializationOfEmployeeDetails {
	@Test
	public void deserializationOfEmployeeDetails() throws Throwable, Throwable, Throwable
	{
		//Step1:- Create the object for object Mapper
		ObjectMapper objMap = new ObjectMapper();
		
		//Step2:- Read the value from object Mapper
		EmployeeDetailsPojo emp = objMap.readValue(new File("./empData.json"), EmployeeDetailsPojo.class);
		
		//Step3:- Fetch the required value
		System.out.println(emp.getEname());
		System.out.println(emp.getEid());
		System.out.println(emp.getEmail());
		System.out.println(emp.getContactNo());
		System.out.println(emp.getAddress());
	}

}
