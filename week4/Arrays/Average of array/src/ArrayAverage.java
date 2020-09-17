public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        computeAverageOfArray(array);
    }

    public static double computeAverageOfArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum = sum + element;
        }

        return 1.0 * sum / array.length;
    }
}
