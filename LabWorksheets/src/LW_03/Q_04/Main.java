package LW_03.Q_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lecturer lecturer1 = new Lecturer();
        System.out.println("Enter Lecture Name :");
        lecturer1.setLecturerName(sc.nextLine());
        System.out.println("Enter Lecture Subject :");
        lecturer1.setCourseTeaching(sc.nextLine());

        Course course1 = new Course();
        System.out.println("Enter course Name :");
        course1.setCourseName(sc.nextLine());
        System.out.println("Enter course Code :");
        course1.setCourseCode(sc.nextLine());

//        course1.setLecturer(lecturer1);

        Student student1 = new Student();
        System.out.println("Enter student Name :");
        student1.setStudentName(sc.nextLine());
        System.out.println("Enter student degree :");
        student1.setDegreeName(sc.nextLine());
        System.out.println("Enter student course following :");
        student1.setDegreeName(sc.nextLine());


        sc.close();
    }
}
