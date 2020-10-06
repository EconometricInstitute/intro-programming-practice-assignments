import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumberFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("File? ");
        String fileName = scanner.nextLine();

        System.out.print("Lower bound? ");
        int lowerBound = scanner.nextInt();

        System.out.print("Upper bound? ");
        int upperBound = scanner.nextInt();
        
        int foundNumbers = 0;
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                int number = Integer.parseInt(fileScanner.nextLine());
                if (lowerBound <= number && number <= upperBound) {
                    foundNumbers++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Numbers: " + foundNumbers);
    }
}
