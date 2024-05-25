import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookInfo {

	public static void main(String[] args) {
		List<Book> listOfBooks = new ArrayList<>();
		listOfBooks.add(new Book("Effective Java", "Joshua Bloch", 32));
		listOfBooks.add(new Book("Java Puzzlers", "Joshua Bloch", 22));
		listOfBooks.add(new Book("Java Concurrency in Practice", "Brian Goetz", 42)); 
		listOfBooks.add(new Book("Java SE 8 for Really Impatient", "Cay S. Horstmann", 34)); 
		listOfBooks.add(new Book("Core Java", "Cay S. Horstmann",32));
		
		Comparator<Book> byAuthor = (b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor());
		
		Collections.sort(listOfBooks); 
		System.out.println("list of books after sorting: " + listOfBooks);

	}
	
	

}
