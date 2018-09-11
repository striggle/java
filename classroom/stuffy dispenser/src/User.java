
public class User {
	
	private int id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	
	public User(int inid, String inusername, String inpassword, String infirstname, String inlastname) {
		id = inid;
		username =inusername;
		password = inpassword;
		firstname = infirstname;
		lastname = inlastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int inid) {
		id = inid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String inusername) {
		username = inusername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String inpassword) {
		password = inpassword;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String infirstname) {
		firstname = infirstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String inlastname) {
		lastname = inlastname;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + "]";
	}
	
	
	
	

}
