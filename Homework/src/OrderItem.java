public class OrderItem {
	
    private Product product;
    private int quantity;
    private double unitPrice;
    
    public double getSubtotal() {
        return this.unitPrice * this.quantity;
    }

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	@Override
	public String toString() {
		return "OrderItem [product=" + product + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}

    
}
