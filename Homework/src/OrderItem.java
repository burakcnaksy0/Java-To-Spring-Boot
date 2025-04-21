// Bir OrderItem, bir ürünü temsil eder
public class OrderItem {	// Sipariş içerisindeki tek bir ürünün detaylarını tutar
	
    private Product product;	// 	Sipariş edilen ürün nesnesi
    private int quantity;	// 	Bu üründen kaç adet sipariş edildiğini belirtir
    private double unitPrice;	// Ürünün sipariş anındaki birim fiyatı (indirimli olabilir)
    
    // Sipariş edilen bu ürünün ara toplamını (subtotal) hesaplar.
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
