package StreamApi;

public class User {
	int id;
	String name;
	
	public User(int id , String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	public void talk() {
		System.out.println("Hi , I'm " + this.name);
	}
}
