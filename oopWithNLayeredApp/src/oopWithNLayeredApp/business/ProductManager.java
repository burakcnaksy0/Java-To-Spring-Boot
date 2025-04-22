package oopWithNLayeredApp.business;
// Business Layer : İş kurallarının yazıldığı katmandır.
// Veriler üzerinde yapılacak işlemler (örneğin: validation, hesaplama) burada gerçekleştirilir.
// İş kurallarını uygular ve diğer katmanları koordine eder..

import java.util.List;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private List<Logger> loggerList;

	public ProductManager(ProductDao productDao, List<Logger> loggerList) {
		this.productDao = productDao;
		this.loggerList = loggerList;
	}

	public void add(Product product) throws Exception { // response - request pattern
		// iş kuralları
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 tl'den düşük olamaz.");
		}

		// ProductDao productDao = new JdbcProductDao();
		// JdbcProductDao productDao = new JdbcProductDao();
		// bir interface onu implemente eden classın referansını (new) tutabilir.
		productDao.add(product);
 
		for (Logger logger : loggerList) {  // db , file
			logger.log(product.getName());
		}

	}
}
