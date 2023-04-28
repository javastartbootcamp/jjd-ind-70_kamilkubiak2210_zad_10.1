package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        Book[] books = bookManager.createAndAddBooks();
        bookManager.printBooks(books);

    }
}
