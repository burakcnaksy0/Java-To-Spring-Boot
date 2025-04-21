import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private Long id;
    private String name;
    private String description;
    private String category;
    private double price;
    private int stockQuantity;  // 	Ürün stoğunda kaç adet var
    private Seller seller;   // Ürünü satan kişi ya da firma (Satıcı nesnesi)
    private LocalDate createdDate;
    private double rating;	// Ürünün ortalama puanı (1-5 arası olabilir)
    private List<String> images = new ArrayList<String>();
    private boolean isAvailable;	// Ürün satışa açık mı (true) / değil mi (false)
    
    // Ürün stokta var mı ve satışta mı kontrol eder.
    // true dönerse ürün hem stoğu var hem de satışta demektir.
    public boolean isInStock() {
        return this.stockQuantity > 0 && this.isAvailable;
    }
    
    // Ürün stoğunu günceller.
    public void updateStock(int quantity) {
        this.stockQuantity += quantity;
        if (this.stockQuantity < 0) {
            this.stockQuantity = 0; // stok negatife düşmesin
        }
    }
    // Ürüne yüzde cinsinden indirim uygular. %10 , %15 ..
    public void applyDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Geçersiz indirim yüzdesi!");
        }
        this.price = this.price * (1 - percentage / 100.0);
    }
    // Vergili fiyatı hesaplar.
    // Örnek: fiyat = 100, KDV = 18 → sonuç: 118
    public double getPriceWithTax(double taxRate) {
        return this.price + (this.price * taxRate / 100.0);
    }

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", price=" + price + ", stockQuantity=" + stockQuantity + ", seller=" + seller + ", createdDate="
				+ createdDate + ", rating=" + rating + ", images=" + images + ", isAvailable=" + isAvailable + "]";
	}
    
    
}
