package LW_03.Q_05;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
        library.addBook("Nuramakadya Bauthika Nuladanayakshanamaala", "eynamasasekaka", "9789553548721");
        library.addBook("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");

        System.out.println(library.listBooks());


    }
}
