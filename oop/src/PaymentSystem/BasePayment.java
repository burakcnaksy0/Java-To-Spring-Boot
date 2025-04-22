package PaymentSystem;

// Abstract class: Ortak işlemleri içerir
// "Tüm ödeme yöntemleri müşteri adını tutacak ve fiş basabilecek."
public abstract class BasePayment implements PaymentMethod {
	protected String customerName;

	public BasePayment(String customerName) {
		this.customerName = customerName;
	}

	public void printReceipt(double amount) {
		System.out.println(customerName + " adlı müşteri " + amount + " TL ödedi.");
	}
}
