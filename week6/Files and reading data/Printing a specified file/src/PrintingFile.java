import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        
        String fileName = scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
