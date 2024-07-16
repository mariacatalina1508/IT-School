package kata.session_3;

public class LibraryManangementSystem {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("OCA");

        BooksService bookService = new BooksService();
        bookService.addBook(book1);
    }
}
