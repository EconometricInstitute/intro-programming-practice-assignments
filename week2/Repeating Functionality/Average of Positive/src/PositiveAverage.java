import java.util.Scanner;

public class PositiveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int amountOfNumbers = 0;

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            } else if (number < 0) {
                continue;
            }

            sumOfNumbers = sumOfNumbers + number;
            amountOfNumbers++;
        }

        if (amountOfNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((1.0 * sumOfNumbers) / amountOfNumbers);
        }
    }
}
