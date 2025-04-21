import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Birden fazla OrderItem içerir	
public class Order {	// Bir müşterinin verdiği bütün siparişi temsil eder
    private Long id;
    private Customer customer;	// 	Siparişi veren müşteri
    private List<OrderItem> items = new ArrayList<OrderItem>();// Siparişteki ürünler ve miktar bilgisi (her bir ürün OrderItem ile tutulur)
    private LocalDate orderDate;
    private double totalAmount;
    private String status; // Siparişin durumu. Örn: Pending, Shipped, Delivered, Cancelled
    private String shippingAddress; // 	Teslimat adresi
    private String paymentMethod; // Ödeme yöntemi Örn: Credit Card, PayPal, etc.
    private boolean isPaid;	// Ödeme yapıldı mı (true) / yapılmadı mı (false)
    
    // Siparişin durumunu günceller.
    // Örn: "Pending" → "Shipped" gibi geçişleri sağlar. 
    public void changeStatus(String newStatus) {
        this.status = newStatus;
    }
    
    // Siparişin kargoya verilmeye uygun olup olmadığını kontrol eder.
    //Eğer sipariş durumu "Paid" veya "Confirmed" ise true döner.
    public boolean isShippable() {
        return this.status.equalsIgnoreCase("Paid") || this.status.equalsIgnoreCase("Confirmed");
    }
    
    // Sipariş içindeki tüm ürünlerin toplam tutarını hesaplar.
    public double calculateTotalAmount() {
        double total = 0.0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        this.totalAmount = total;
        return total;
    }

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", orderDate=" + orderDate + ", totalAmount="
				+ totalAmount + ", status=" + status + ", shippingAddress=" + shippingAddress + ", paymentMethod="
				+ paymentMethod + ", isPaid=" + isPaid + "]";
	}
    
    
}
