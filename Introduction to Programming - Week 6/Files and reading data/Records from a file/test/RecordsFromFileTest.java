import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class RecordsFromFileTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testFirstCase() {
        String input = "recordsData.txt";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        RecordsFromFile.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(5, lines.length);
        Assert.assertEquals("Name of the file:", lines[0]);
        Assert.assertEquals("lily, age: 3 years", lines[1]);
        Assert.assertEquals("anton, age: 5 years", lines[2]);
        Assert.assertEquals("levi, age: 4 years", lines[3]);
        Assert.assertEquals("amy, age: 1 year", lines[4]);
    }

    @Test
    public void testSecondCase() {
        String input = "data2.txt";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        RecordsFromFile.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(7, lines.length);
        Assert.assertEquals("Name of the file:", lines[0]);
        Assert.assertEquals("john, age: 15 years", lines[1]);
        Assert.assertEquals("jona, age: 1 year", lines[4]);
        Assert.assertEquals("melissa, age: 4 years",lines[6]);
    }
}
