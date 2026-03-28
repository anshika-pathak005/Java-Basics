package OOP;

abstract class Book{

//    attributes
    private String bookName;
    private String authorName;
    private int bookId;

//    constructor
    public Book(String bookName,String authorName,int bookId){
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookId = bookId;
    }

//    to display details
    public void displayDetails(){
        System.out.println("Book Name - "+bookName);
        System.out.println("Book Author name - "+authorName);
        System.out.println("Book Id - "+bookId);
    }

//    function to issure the boooks - abstracted method
    public abstract void bookIssue();
}

class eBook extends Book{

    public eBook(String bookName,String authorName,int bookId){
        super(bookName,authorName,bookId);
    }

    @Override
    public void bookIssue(){
        System.out.println("E-book Issued");
    }

}

class printedBook extends Book{

    public printedBook(String bookName,String authorName,int bookId){
        super(bookName,authorName,bookId);
    }

    @Override
    public void bookIssue(){
        System.out.println("Printed-Book Issued");
    }

}

public class LibraryMGMT {
    public static void main(String[] args) {
        Book book1 = new eBook("Harry Potter","J.K Rowling",1234);
        book1.displayDetails();
        book1.bookIssue();
        System.out.println();
        Book book2 = new printedBook("Origin of species","Charles Darvin",5678);
        book2.displayDetails();
        book2.bookIssue();

    }
}
