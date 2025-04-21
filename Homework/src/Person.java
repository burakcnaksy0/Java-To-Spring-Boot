// Sınıflar arasında pek çok ortak özellik ve davranış bulunduğu durumlarda tasarlanan soyut sınıflardır.
// Kod tekrarını engelleyerek hem daha derli toplu bir görüntü sağlar hem de hata yapma riskini azaltır.
// Ortak bir şablon üzerinden ilerleme imkanı sunar ve bu sınıfların temel amacı da budur.
// Abstract sınıflardan nesne üretimi gerçekleştirilemez
// Ama bu sınıftan kalıtım alan sınıflar (örneğin Customer) onun özelliklerini ve metodlarını kullanabilir.
public abstract class Person {
	private Long id;
	private String name;
	private String surname;
	private String email;
	private String phoneNumber;
	private String password;
	private String address;
	
	// Bu metodun amacı şifreyi değiştirmektir.
	// Eski şifre ve yeni şifre girilir , eski şifre doğru girildiyse yeni şifre atanır.
	public void changePassword(String oldPassword, String newPassword) {
	    if (this.password.equals(oldPassword)) {
	        this.password = newPassword;
	    } else {
	        throw new IllegalArgumentException("Eski şifre yanlış!");
	    }
	}
	// Kullanıcının ad ve soyadını bir arada verir.
	public String getFullName() {
		return getName() + " " + getSurname();
	}
	
	// Kullanıcının e-posta ve telefon bilgilerini günceller.
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
