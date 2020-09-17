package Lesson3.Student;

public class MainClass {
    public static void main(String[] args) {

        Student student = new Student("Иван", "Иванов", "А", 4);
        Student aspirant = new Aspirant("Петр", "Петров", "Б", 5, "Диссертация");

        Student[] students = {student, aspirant};

        for (int i = 0; i < students.length; i++) {
            if (students[i] == student) {
                System.out.println(student.getScholarship(student.averageMark));
            }
            else {
                System.out.println(aspirant.getScholarship(aspirant.averageMark));
            }
        }
    }
}
