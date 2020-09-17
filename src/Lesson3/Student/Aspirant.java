package Lesson3.Student;

public class Aspirant extends Student {
    private String thesis; //Наличие диссертации

    public Aspirant (String firstName, String lastName, String group, double averageMark, String thesis) {
        super(firstName, lastName, group, averageMark);
        this.thesis = thesis;
    }

    @Override
    public double getScholarship(double averageMark) {
        if (averageMark == 5) {
            return 200;
        }
        else {
            return 180;
        }
    }
}
