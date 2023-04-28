package pl.javastart.task;

import java.util.Scanner;

public class BookManager extends Book {
    private final Scanner scanner = new Scanner(System.in);

    public Book[] createAndAddBooks() {
        Book[] books = new Book[3];
        int counter = 0;
        while (counter < books.length) {
            Book book = createBook();
            if (isUnique(book, books, counter)) {
                books[counter] = book;
                counter++;
            } else {
                System.out.println("duplikat");
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

    public boolean isUnique(Book book, Book[] books, int counter) {
        for (int i = 0; i < counter; i++) {
            if (books[i].equals(book)) {
                return false;
            }
        }
        return true;
    }
}


