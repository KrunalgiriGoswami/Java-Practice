package Classes_and_Objects;

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("Programing Java", "George Orwell", "1234567890");
        Book book2 = new Book("Core Java", "Harper Lee", "0987654321");

        book1.borrowBook();
        book2.borrowBook();
        book1.returnBook();

        System.out.println("Total books: " + Book.getTotalBooks());
    }
}
class Book {
    // Instance variables
    private String title;
    private String author;
    private String isbn;

    // Static variable
    private static int totalBooks = 0;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    // Instance methods
    public void borrowBook() {
        System.out.println("The book '" + title + "' has been borrowed.");
    }

    public void returnBook() {
        System.out.println("The book '" + title + "' has been returned.");
    }

    // Static method
    public static int getTotalBooks() {
        return totalBooks;
    }

}
