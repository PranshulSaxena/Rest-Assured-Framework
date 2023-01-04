package pojoClassForSerializationAndDeserialization;

public class GirlFriend {
	
	String GirlFriendName;
	String GirlFriendId;
	String[] GirlFriendEmail;
	int[] GirlFriendContactNo;
	String GirlFriendAddress;
	
	// Create constructor for Initialization
	public GirlFriend(String girlFriendName, String girlFriendId, String[] girlFriendEmail,
			int[] girlFriendContactNo, String girlFriendAddress) {
		super();
		GirlFriendName = girlFriendName;
		GirlFriendId = girlFriendId;
		GirlFriendEmail = girlFriendEmail;
		GirlFriendContactNo = girlFriendContactNo;
		GirlFriendAddress = girlFriendAddress;
	}

	public String getGirlFriendName() {
		return GirlFriendName;
	}

	public void setGirlFriendName(String girlFriendName) {
		GirlFriendName = girlFriendName;
	}

	public String getGirlFriendId() {
		return GirlFriendId;
	}

	public void setGirlFriendId(String girlFriendId) {
		GirlFriendId = girlFriendId;
	}

	public String[] getGirlFriendEmail() {
		return GirlFriendEmail;
	}

	public void setGirlFriendEmail(String[] girlFriendEmail) {
		GirlFriendEmail = girlFriendEmail;
	}

	public int[] getGirlFriendContactNo() {
		return GirlFriendContactNo;
	}

	public void setGirlFriendContactNo(int[] girlFriendContactNo) {
		GirlFriendContactNo = girlFriendContactNo;
	}

	public String getGirlFriendAddress() {
		return GirlFriendAddress;
	}

	public void setGirlFriendAddress(String girlFriendAddress) {
		GirlFriendAddress = girlFriendAddress;
	}
	
	
	

}
