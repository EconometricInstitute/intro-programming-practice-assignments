import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> texts = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            texts.add(input);
        }

        System.out.println(texts.get(0));
        System.out.println(texts.get(texts.size() - 1));
    }
}
