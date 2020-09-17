import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class FindingIndexTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCase1() {
        String input = "3";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        FindingIndex.main(new String[0]);
        
        String[] lines = outContent.toString().split(System.lineSeparator());
        
        Assert.assertEquals(2, lines.length);
        
        Assert.assertEquals("Search for?", lines[0].trim());
        Assert.assertEquals("3 is at index 4.", lines[1].trim());
    }

    @Test
    public void testCase2() {
        String input = "7";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        FindingIndex.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(2, lines.length);

        Assert.assertEquals("Search for?", lines[0].trim());
        Assert.assertEquals("7 is at index 7.", lines[1].trim());
    }

    @Test
    public void testCase3() {
        String input = "22";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        FindingIndex.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(2, lines.length);

        Assert.assertEquals("Search for?", lines[0].trim());
        Assert.assertEquals("22 was not found.", lines[1].trim());
    }

    @Test
    public void testCase4() {
        String input = "4";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        FindingIndex.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(2, lines.length);

        Assert.assertEquals("Search for?", lines[0].trim());
        Assert.assertEquals("4 is at index 8.", lines[1].trim());
    }
}
