package LW_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_7 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println(sdf2.format(today));
    }
}
