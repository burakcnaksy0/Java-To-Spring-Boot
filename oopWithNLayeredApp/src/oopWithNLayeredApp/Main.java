package oopWithNLayeredApp;
// Presentation Layer : Uygulama girişi, kullanıcı ile etkileşim.
// entites - dataAccess - business - core - presentation
import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(5, "Iphone 12", 29000);

		List<Logger> listLogger = new ArrayList<Logger>();

		listLogger.add(new DatabaseLogger());
		listLogger.add(new FileLogger());

		ProductManager manager = new ProductManager(new HibernateProductDao(), listLogger);

		try {
			manager.add(product);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
