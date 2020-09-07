import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ComparingStringsTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testCase1() {
        String input = "hello" + System.lineSeparator() + "hello";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ComparingStrings.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("Enter the first string:", lines[0]);
        Assert.assertEquals("Enter the second string:", lines[1]);
        Assert.assertEquals("Same", lines[2]);
    }

    @Test
    public void testCase2() {
        String input = "hello" + System.lineSeparator() + "world";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ComparingStrings.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("Enter the first string:", lines[0]);
        Assert.assertEquals("Enter the second string:", lines[1]);
        Assert.assertEquals("Different", lines[2]);
    }

    @Test
    public void testCase3() {
        String input = "bye" + System.lineSeparator() + "bye";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ComparingStrings.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("Enter the first string:", lines[0]);
        Assert.assertEquals("Enter the second string:", lines[1]);
        Assert.assertEquals("Same", lines[2]);
    }
    
}
