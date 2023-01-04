package pojoClassForSerializationAndDeserialization;

public class EmployeeDetailsPojoWithArrayAndObject {
	
//Declare the variable globally
	String Ename;
	String Eid;
	String[] Email;
	int[] ContactNo;
	String Address;
	Object GirlFriendClass;
	
// Create a Constructor for initialization
	public EmployeeDetailsPojoWithArrayAndObject(String ename, String eid, String[] email, int[] contactNo, String address, Object girlfriendClass)
	{
		super();
		Ename = ename;
		Eid = eid;
		Email = email;
		ContactNo = contactNo;
		Address = address;
		GirlFriendClass = girlfriendClass;
	}
	
// Setter and Getter for accessing
	public String getEname() {
		return Ename;
	}
	
	public void setEname(String ename) {
		Ename = ename;
	}
	
	public String getEid() {
		return Eid;
	}
	
	public void setEid(String eid) {
		Eid = eid;
	}
	
	public String[] getEmail() {
		return Email;
	}

	public void setEmail(String[] email) {
		Email = email;
	}
	
	public int[] getContactNo() {
		return ContactNo;
	}

	public void setContactNo(int[] contactNo) {
		ContactNo = contactNo;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}

	public Object getGirlFriendClass() {
		return GirlFriendClass;
	}

	public void setGirlFriendClass(Object[] girlFriendClass) {
		GirlFriendClass = girlFriendClass;
	}
	
	
	
}
