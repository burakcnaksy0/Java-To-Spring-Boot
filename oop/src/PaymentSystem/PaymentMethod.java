package PaymentSystem;

// “Her ödeme yöntemi pay() metodunu kullanmalı!” diye zorunluluk koyuyor.
public interface PaymentMethod {
	void pay(double amount);
}
