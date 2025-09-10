package LW_02;

public class Q_1 {
    public static void main(String[] args) {
        for (int i = 10; i < 50; i++) {
            if (i % 10 == 0) {
//                Breake the line
                System.out.print("\n");
            }
            System.out.printf("%d\t", i);
        }
    }
}
