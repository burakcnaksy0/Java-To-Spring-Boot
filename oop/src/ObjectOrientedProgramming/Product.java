package ObjectOrientedProgramming;

public class Product {
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;

	public Product(String name, double unitPrice, double discount, String imageUrl, int unitsInStock) {
		setName(name);
		setUnitPrice(unitPrice);
		setDiscount(discount);
		setImageUrl(imageUrl);
		setUnitPrice(unitPrice);
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

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", unitPrice=" + unitPrice + ", discount=" + discount + ", imageUrl="
				+ imageUrl + ", unitsInStock=" + unitsInStock + "]";
	}

}
