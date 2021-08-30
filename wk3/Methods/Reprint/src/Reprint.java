import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int numberOfTimes = scanner.nextInt();

        for (int i = 0; i < numberOfTimes; i++) {
            printText();
        }
    }

    public static void printText() {
        System.out.println("This method speaks!");
    }
}
    
