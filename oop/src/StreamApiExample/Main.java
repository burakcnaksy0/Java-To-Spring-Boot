package StreamApiExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("Sefiller", "Victor Hugo", 1200, 150.0));
		books.add(new Book("Kürk Mantolu Madonna", "Sabahattin Ali", 160, 50.0));
		books.add(new Book("Suç ve Ceza", "Dostoyevski", 700, 120.0));
		books.add(new Book("Beyaz Diş", "Jack London", 180, 45.0));
		books.add(new Book("Simyacı", "Paulo Coelho", 210, 60.0));

		// 1. tüm kitapları yazdır.
		System.out.println("📚 Tüm Kitaplar:");
		books.stream()
		.forEach(book -> System.out.println(book.toString()));
	
		// 2. Sayfa sayısı 200'den fazla olanları filtrele
		System.out.println("\n 200 sayfadan fazla kitaplar:");
		
		/*
		 books.stream()
            .filter(book -> book.getPageCount() > 200)
            .forEach(System.out::println);
		 */
		List<Book> filteredList =  books.stream()
		.filter(book -> book.getPageCount()>200)
		.collect(Collectors.toList());
		
		filteredList.forEach(book -> System.out.println(book.toString()));
		
		// 3. Tüm kitapların sadece isimlerini büyük harf olarak yazdır
		System.out.println("\n Kitap isimleri (büyük harf):");
		books.stream()
		.map(book -> book.getTitle().toUpperCase())
		.forEach(System.out::println);
		
		// 4. Fiyatı 50'den küçük kitapların sayısını bul
		long count = books.stream()
		.filter(book -> book.getPrice()<50)
		.count();
		
		System.out.println("\n 50 TL'den ucuz kitap sayısı: " + count);
		books.stream()
		.filter(book -> book.getPrice()<50)
		.forEach(book -> System.out.println(book.toString()));
		
		// 5. Kitapları sayfa sayısına göre sırala
		// burda sıralama yaparken neye göre sıralama yapacağını belirlemek için
		// ya class ın içinde implements Comparable<ClassName> uygulayıp aşağıdaki işlemleri yapıcaksın
		System.out.println("\n Sayfa sayısına göre sıralı:");
		books.stream()
		.sorted()
		.forEach(book -> System.out.println(book.toString()));
		
		System.out.println();
		
		// ya da direkt olarak sorted metodu içinde belirteceksin 
		books.stream()
	    .sorted(Comparator.comparingInt(Book::getPageCount))
	    .forEach(System.out::println);
		
		// 6. kitapları alfabetik olarak sırala
		System.out.println("\n Alfabetik sırasına göre sıralı:");
		books.stream()
		.sorted(Comparator.comparing(book -> book.getTitle().toLowerCase()))
		.forEach(System.out :: println);
	
		// 7. Kitapları sadece başlık olarak liste olarak topla
		List<String> bookTitleList =  books.stream()
		.map(Book :: getTitle)
		.collect(Collectors.toList());
		
		System.out.println("\n Kitap başlıkları listesi:");
		bookTitleList.forEach(book -> System.out.println(book.toString()));
		
		// 8. listedeki tüm kitapların fiyatını bulma.
		System.out.println("kitapların fiyatları : ");
		books.stream()
		.map(Book :: getPrice)
		.forEach(System.out :: println);
		
		double booksPrice = books.stream()
				.mapToDouble(Book :: getPrice)
				.sum();
		System.out.println("kitapların toplam fiyatı : "+ booksPrice);
		
		// 9. listedeki tüm kitapların sayfa sayısını bulma.
		System.out.println("kitapların sayfa sayıları : ");
		books.stream()
		.map(Book :: getPageCount)
		.forEach(System.out :: println);
		
		
		int booksPageNumber = books.stream()
		.mapToInt(Book :: getPageCount)
		.sum();
		
		System.out.println("kitapların toplam sayfa sayısı : " +booksPageNumber);
		
		// 10. listedeki tüm kitapların ortalama fiyatını bulma.
		System.out.println("tüm kitapların ortalama fiyatı : ");
		double sumPrice = books.stream()
				.mapToDouble(Book :: getPrice)
				.sum();
		System.out.println("toplam fiyat : " +sumPrice);
		
		double count1 = (double)books.size();
		
		double averagePrice = sumPrice / count1;
		
		System.out.println(averagePrice);
	
	
	
	
	
	
	}

}

















