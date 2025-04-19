
public abstract class Person {
	private Long id;
	private String name;
	private String surname;
	private String email;
	private String phoneNumber;
	private String password;
	private String address;
	
	public void changePassword(String newPassword) {
	    if (this.password.equals(getPassword())) {
	        this.password = newPassword;
	    } else {
	        throw new IllegalArgumentException("Eski şifre yanlış!");
	    }
	}

	
	public String getFullName() {
		return getName() + " " + getSurname();
	}
	
	public void updateContactInfo(String email, String phoneNumber) {
	    this.email = email;
	    this.phoneNumber = phoneNumber;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", password=" + password + ", address=" + address + "]";
	}

}
