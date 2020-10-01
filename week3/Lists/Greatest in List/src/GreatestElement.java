import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();
            
            if (number == -1) {
                break;
            }
            
            numbers.add(number);
        }
        
        int greatest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > greatest) {
                greatest = numbers.get(i);
            }
        }

        System.out.println("The greatest number: " + greatest);
    }
}
