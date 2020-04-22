
public class User {

	protected String username;
	protected String email;
	protected String password;
	protected MyProducts listings;
	
	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param username
	 * @param email
	 * @param password
	 * @param listings
	 */
	public User(String username, String email, String password, MyProducts listings) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.listings = listings;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the listings
	 */
	public MyProducts getListings() {
		return listings;
	}

	/**
	 * @param listings the listings to set
	 */
	public void setListings(MyProducts listings) {
		this.listings = listings;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", password=" + password + ", listings=" + listings
				+ "]";
	}

	
}
