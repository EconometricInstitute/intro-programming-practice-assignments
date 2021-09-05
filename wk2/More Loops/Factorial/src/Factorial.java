import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int end = scanner.nextInt();
        scanner.close();
        
        int factorial = 1;
        for (int i = 1; i <= end; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
