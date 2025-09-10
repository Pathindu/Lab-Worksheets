package LW_01;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name");
        String fname = sc.nextLine();
        System.out.println("Enter your middle name");
        String mname = sc.nextLine();
        System.out.println("Enter your last name");
        String lname = sc.nextLine();

        /*System.out.println("Enter your name");
        String fname = sc.next();
        String mname = sc.next();
        String lname = sc.next();*/

        System.out.printf("%s, %s %c.", lname, fname, mname.charAt(0));

        sc.close();
    }
}
