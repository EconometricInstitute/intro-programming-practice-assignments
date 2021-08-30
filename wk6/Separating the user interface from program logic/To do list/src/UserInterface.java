import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String action = scanner.nextLine();

            if (action.equals("stop")) {
                break;
            } else if (action.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();

                todoList.add(task);
            } else if (action.equals("list")) {
                todoList.print();
            } else if (action.equals("remove")) {
                System.out.print("Which one is removed? ");
                int toRemove = Integer.parseInt(scanner.nextLine());
                todoList.remove(toRemove);
            }
        }
    }
}
