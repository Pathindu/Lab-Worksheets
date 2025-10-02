package LW_03.Q_05;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    ArrayList<BorrowableItems.Book> BorrowableBookList = new ArrayList<>();

    public void addBook(String title, String author, String ISBN) {
        BorrowableBookList.add(new BorrowableItems.Book(title, author, ISBN));
        System.out.println("\nBook successfully added!\n");
    }

    public boolean checkOut(String ISBN) {
        for (BorrowableItems.Book book : BorrowableBookList) {
            if (ISBN.equals(book.getISBN())) {
                book.setAvailable(false);
                return true;
            }
        }
        return false;
    }

    public String listBooks() {
        String list = "";
        for (BorrowableItems.Book item : BorrowableBookList) {
            list += item.displayInfo() + "\n\n";
        }
        return list;
    }

    public String LibraryInfo() {
        return "\nNo of Books available : " + BorrowableBookList.size();
    }
}
