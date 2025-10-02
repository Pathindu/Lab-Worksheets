package LW_03.Q_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

//        library.addBook("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
//        library.addBook("Nuramakadya Bauthika Nuladanayakshanamaala", "eynamasasekaka", "9789553548721");
//        library.addBook("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");

        Scanner sc = new Scanner(System.in);

        while (true) {
            int command = 0;
            System.out.println(menu());
            command = sc.nextInt();
            switch (command) {
                case 1:
                    addBook(library);
                    break;
                case 2:
                    checkOut(library);
                    break;
                case 3:
                    System.out.println(library.listBooks());
                    break;
                case 4:
                    System.out.println(library.LibraryInfo());
                    break;
                case 5:
                    System.out.println("\nThank You!");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid Command!!\n");
            }
        }


    }

    static void addBook(Library library) {
        Scanner sc = new Scanner(System.in);
        String[] details = new String[3];
        System.out.println("\n\nEnter the book details.");
        System.out.println("\nBook title : ");
        details[0] = sc.nextLine();
        System.out.println("\nAuthor : ");
        details[1] = sc.nextLine();
        System.out.println("\nISBN : ");
        details[2] = sc.nextLine();

        library.addBook(details[0], details[1], details[2]);
    }

    static void checkOut(Library library) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the ISBN : ");
        if (library.checkOut(sc.nextLine())) {
            System.out.println("\n\nSuccessfully Checked Out!\n");
        } else {
            System.out.println("\n\nCheck Out Failed!!\n");
        }
    }

    static String menu() {
        String menu = "\n\n========Menu========\n" +
                "1. Add a book.\n" +
                "2. Check out a book.\n" +
                "3. List books.\n" +
                "4. Library information.\n" +
                "5. Exit.\n" +
                "===================\n" +
                "Enter your command number : ";
        return menu;
    }
}
