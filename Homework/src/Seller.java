import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Seller extends Person {
	private String sellerId;
	private String companyName;
	private String taxNumber;
	private LocalDate joinedDate;
	private List<Product> productList = new ArrayList<Product>();
	private double sellerRating;
	private boolean isAuthorized;
	
	public List<Product> getAllProducts() {
	    return new ArrayList<>(productList);
	}

	public double calculateAverageRating() {
		if (productList.isEmpty())
			return 0.0;

		double totalRating = 0.0;
		int count = 0;
		for (Product product : productList) {
			totalRating += product.getRating();
			count++;
		}
		return count == 0 ? 0.0 : totalRating / count;
	}

	public List<Product> getAvailableProducts() {
		return productList.stream().filter(Product::isInStock).collect(Collectors.toList());
	}

	public void addProduct(Product product) {
		System.out.println(product + " satıcıya eklendi.");
		productList.add(product);
	}

	public void removeProduct(Product product) {
		System.out.println(product + " satıcıdan çıkarıldı.");
		productList.remove(product);
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
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

	public LocalDate getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(LocalDate joinedDate) {
		this.joinedDate = joinedDate;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public double getSellerRating() {
		return sellerRating;
	}

	public void setSellerRating(double sellerRating) {
		this.sellerRating = sellerRating;
	}

	public boolean isAuthorized() {
		return isAuthorized;
	}

	public void setAuthorized(boolean isAuthorized) {
		this.isAuthorized = isAuthorized;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", companyName=" + companyName + ", taxNumber=" + taxNumber
				+ ", joinedDate=" + joinedDate + ", productList=" + productList + ", sellerRating=" + sellerRating
				+ ", isAuthorized=" + isAuthorized + "]";
	}

}
