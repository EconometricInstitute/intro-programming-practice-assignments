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

            if (!books.contains(book)) {
                books.add(book);
            } else {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            }
        }

        System.out.println("Thank you! Books added:" + books.size());
    }
}
