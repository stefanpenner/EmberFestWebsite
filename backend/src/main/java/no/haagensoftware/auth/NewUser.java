package no.haagensoftware.auth;

public class NewUser {
	//email: this.get('email'), firstName: this.get('firstName'), lastName: this.get('lastName'), homeCountry: this.get('homeCountry')
	private String email;
	private String uuidToken;
	private String firstName;
	private String lastName;
	private String homeCountry;
	
	public NewUser() {
	
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUuidToken() {
		return uuidToken;
	}
	public void setUuidToken(String uuidToken) {
		this.uuidToken = uuidToken;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getHomeCountry() {
		return homeCountry;
	}
	public void setHomeCountry(String homeCountry) {
		this.homeCountry = homeCountry;
	}
	
	
}
