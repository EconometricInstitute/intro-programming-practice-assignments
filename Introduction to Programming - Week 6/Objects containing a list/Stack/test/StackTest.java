import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StackTest {
    @Test
    public void testConstructor() {
        Stack stack = new Stack();
    }
    
    @Test
    public void testEmpty() {
        Stack stack = new Stack();
        Assert.assertTrue(stack.isEmpty());
    }
    
    @Test
    public void testAdd() {
        Stack stack = new Stack();
        stack.add("Hello");
        
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(List.of("Hello"), stack.values());
        
        stack.add("Hello again");
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(List.of("Hello", "Hello again"), stack.values());
    }
    
    @Test
    public void testTake() {
        Stack stack = new Stack();
        stack.add("Hello");
        
        Assert.assertEquals("Hello", stack.take());
        Assert.assertTrue(stack.isEmpty());
        
        stack.add("Bye");
        stack.add("Bye again");
        stack.add("Bye again again");
        
        Assert.assertEquals("Bye again again",stack.take());
        Assert.assertFalse(stack.isEmpty());
        
        stack.take();
        
        Assert.assertEquals("Bye", stack.take());
        Assert.assertTrue(stack.isEmpty());
    }
}
