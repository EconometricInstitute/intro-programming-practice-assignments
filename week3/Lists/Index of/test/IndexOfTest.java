import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class IndexOfTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    

    @Test
    public void testCase1() {
        String input =
                "72" + System.lineSeparator() + "2" + System.lineSeparator() + "8" + System.lineSeparator() + "8" +
                        System.lineSeparator() + "1" + System.lineSeparator() + "-1" + System.lineSeparator() + "2";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        IndexOf.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());
        
        Assert.assertEquals(2, lines.length);
        Assert.assertEquals("Search for?", lines[0].trim());
        Assert.assertEquals("2 is at index 1", lines[1].trim());
    }

    @Test
    public void testCase2() {
        String input =
                "72" + System.lineSeparator() + "2" + System.lineSeparator() + "8" + System.lineSeparator() + "8" +
                        System.lineSeparator() + "1" + System.lineSeparator() + "-1" + System.lineSeparator() + "8";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        IndexOf.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("Search for?", lines[0].trim());
        Assert.assertEquals("8 is at index 2", lines[1].trim());
        Assert.assertEquals("8 is at index 3", lines[2].trim());
    }

    @Test
    public void testCase3() {
        String input =
                "11" + System.lineSeparator() + "11" + System.lineSeparator() + "11" + System.lineSeparator() + "11" +
                        System.lineSeparator() + "11" + System.lineSeparator() + "-1" + System.lineSeparator() + "11";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        IndexOf.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(6, lines.length);
        Assert.assertEquals("Search for?", lines[0].trim());
        Assert.assertEquals("11 is at index 0", lines[1].trim());
        Assert.assertEquals("11 is at index 1", lines[2].trim());
        Assert.assertEquals("11 is at index 2", lines[3].trim());
        Assert.assertEquals("11 is at index 3", lines[4].trim());
        Assert.assertEquals("11 is at index 4", lines[5].trim());
    }
}
