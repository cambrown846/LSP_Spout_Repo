//Camryn Brown
package org.howard.edu.lsp.midterm.question1;

public class Book {
    private final String title;
    private final String author;
    private final String ISBN;
    private final int yearPublished;

    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, ISBN: %s, Year Published: %d", 
                             title, author, ISBN, yearPublished);
    }
}
