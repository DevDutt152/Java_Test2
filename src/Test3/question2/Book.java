package Test3.question2;

import java.util.HashMap;

class Book{
    private String isbn;
    private String title;
    private boolean isAvailable;
    public Book(String isbn, String title, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.isAvailable = isAvailable;

    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}
//not able to do cause brain is bit switched off