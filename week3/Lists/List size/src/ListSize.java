import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> names = new ArrayList<>();
        while (true) {
            String value = scanner.nextLine();
            
            if (value.equals("")) {
                break;
            }
            
            names.add(value);
        }

        System.out.println("In total: " + names.size());
    }
}
