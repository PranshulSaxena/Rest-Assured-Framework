package pojoClassForSerializationAndDeserialization;

public class EmployeeDetailsPojo {
	
	//Declare the variable globally
		String Ename;
		String Eid;
		String Email;
		int ContactNo;
		String Address;
		
	// Create an empty constuctor for reading data(i.e. Deserialization)
	public EmployeeDetailsPojo()
	{
			
	}
	
	// Create a Constructor for initialization
	public EmployeeDetailsPojo(String ename, String eid, String email, int contactNo, String address)
	{
		super();
		Ename = ename;
		Eid = eid;
		Email = email;
		ContactNo = contactNo;
		Address = address;
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
		
		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}
		
		public int getContactNo() {
			return ContactNo;
		}

		public void setContactNo(int contactNo) {
			ContactNo = contactNo;
		}
		
		public String getAddress() {
			return Address;
		}
		
		public void setAddress(String address) {
			Address = address;
		}
		

}
