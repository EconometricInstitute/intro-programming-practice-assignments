import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TodoListTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    
    @Test
    public void testConstructor() {
        TodoList todoList = new TodoList();
        todoList.print();
        Assert.assertTrue(outContent.toString().isEmpty());
    }

    @Test
    public void testAdd() {
        TodoList todoList = new TodoList();
        
        todoList.add("read");
        todoList.add("write");
        todoList.add("print");
        
        todoList.print();
        
        String[] lines = outContent.toString().split(System.lineSeparator());
        
        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("1: read", lines[0].trim());
        Assert.assertEquals("2: write", lines[1].trim());
        Assert.assertEquals("3: print", lines[2].trim());
    }

    @Test
    public void testRemove() {
        TodoList todoList = new TodoList();

        todoList.add("read");
        todoList.add("write");
        todoList.add("print");

        todoList.remove(3);
        todoList.print();
        
        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(2, lines.length);
        Assert.assertEquals("1: read", lines[0].trim());
        Assert.assertEquals("2: write", lines[1].trim());
    }
}
