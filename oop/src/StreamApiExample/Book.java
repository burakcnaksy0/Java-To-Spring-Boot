package StreamApiExample;

public class Book implements Comparable<Book>{

	private String title;
	private String author;
	private int pageCount;
	private double price;

	public Book(String title, String author, int pageCount, double price) {
		setTitle(title);
		setAuthor(author);
		setPageCount(pageCount);
		setPrice(price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pageCount=" + pageCount + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		return Integer.compare(this.pageCount, o.pageCount);
	}
	
	
}
