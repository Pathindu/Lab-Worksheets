package LW_01;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word;
        System.out.println("Enter an odd-length word");
        while (true) {
            word = sc.next();
            if (word.length() % 2 == 1) {
                break;
            }
            System.out.println("Your word is not an odd-length word");
            System.out.println("Enter an odd-length word");
        }
        int l = word.length();
        int m = (l / 2);
        System.out.println("Middle character of your word is:");
        System.out.println(word.charAt(m));

        sc.close();
    }
}
