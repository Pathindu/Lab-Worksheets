package LW_03.Q_04;

public class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public Course(Lecturer lecturer) {
        this.lecturer = new Lecturer();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getLecturer() {
        return lecturer.getLectureName();
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
