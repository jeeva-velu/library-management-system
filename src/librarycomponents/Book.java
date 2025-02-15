package librarycomponents;

public abstract class Book implements Borrowable {
    protected String bookId;
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public Book(String bookId,String title,String author,boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    //protected abstract void getBookInfo();


    protected void getBookInfo() {
        System.out.println("Book id: " + bookId + ", Title: " + title + ", Author: " + author );
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
}


