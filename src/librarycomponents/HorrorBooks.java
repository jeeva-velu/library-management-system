package librarycomponents;

public class HorrorBooks extends Book {

    private Integer rating;

    public HorrorBooks(String bookId, String title, String author, boolean isAvailable,Integer rating) {
        super(bookId, title, author, isAvailable);
        this.rating = rating;
    }

    @Override
    protected void getBookInfo() {
        System.out.println("Book id: " + bookId + ", Title: " + title + ", Author: " + author + " Rating: "+rating);
    }

    @Override
    public void borrowBook() {
        if (isAvailable) {
            System.out.println(title + " has been borrowed");
            isAvailable = false;
        } else {
            System.out.println(title + " Book is not available at the moment");
        }
    }

    @Override
    public void returnBook() {
        System.out.println(title + "Has been returned");
        isAvailable = true;
    }
}
