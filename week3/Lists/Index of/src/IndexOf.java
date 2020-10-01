import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOf {
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

        System.out.println("Search for?");
        int searchFor = scanner.nextInt();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == searchFor) {
                System.out.println(searchFor + " is at index " + i);
            }
        }
    }
}
