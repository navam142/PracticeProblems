package staticfinal;


class Book {

    static String libraryName = "Central Library";

    private String title;
    private String author;

    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        System.out.println("----- Book Details -----");
        System.out.println("Library: " + libraryName);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("------------------------");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        Book.displayLibraryName();

        Book b1 = new Book("Atomic Habits", "James Clear", "978-0735211292");
        Book b2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884");

        Object obj = b1;

        if (obj instanceof Book) {
            Book book = (Book) obj;
            book.displayDetails();
        } else {
            System.out.println("Object is not a Book!");
        }

        b2.displayDetails();

    }
}

