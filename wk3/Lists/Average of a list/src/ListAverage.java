import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }

        System.out.println("Average: " + 1.0 * sum / numbers.size());
    }
}
