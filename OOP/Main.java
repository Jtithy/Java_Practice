
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class BookManagement {

    public abstract void addBook(Book book);

    public abstract void removeBook(String bookId);

    public abstract void displayBooks();
}

class Book {

    private final String bookId;
    private final String title;
    private final String author;
    private final int publicationYear;
    private final String genre;

    public Book(String bookId, String title, String author,
            int publicationYear, String genre) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    public void displayBookInfo() {

        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
    }
}

// Child class
class Library extends BookManagement {

    private final List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {

        books.add(book);

        System.out.println("\nBook added successfully!");
    }

    @Override
    public void removeBook(String bookId) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getBookId().equals(bookId)) {

                books.remove(i);

                System.out.println("\nBook removed successfully!");

                return;
            }
        }

        System.out.println("\nBook not found!");
    }

    @Override
    public void displayBooks() {

        if (books.isEmpty()) {

            System.out.println("\nNo books available.");

            return;
        }

        System.out.println("\n--------------------------------\n");
        System.out.println("\nBOOK LIST");
        System.out.println("\n--------------------------------\n");

        for (Book book : books) {

            book.displayBookInfo();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Library library = new Library();

        // Pre-added books
        library.addBook(new Book(
                "B001",
                "The Great Gatsby",
                "F. Scott Fitzgerald",
                1925,
                "Fiction"
        ));

        library.addBook(new Book(
                "B002",
                "The Trial",
                "Franz Kafka",
                1925,
                "Fiction"
        ));

        library.addBook(new Book(
                "B003",
                "1984",
                "George Orwell",
                1949,
                "Dystopian"
        ));

        library.addBook(new Book(
                "B004",
                "To Kill a Mockingbird",
                "Harper Lee",
                1960,
                "Fiction"
        ));

        library.addBook(new Book(
                "B005",
                "Pride and Prejudice",
                "Jane Austen",
                1813,
                "Romance"
        ));

        // Menu
        while (true) {

            System.out.println("   BOOK MANAGEMENT SYSTEM");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {

                    System.out.println("\nADD BOOK");

                    System.out.print("Enter Book ID: ");
                    String bookId = input.nextLine();

                    System.out.print("Enter Title: ");
                    String title = input.nextLine();

                    System.out.print("Enter Author: ");
                    String author = input.nextLine();

                    System.out.print("Enter Publication Year: ");
                    int publicationYear = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = input.nextLine();

                    Book newBook = new Book(
                            bookId,
                            title,
                            author,
                            publicationYear,
                            genre
                    );

                    library.addBook(newBook);
                }
                case 2 -> {

                    System.out.println("\nREMOVE BOOK");

                    System.out.print("Enter Book ID to remove: ");

                    String bookId = input.nextLine();

                    library.removeBook(bookId);
                }
                case 3 ->
                    library.displayBooks();
                case 4 -> {
                    System.out.println("\nThank you for using Book Management System!");

                    input.close();
                    return;
                }
                default ->
                    System.out.println("\nInvalid choice! Please select 1-4.");
            }
        }

    }
}
