package map.livrariaOnline;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import map.livrariaOnline.models.Book;

public class BookStore {
	private Map<String, Book> booksMap;
	
	public BookStore() {
		this.booksMap = new HashMap<>();
	}
	
	public void addBook(String isbn, String title, String author, String link, double price) {
		booksMap.put(isbn, new Book(title, author, link, price));
	}
	
	public void removeBook(String title) {
		for(String key: booksMap.keySet()) {
			if(booksMap.get(key).getTitle().equals(title)){
				booksMap.remove(key);
			}
		}
	}
	
	public void logByPrice(){
		List<Book> sortedBooks = new ArrayList<>();
		
		for(Book b: booksMap.values()) {
			sortedBooks.add(b);
		}
		
		sortedBooks.sort((b1,b2)-> Double.compare(b1.getPrice(), b2.getPrice()));
		for(Book b: sortedBooks) {	
			System.out.println(b.toString());
		}
	}
	
	public Map<String, Book> searchByAuthor(){
		Map<String, Book> found = null;
		return found;
	}
}
