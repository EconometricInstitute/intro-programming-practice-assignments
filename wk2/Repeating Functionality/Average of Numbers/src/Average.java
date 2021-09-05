import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int amountOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sumOfNumbers = sumOfNumbers + number;
            amountOfNumbers++;
        }
        scanner.close();
        
        System.out.println("Average of the numbers: " + (1.0 * sumOfNumbers) / amountOfNumbers);
    }
}
