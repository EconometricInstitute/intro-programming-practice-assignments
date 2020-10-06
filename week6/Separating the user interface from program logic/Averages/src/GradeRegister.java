import java.util.ArrayList;
import java.util.List;

public class GradeRegister {

    private List<Integer> grades;
    private List<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        this.points.add(points);
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
        if (grades.isEmpty()) {
            return -1;
        }

        int sumOfGrades = 0;
        for (int grade : grades) {
            sumOfGrades = sumOfGrades + grade;
        }

        return 1.0 * sumOfGrades / grades.size();
    }

    public double averageOfPoints() {
        if (points.isEmpty()) {
            return -1;
        }

        int sumOfPoints = 0;
        for (int point : points) {
            sumOfPoints = sumOfPoints + point;
        }

        return 1.0 * sumOfPoints / points.size();
    }
}
