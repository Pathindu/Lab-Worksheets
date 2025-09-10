package LW_02;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, n = 1;
        while (true) {
            System.out.println("Enter an Integer. (Use negative value to stop)");
            i = sc.nextInt();
            if (i < 0) break;
            String num = String.valueOf(i);
            n = num.length();
            /*while (i > 0) {
                i /= 10;
                n++;
            }*/
            System.out.println("Number of digits = " + n);
        }

        sc.close();
    }
}
