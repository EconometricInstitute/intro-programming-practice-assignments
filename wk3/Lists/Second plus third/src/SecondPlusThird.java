import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            numberList.add(number);
        }

        System.out.println(numberList.get(1) + numberList.get(2));
    }
}
