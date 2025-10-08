package LW_03.Q_05;

import java.util.ArrayList;

public class Library {
    ArrayList<BorrowableItems> BorrowableItemList = new ArrayList<>();

    public void addLibraryBook(BorrowableItems item) {
        if (item instanceof Book) {
            BorrowableItemList.add(item);
        } else {
            System.out.println("Item is not supported yet!!");
        }
    }

    public void checkOutBook(String title) {
        for (BorrowableItems item : BorrowableItemList) {
            if (item instanceof Book) {
                if (((Book) item).getTitle() == title) {
                    if (item.isAvailable()) {
                        item.setAvailable(false);
                        System.out.println("'" + ((Book) item).getTitle() + "' Successfully checked out!");
                    } else {
                        System.out.println("'" + ((Book) item).getTitle() + "' is not available!");
                    }
                }
            }
        }
    }

    public String listAvailableBooks() {
        String list = "\n";
        for (BorrowableItems item : BorrowableItemList) {
            list += item instanceof Book ? ((Book) item).isAvailable() ? (((Book) item).displayInfo()) + "\n\n" : "" : "";
        }
        return list;
    }

    public String displayLibraryInfo() {
        return "Total number of items : " + BorrowableItemList.size();
    }
}
