package Lesson3.Student;

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;

    public Student (String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship (double averageMark) {
        if (averageMark == 5) {
            return 100;
        }
        else {
            return 80;
        }
    }
}
