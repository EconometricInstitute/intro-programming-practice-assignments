import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    @Test
    public void testAddingToList() {
        List<Book> books = new ArrayList<>();

        Book book = new Book("Seriously...I'm Kidding", 2012);
        books.add(new Book("Seriously...I'm Kidding", 2012));

        Assert.assertTrue(books.contains(new Book("Seriously...I'm Kidding", 2012)));
    }
}
