package PaymentSystem;

public class Main {
	
	/*
	 Bir alışveriş sitesinde farklı ödeme yöntemleri var:
		.Kredi Kartı ile ödeme		
		.Havale/EFT ile ödeme		
		.PayPal ile ödeme		
	 Biz de bu sistemde:		
	 interface ile tüm ödeme yöntemlerinin ne yapması gerektiğini belirleyeceğiz.	
	 abstract class ile bazı ortak işlemleri paylaşacağız.		
	 Her yöntemi farklı bir class ile uygulayacağız.
	 */
	public static void main(String[] args) {
		PaymentMethod paymentMethod1 = new CreditCardPayment("Ali", "1234-3451-6236");
		PaymentMethod paymentMethod2 = new BankTransferPayment("Burak", "TR00 1235 45634 1112 6515");

		paymentMethod1.pay(2000);

		System.out.println("-------------------");

		paymentMethod2.pay(5000);

	}

}
