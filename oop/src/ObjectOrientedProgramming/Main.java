package ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		Product product = new Product("ıphone 12", 25000, 5, "ıphone-12.png", 250);
		System.out.println(product);

		Product product1 = new Product("lenovo legion i7", 45000, 8, "lenoov_legion.png", 50);
		System.out.println(product1);

		System.out.println();

		// We keep the created Product objects in an arraylist
		List<Product> allProducts = new ArrayList<Product>();
		allProducts.add(product);
		allProducts.add(product1);

		// We can access the elements in the arraylist with the foreach loop.
		for (Product products : allProducts) {
			System.out.println(products);
		}

		System.out.println();

		// Reading with ListIterator
		ListIterator<Product> allPro = allProducts.listIterator();
		while (allPro.hasNext()) {
			Product p = allPro.next(); // Burada next() ile bir sonraki elemana geçiyoruz
			System.out.println(p);
		}
		System.out.println();
		
		System.out.println("Customer Information : ");
		Customer customer = new Customer(1, "91823", "05350428711");
		System.out.println(customer);
		
	
		System.out.println("İndivial Customer Information : ");
		İndividualCustomer individualCustomer = new İndividualCustomer(1, "91823", "05350428711", "burakcan", "aksoy");
		System.out.println(individualCustomer);
		
		System.out.println();
		
		System.out.println("Customer2 Information : ");
		Customer customer2 = new Customer(2, "65126", "05319212482");
		System.out.println(customer2);
		
		System.out.println("Corporate Customer Information : ");
		CorporateCustomer corporateCustomer = new CorporateCustomer(2, "65126", "05319212482", "İşcan Insaaat ", "213");
		System.out.println(corporateCustomer);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
