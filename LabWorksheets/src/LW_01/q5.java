package LW_01;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle ri =new Circle(), ro = new Circle();
        System.out.println("Enter ri");
        ri.setRadius(sc.nextFloat());
        System.out.println("Enter ro");
        ro.setRadius(sc.nextFloat());

        float area = ro.computeArea() - ri.computeArea();
        System.out.println("The area of ri circle is : " + ri.computeArea());
        System.out.println("The area of ro circle is : " + ro.computeArea());
        System.out.println("The shaded area is : " + area);
        System.out.println("The circumference of ri circle is : " + ri.computeCircumference());
        System.out.println("The circumference of ro circle is : " + ro.computeCircumference());
    }
}
