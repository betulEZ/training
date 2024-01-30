package org.example;

import java.util.Arrays;

public class Library {
    Book[] books ;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "book=" + Arrays.toString(books) +
                '}';
    }
}
