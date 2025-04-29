package cl.duoc.flopez.bibliotecamicroservices.model;

public class Book {
    private String title;
    private String author;
    private String identifier;
    private int numberOfPages;

    public Book() {}

    public Book(String title, String author, String identifier, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.identifier = identifier;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }



}
