import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.time.LocalDate;

public class CalendarTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    
    @Test
    public void testConstructor() {
        Calendar calendar = new Calendar();
        
        calendar.print();
        
        Assert.assertEquals("Calendar is empty", outContent.toString().trim());
    }

    @Test
    public void testAdd() {
        Calendar calendar = new Calendar();
        calendar.addDate(LocalDate.of(2019, 1, 1));
        calendar.addDate(LocalDate.of(2019, 2, 5));

        calendar.print();

        String[] lines = outContent.toString().split(System.lineSeparator());
        
        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("Dates in the calendar are:", lines[0].trim());
        Assert.assertEquals(LocalDate.of(2019, 1, 1).toString(), lines[1].trim());
        Assert.assertEquals(LocalDate.of(2019, 2, 5).toString(), lines[2].trim());
    }
    
    @Test
    public void testLatest() {
        Calendar calendar = new Calendar();
        calendar.addDate(LocalDate.of(2019, 1, 1));
        calendar.addDate(LocalDate.of(2019, 2, 5));
        calendar.addDate(LocalDate.of(2016, 9, 25));
        calendar.addDate(LocalDate.of(2019, 2, 16));
        calendar.addDate(LocalDate.of(2019, 3, 5));

        Assert.assertEquals(LocalDate.of(2019, 3, 5), calendar.getLatestDate());
    }
}
