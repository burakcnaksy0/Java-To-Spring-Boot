import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Seller extends Person {
	private String sellerId;
	private String companyName;
	private String taxNumber;
	private LocalDate joinedDate;
	private List<Product> productList = new ArrayList<Product>(); // satıcı da bulunan ürünlerin listesi burada tutulur.
	private double sellerRating;
	private boolean isAuthorized;

	// Satıcının sahip olduğu tüm ürünlerin listesini kopya olarak döner.
	// Bu şekilde dışarıdan gelen müdahaleler productList’i doğrudan değiştiremez.
	public List<Product> getAllProducts() {
		return new ArrayList<>(productList);
	}
	
	// Satıcının sattığı ürünlerin ortalama puanını hesaplar.
	// Eğer ürün yoksa 0.0 döner. Aksi halde tüm ürünlerin rating değeri toplanır ve ortalama alınır.
	public double calculateAverageRating() {
		if (productList.isEmpty())
			return 0.0;

		double totalRating = 0.0;
		int count = 0;
		for (Product product : productList) {
			totalRating += product.getRating();
			count++;
		}
		return count == 0 ? 0.0 : totalRating / count; // ürün sayısı(count) 0 ise 0.0 döndür ? (ama değilse) totalRating/count döndür
	}
	
	// Stokta olan ürünleri filtreleyip döndürür.
	// Product::isInStock → her ürünün isInStock() metodunu çağırarak stokta olup olmadığını kontrol eder.
	public List<Product> getAvailableProducts() {
		return productList.stream().filter(Product::isInStock).collect(Collectors.toList());
		// Stream, veri üzerinde işlem zinciri kurmamızı sağlar.
		
		// Product::isInStock → Bu, her ürün için isInStock() metodunu çağırır.
		// Yani ürün stokta varsa (true), akışta kalır.
		// Değilse, atılır.
		// Bu işlem sonucunda yalnızca stokta olan ürünler akışta kalır.
		
		// .collect(Collectors.toList())
		// Akış işlemleri tamamlandıktan sonra sonuçları bir Listeye (List<Product>) çevirir.
		// Collectors.toList() → Stream'den tekrar bir List oluşturur.

		
	}
	// satıcıya ürün eklendi
	public void addProduct(Product product) {
		System.out.println(product + " satıcıya eklendi.");
		productList.add(product);
	}
	// satıcıdasn ürün çıkarıldı
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
