import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        String firstText = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondText = scanner.nextLine();
        
        if (firstText.equals(secondText)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
