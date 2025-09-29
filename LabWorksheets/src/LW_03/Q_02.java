package LW_03;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Temperature temp2 = new Temperature();
        System.out.println("Enter fahrenheit :");
        temp2.setFahrenheit(sc.nextDouble());

        sc.close();

        System.out.println("Temperature in celsius : " + temp2.toCelsius());
    }
}
