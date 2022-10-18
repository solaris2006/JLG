package home.jlg.lesson3;

import java.util.Objects;

public class Book {

    private final String name;
    private final String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name.toLowerCase()) && Objects.equals(author, book.author.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}
