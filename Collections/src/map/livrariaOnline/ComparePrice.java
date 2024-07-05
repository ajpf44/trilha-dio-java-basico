package map.livrariaOnline;

import java.util.Comparator;

import map.livrariaOnline.models.Book;

public class ComparePrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return Double.compare(o1.getPrice(), o2.getPrice());
	}
	
}
