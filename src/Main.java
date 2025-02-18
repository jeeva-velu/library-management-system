import librarycomponents.Book;
import librarycomponents.HorrorBooks;
import librarycomponents.HumourBooks;
import librarycomponents.Library;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        HorrorBooks horrorBook1 = new HorrorBooks("12", "Devil", "Surya", true, 5);
        HorrorBooks horrorBooks2 = new HorrorBooks("13", "Ghost", "Danny", true, 4);

        HumourBooks humourBook1 = new HumourBooks("1", "Funny", "Rohit", true);
        HumourBooks humourBooks2 = new HumourBooks("2", "Smily", "Karthi", true);

        //Adding the books in the library.

        library.addBook(horrorBook1);
        library.addBook(horrorBooks2);
        library.addBook(humourBook1);
        library.addBook(humourBooks2);

        //Displaying the books.

        System.out.println("Displaying books");
        library.displayBooks();

        horrorBook1.borrowBook();
        horrorBook1.borrowBook();
    }
}
