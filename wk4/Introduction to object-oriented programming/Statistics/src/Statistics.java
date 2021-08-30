public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        count = 0;
    }

    public void addNumber(int number) {
        count++;
        sum = sum + number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        double average = 0;
        if (count == 0) {
            average = 0;
        } else {
            average = 1.0 * sum / count;
        }
        return average;
    }
}
