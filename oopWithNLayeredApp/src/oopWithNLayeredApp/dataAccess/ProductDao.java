package oopWithNLayeredApp.dataAccess;
// Data Access Layer : Veritabanı ile iletişimi sağlar. CRUD işlemleri burada yapılır.
// Veritabanı işlemlerini soyutlar ve farklı teknolojilerle çalışmayı sağlar.
import oopWithNLayeredApp.entities.Product;

public interface ProductDao {
	void add(Product product);
}
