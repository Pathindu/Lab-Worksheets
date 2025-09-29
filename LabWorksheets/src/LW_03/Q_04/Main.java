package LW_03.Q_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter course Name :");
        String courseName = sc.nextLine();
        System.out.println("Enter course Code :");
        String courseCode = sc.nextLine();

        Course course1 = new Course(courseName, courseCode);

        Lecturer lecturer1 = null;
        System.out.println("Enter Lecture Name :");
        lecturer1.setLectureName(sc.nextLine());

//        course1.setLecturer(lecturer1);

        sc.close();
    }
}
