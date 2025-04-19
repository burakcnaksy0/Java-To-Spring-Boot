import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Long id;
    private Customer customer;
    private List<OrderItem> items = new ArrayList<OrderItem>();
    private LocalDate orderDate;
    private double totalAmount;
    private String status; // Örn: Pending, Shipped, Delivered, Cancelled
    private String shippingAddress;
    private String paymentMethod; // Örn: Credit Card, PayPal, etc.
    private boolean isPaid;
    
    public void changeStatus(String newStatus) {
        this.status = newStatus;
    }
    public boolean isShippable() {
        return this.status.equalsIgnoreCase("Paid") || this.status.equalsIgnoreCase("Confirmed");
    }

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
