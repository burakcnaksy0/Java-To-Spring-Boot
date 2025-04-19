package oop;

public class İndividualCustomer extends Customer {
	private String name;
	private String surname;

	public İndividualCustomer(int id, String customerNumber, String phone, String name, String surname) {
		super(id, customerNumber, phone);
		setName(name);
		setSurname(surname);
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

	@Override
	public String toString() {
		return super.toString() +  "İndividualCustomer [name=" + name + ", surname=" + surname + "]";
	}
	
	
}
