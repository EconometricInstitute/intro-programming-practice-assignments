import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        readRecordsFromFile("data.txt");
    }
    
    public static List<Person> readRecordsFromFile(String file) {
        List<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                
                persons.add(new Person(name, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }
}
