package SerializationAndDeserialization;

import java.io.File;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerializationAndDeserialization.EmployeeDetailsPojoWithArrayAndObject2;
import pojoClassForSerializationAndDeserialization.GirlFriend2;

@Test
public class SerializableofEmployeeWithArrayAndObject2 {
	public void serializableofEmployeeWithArrayAndObject2() throws Throwable, Throwable, Throwable 
	{
		/*String[] myEmail = {"Pranshul123@gmail.com", "Pranshul456@gmail.com", "Pranshul789@gmail.com"};
		int[] myContact = {812066, 148899,786962};
		
		
		String[] gf1Email = {"gf1_123@gmail.com","gf1_456@gmail.com","gf1_123@gmail.com"};
		int[] gf1Contact = {123654,987456,147852,369852};
		
		String[] gf2Email = {"gf2_963@gmail.com", "gf2_852@gmail.com"};
		int[] gf2Contact = {753214, 159632};*/
		
		
		//gf = new GirlFriend2("GF1", "01", gf1Email, gf1Contact, "Banglore");
			
		//gf = new GirlFriend2("GF2", "02", gf2Email, gf2Contact, "Dharwad");
		GirlFriend2[] gf = new GirlFriend2[2];	
		Scanner sc =new Scanner(System.in);
	
		for(int i=0; i<2; i++)
		{
			System.out.println("Enter "+i+"Girlfriend data");
			gf[i].GirlFriendName=sc.next();
			gf[i].GirlFriendContactNo=sc.nextInt();
			gf[i].GirlFriendEmail=sc.next();
			gf[i].GirlFriendId=sc.next();
			gf[i].GirlFriendAddress=sc.next();
		}
		
		
		//GirlFriend2[] myGirlFriends = {gf, gf};
		ObjectMapper objMap = new ObjectMapper();
		for (int i = 0; i < gf.length; i++) {

		EmployeeDetailsPojoWithArrayAndObject2 emp = new EmployeeDetailsPojoWithArrayAndObject2("Pranshul Saxena", "APPIS_1996", "ppp@gmail.com", 1234556, "Madhya Pradesh", gf[i]);
		objMap.writeValue(new File("./empData_MultiGf.json"),emp);
		}
		//Create the object for Object Mapper
		
		
		//write the value to json value
		
	}
}
