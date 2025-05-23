package ObjectOrientedProgramming;

public class CorporateCustomer extends Customer {

	private String companyName;
	private String taxNumber;

	public CorporateCustomer(int id, String customerNumber, String phone, String companyName, String taxNumber) {
		super(id, customerNumber, phone);
		setCompanyName(companyName);
		setTaxNumber(taxNumber);
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "CorporateCustomer [companyName=" + companyName + ", taxNumber=" + taxNumber + "]";
	}

}
