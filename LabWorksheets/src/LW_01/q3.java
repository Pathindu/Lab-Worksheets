package LW_01;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length in centimetres");
        float cm = sc.nextFloat();
        float in = (float) (cm / 2.54);
        int ft = (int) (in / 12);
        in = in % 12;

        System.out.printf("%d feet and %.0f inches", ft, in);

        sc.close();
    }
}
