import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Give the second number:");
        int secondNumber = scanner.nextInt();
        
        if (firstNumber > secondNumber) {
            System.out.println("Greater number is: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Greater number is: " + secondNumber);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
