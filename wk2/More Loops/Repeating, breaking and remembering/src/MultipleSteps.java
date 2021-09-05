import java.util.Scanner;

public class MultipleSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int amountOfNumbers = 0;
        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            sum = sum + number;
            amountOfNumbers++;
        }
        scanner.close();
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + amountOfNumbers);
        System.out.println("Average: " + (1.0 * sum) / amountOfNumbers);
    }
}
