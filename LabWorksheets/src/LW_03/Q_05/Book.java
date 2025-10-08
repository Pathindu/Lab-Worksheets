package LW_03.Q_05;

public class Book extends BorrowableItems{
    private String title;
    private String author;

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

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        super.setISBN(ISBN);
        super.setAvailable(true);
    }

    public String displayInfo() {
        return "\nBook title : " + title +
                "\nAuthor : " + author +
                "\nISBN : " + super.getISBN() +
                "\nAvailability : " + super.isAvailable();
    }
}
