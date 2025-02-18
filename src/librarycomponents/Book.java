package librarycomponents;

public abstract class Book implements Borrowable {

    //If we mention access modifier as protected the fields can be accessed by their subclasses directly... If mentioned private we should use setter and getter methods...

    protected String bookId;
    protected String title;
    protected String author;
    protected boolean isAvailable;


    //Parameterized constructor of book class.It should contain all the fields of the class...


    public Book(String bookId,String title,String author,boolean isAvailable) {
        this.bookId = bookId;       //Assigning the parameter of constructor to the instance variables of the class
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


