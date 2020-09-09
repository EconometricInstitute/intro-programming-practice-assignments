import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int number = scanner.nextInt();
        
        int numberOfSeconds = number * 3600 * 24;

        System.out.println(numberOfSeconds);
    }
}
