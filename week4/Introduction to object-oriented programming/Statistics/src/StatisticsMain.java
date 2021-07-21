import java.util.Scanner;

public class StatisticsMain {
    public static void main(String[] args) {
        System.out.println("Enter numbers:");

        Statistics statistics = new Statistics();
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            statistics.addNumber(number);
        }

        System.out.println("Sum: " + statistics.sum());
    }
}
 
