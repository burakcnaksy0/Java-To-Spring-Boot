package oopWithNLayeredApp.entities;
// Entities Layer : Veritabanındaki tabloların Java sınıflarıyla temsil edildiği katmandır.
public class Product {

	private int id;
	private String name;
	private double unitPrice;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, double unitPrice) {
		setId(id);
		setName(name);
		setUnitPrice(unitPrice);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
