package LW_03.Q_05;

public class BorrowableItems {

    public static class Book {
        String title;
        String author;
        String ISBN;
        boolean available;

        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.available = true;
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

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public String displayInfo() {
            String info = "Title : " + title
                    + "\nAuthor : " + author
                    + "\nISBN : " + ISBN
                    + "\nAvailability : " + available;
            return info;
        }

    }
}
