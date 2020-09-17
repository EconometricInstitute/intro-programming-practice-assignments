import java.util.Scanner;

public class FindingIndex {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 12;
        numbers[1] = 6;
        numbers[2] = 9;
        numbers[3] = 14;
        numbers[4] = 3;
        numbers[5] = 10;
        numbers[6] = 11;
        numbers[7] = 7;
        numbers[8] = 4;
        numbers[9] = 6;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for?");
        int searchKey = scanner.nextInt();
        
        int index = 0;
        boolean found = false;
        while (index < numbers.length) {
            if (numbers[index] == searchKey) {
                System.out.println(searchKey + " is at index " + index + ".");
                found = true;
            }
            index++;
        }
        
        if (!found) {
            System.out.println(searchKey + " was not found.");
        }
    }
}
