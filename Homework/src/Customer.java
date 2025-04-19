import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
	private String customerNumber;
	private LocalDate registrationDate;
	private List<Order> orders = new ArrayList<Order>();
	private List<Product> favoriteProducts = new ArrayList<Product>();
	private String membershipLevel; // Örn: Silver, Gold, Platinum
	private boolean isVerified;
	
	public double getTotalSpent() {
	    double total = 0.0;
	    for (Order order : orders) {
	        total += order.calculateTotalAmount();
	    }
	    return total;
	}
	
	public List<Order> getOrderHistory() {
	    return new ArrayList<>(orders); // Kopya döndürmek güvenli olur
	}

	public void addOrder(Order order) {
		System.out.println(order + " müşteriye eklendi");
		orders.add(order);
	}

	public void addFavouriteProduct(Product product) {
		System.out.println(product + " müşteri favoriledi.");
		favoriteProducts.add(product);
	}
	public void removeFavouriteProduct(Product product) {
		System.out.println(product + " müşterinin favorisinden kaldırıldı.");
		favoriteProducts.remove(product);
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<Product> getFavoriteProducts() {
		return favoriteProducts;
	}

	public void setFavoriteProducts(List<Product> favoriteProducts) {
		this.favoriteProducts = favoriteProducts;
	}

	public String getMembershipLevel() {
		return membershipLevel;
	}

	public void setMembershipLevel(String membershipLevel) {
		this.membershipLevel = membershipLevel;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", registrationDate=" + registrationDate + ", orders="
				+ orders + ", favoriteProducts=" + favoriteProducts + ", membershipLevel=" + membershipLevel
				+ ", isVerified=" + isVerified + "]";
	}

}
