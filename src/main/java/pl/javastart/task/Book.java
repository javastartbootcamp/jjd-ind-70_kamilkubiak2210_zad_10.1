package pl.javastart.task;

import java.util.Scanner;

public class Book {
    private String title;
    private int pages;

    public Book[] books = new Book[3];
    Scanner scanner = new Scanner(System.in);
    int counter = 0;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public Book() {
    }

    public void createAddAndPrintBooks() {
        while (counter < books.length) {
            Book book = createBook();
            boolean duplicate = false;

            for (int i = 0; i < counter; i++) {
                if (books[i].title.equals(book.title) && books[i].pages == book.pages) {
                    duplicate = true;
                    System.out.println("duplikat");
                    break;
                }
            }

            if (!duplicate) {
                books[counter] = book;
                counter++;
            }
        }

        System.out.println("Obiekty zapisane w tablicy:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private Book createBook() {
        System.out.println("Podaj tytuł: ");
        String title = scanner.nextLine();

        System.out.println("Podaj ilość stron");
        int pages = scanner.nextInt();
        scanner.nextLine();

        return new Book(title, pages);
    }

    @Override
    public String toString() {
        return "Książka: " + title + ", stron: " + pages;
    }
}

