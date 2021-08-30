import java.util.Scanner;

public class SquaresSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumOfSquares = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            
            if (number == 0) {
                break;
            }
            
            sumOfSquares = sumOfSquares + number * number;
        }

        System.out.println("Sum of the squares: " + sumOfSquares);
    }
}
