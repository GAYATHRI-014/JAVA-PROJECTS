package model;

public class Book {
    private String title;
    private String author;
    private String id;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public String toString() {
        return id + "," + title + "," + author;
    }
}
