package map.livrariaOnline.models;

public class Book {
	private String title;
	private String author;
	private String link;
	private double price;
	
	public Book(String title, String author, String link, double price) {
		super();
		this.title = title;
		this.author = author;
		this.link = link;
		this.price = price;
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
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", link=" + link + ", price=" + price + "]";
	}
	
	
}
