
public class User {
	
	private int userId;
	private String userName;
	private String firstName;
	private String lastName;
	
	public void setUserId(int userId) {
//		this used to assign
		this.userId = userId;   
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getUserId() {
		return this.userId;
	}
	public String getUserName() {
		return this.userName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}

}
