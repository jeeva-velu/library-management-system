package librarycomponents;

public class HumourBooks extends Book {
    public HumourBooks(String bookId, String title, String author, boolean isAvailable) {
        super(bookId, title, author, isAvailable);
    }

    /*@Override
    protected void getBookInfo() {
        System.out.println("Book id: " + bookId + ", Title: " + title + ", Author: " + author);
    }*/

    @Override
    public void borrowBook() {
        if (isAvailable) {
            System.out.println(title + "has been borrowed");
            isAvailable = false;
        } else {
            System.out.println(title + "is not available at the moment");
        }
    }

    @Override
    public void returnBook() {
        System.out.println(title + "has been returned");
        isAvailable = true;
    }
}
