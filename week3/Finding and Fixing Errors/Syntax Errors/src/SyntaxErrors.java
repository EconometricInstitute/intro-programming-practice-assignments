import java.util.Scanner;

public class SyntaxErrors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input an integer lower bound:");
        int lowerBound = scanner.nextInt();

        System.out.println("Please input an integer upper bound:");
        int upperBound = scanner.nextInt();

        int sum = 0;
        int currentNumber = lowerBound;
        while (currentNumber <= upperBound) {
            sum = sum + currentNumber;
            currentNumber++;
        }

        System.out.println("The sum is: " + sum);
    }
}
