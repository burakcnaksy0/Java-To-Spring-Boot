package PaymentSystem;

// Havale ile ödeme
public class BankTransferPayment extends BasePayment {

	private String iban;

	public BankTransferPayment(String customerName, String iban) {
		super(customerName);
		this.iban = iban;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Banka havalesi yapılıyor... IBAN: " + iban);
		printReceipt(amount);
	}

}
