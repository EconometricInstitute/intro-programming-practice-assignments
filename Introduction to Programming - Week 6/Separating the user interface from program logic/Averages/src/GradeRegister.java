import java.util.ArrayList;
import java.util.List;

public class GradeRegister {

    private List<Integer> grades;
    // Add new instance variables here

    public GradeRegister() {
        this.grades = new ArrayList<>();
        // Make changes to the constructor here
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        // Make changes to the method here
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrades(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        // Add method implementation here
    }

    public double averageOfPoints() {
        // Add method implementation here
    }
}
