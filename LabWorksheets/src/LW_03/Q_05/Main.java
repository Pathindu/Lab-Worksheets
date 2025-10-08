package LW_03.Q_05;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "eynamasasekaka", "9789553548721");
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");

        Library library = new Library();
        library.addLibraryBook(book1);
        library.addLibraryBook(book2);
        library.addLibraryBook(book3);

        System.out.println(library.displayLibraryInfo());

        System.out.println(library.listAvailableBooks());

        library.checkOutBook("Island of a Thousand Mirrors");

        System.out.println(library.listAvailableBooks());

    }
}
