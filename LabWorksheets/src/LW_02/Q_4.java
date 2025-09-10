package LW_02;

import java.util.*;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        System.out.println("Enter 5 integers seperated by space.");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int[] m = Arrays.stream(a).sorted().toArray();
        System.out.println(m[3]);

        sc.close();
    }
}
