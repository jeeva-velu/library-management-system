package librarycomponents;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);

    }

    public void displayBooks() {
        for (Book book : books) {
            book.getBookInfo();
        }
    }

}
