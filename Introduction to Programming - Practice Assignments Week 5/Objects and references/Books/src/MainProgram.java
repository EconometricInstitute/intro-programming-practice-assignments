import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int year = Integer.parseInt(scanner.nextLine());

            Book book = new Book(name, year);

            // Change the below code to make sure books are not added again
books.add(book);
        }

        System.out.println("Thank you! Books added:" + books.size());
    }
}
