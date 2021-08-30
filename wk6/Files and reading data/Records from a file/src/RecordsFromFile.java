import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String[] parts = fileScanner.nextLine().split(",");

                if (Integer.parseInt(parts[1]) == 1) {
                    System.out.println(parts[0] + ", age: " + parts[1] + " year");
                } else {
                    System.out.println(parts[0] + ", age: " + parts[1] + " years");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
