import java.time.LocalDate;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		// 1. Satıcı oluştur
		Seller seller = new Seller();
		seller.setId(1L);
		seller.setName("Ahmet");
		seller.setSurname("Yılmaz");
		seller.setCompanyName("TeknoSatıcı");

		// 2. Ürün oluştur ve satıcıya ekle
		Product product1 = new Product();
		product1.setId(101L);
		product1.setName("Gaming Mouse");
		product1.setPrice(500.0);
		product1.setStockQuantity(25);
		product1.setAvailable(true);
		product1.setSeller(seller);

		seller.addProduct(product1);

		// 3. Müşteri oluştur
		Customer customer = new Customer();
		customer.setId(1001L);
		customer.setName("Zeynep");
		customer.setSurname("Kaya");
		customer.setRegistrationDate(LocalDate.now());

		// 4. Sipariş oluştur
		OrderItem item1 = new OrderItem();
		item1.setProduct(product1);
		item1.setQuantity(2);
		item1.setUnitPrice(product1.getPrice());

		Order order = new Order();
		order.setId(5001L);
		order.setCustomer(customer);
		order.setItems(Arrays.asList(item1));
		order.setOrderDate(LocalDate.now());
		order.setStatus("Confirmed");

		double total = order.calculateTotalAmount();
		customer.addOrder(order);

		// 5. Bilgileri yazdır
		System.out.println("Müşteri: " + customer.getFullName());
		System.out.println("Sipariş No: " + order.getId());
		System.out.println("Toplam Tutar: " + total + " TL");
		System.out.println("Satıcı: " + product1.getSeller().getCompanyName());
		System.out.println("Ürün: " + product1.getName() + " x " + item1.getQuantity());

		// 6. Stok güncelle
		product1.updateStock(-item1.getQuantity());
		System.out.println("Kalan stok: " + product1.getStockQuantity());
	}
}
