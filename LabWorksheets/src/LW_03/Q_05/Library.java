package LW_03.Q_05;

import java.util.ArrayList;

public class Library {
    ArrayList<BorrowableItems.Book> BorrowableBookList = new ArrayList<>();

    public void addBook(String title, String author, String ISBN) {
        BorrowableBookList.add(new BorrowableItems.Book(title, author, ISBN));
    }

    public void checkOut(String ISBN) {
        BorrowableBookList.removeIf(item -> item.ISBN == ISBN);
    }

    public String listBooks() {
        String list = "";
        for (BorrowableItems.Book item : BorrowableBookList) {
            list += item.displayInfo() + "\n\n";
        }
        return list;
    }

    public String LibraryInfo() {
        return "No of Books available : " + BorrowableBookList.size();
    }
}
