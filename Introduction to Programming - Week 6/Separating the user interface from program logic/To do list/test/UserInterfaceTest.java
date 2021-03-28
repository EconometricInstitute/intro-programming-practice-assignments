import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class UserInterfaceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCase1() {
        String input = "add" + System.lineSeparator() + "write an essay" + System.lineSeparator() + "add" +
                System.lineSeparator() + "read a book" + System.lineSeparator() + "stop";

        Scanner scanner = new Scanner(input);
        TodoList todoList = new TodoList();

        UserInterface userInterface = new UserInterface(todoList, scanner);
        userInterface.start();

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1, lines.length);

        System.out.println();
        todoList.print();

        lines = outContent.toString().split(System.lineSeparator());
        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("1: write an essay", lines[1].trim());
        Assert.assertEquals("2: read a book", lines[2].trim());
    }

    @Test
    public void testCase2() {
        String input = "add" + System.lineSeparator() + "write an essay" + System.lineSeparator() + "add" +
                System.lineSeparator() + "read a book" + System.lineSeparator() + "remove" + System.lineSeparator() +
                "1" + System.lineSeparator() + "stop";

        Scanner scanner = new Scanner(input);
        TodoList todoList = new TodoList();

        UserInterface userInterface = new UserInterface(todoList, scanner);
        userInterface.start();

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1, lines.length);

        System.out.println();
        todoList.print();

        lines = outContent.toString().split(System.lineSeparator());
        Assert.assertEquals(2, lines.length);
        Assert.assertEquals("1: read a book", lines[1].trim());
    }
}
