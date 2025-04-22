package PaymentSystem;

//Bir class birden fazla interface'i implement edebilir. 
//Kredi kartı ile ödeme
public class CreditCardPayment extends BasePayment {

	private String cardNumber;

	public CreditCardPayment(String customerName, String cardNumber) {
		super(customerName);
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Kredi kartıyla ödeme yapılıyor... Kart No: " + cardNumber);
		printReceipt(amount);
	}

}
