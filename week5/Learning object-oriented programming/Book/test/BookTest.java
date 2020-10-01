import org.junit.Assert;
import org.junit.Test;

public class BookTest {
    @Test
    public void testToString() {
        Book book = new Book("J. K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);
        
        Assert.assertEquals("J. K. Rowling, Harry Potter and the Sorcerer's Stone, 223 pages", book.toString());

        book = new Book("George Orwell", "1984", 383);
        Assert.assertEquals("George Orwell, 1984, 383 pages", book.toString());
    }
    
    @Test
    public void testAuthor() {
        Book book = new Book("George Orwell", "1984", 383);
        
        Assert.assertEquals("George Orwell", book.getAuthor());
    }
    
    @Test
    public void testName() {
        Book book = new Book("George Orwell", "1984", 383);

        Assert.assertEquals("1984", book.getName());
    }
    
    @Test
    public void testPages() {
        Book book = new Book("George Orwell", "1984", 383);

        Assert.assertEquals(383, book.getPages());
    }
    
    
    
}
