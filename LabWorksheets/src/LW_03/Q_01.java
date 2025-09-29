package LW_03;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Temperature temp1 = new Temperature();
        System.out.println("Enter the celsius :");
        temp1.setCelsius(sc.nextDouble());

        sc.close();

        System.out.println("Tempereature in Fahrenheit : " + temp1.toFahrenheit());
    }
}
