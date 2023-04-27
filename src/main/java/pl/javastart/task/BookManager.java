package pl.javastart.task;

import java.util.Scanner;

public class BookManager extends Book {
    private final Book[] books = new Book[3];
    private final Scanner scanner = new Scanner(System.in);
    private int counter = 0;

    public Book[] createAndAddBooks() {
        while (counter < books.length) {
            Book book = createBook();
            boolean unique = isUnique(book);

            for (int i = 0; i < counter; i++) {
                if (books[i].equals(book)) {
                    System.out.println("duplikat");
                    unique = false;
                    break;
                }
            }

            if (unique) {
                books[counter] = book;
                counter++;
            }
        }

        return books;
    }

    private Book createBook() {
        System.out.println("Podaj tytuł: ");
        String title = scanner.nextLine();

        System.out.println("Podaj ilość stron");
        int pages = scanner.nextInt();
        scanner.nextLine();

        return new Book(title, pages);
    }

    public void printBooks(Book[] books) {
        System.out.println("Obiekty zapisane w tablicy:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public boolean isUnique(Book book) {
        return true;
    }

}
