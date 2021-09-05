import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a boolean:");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("Please enter the first double:");
        double firstDouble = scanner.nextDouble();
        System.out.println("Please enter the second double:");
        double secondDouble = scanner.nextDouble();
        scanner.close();    
            
        System.out.println("The value of the boolean input: " + booleanValue);
        System.out.println("The sum of the double inputs: " + (firstDouble + secondDouble));
    }
}
