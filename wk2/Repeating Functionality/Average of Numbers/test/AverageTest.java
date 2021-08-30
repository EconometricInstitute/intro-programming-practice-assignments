import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

public class AverageTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        Locale.setDefault(new Locale("en", "US"));
    }

    @Test
    public void testCase1() {
        String input =
                "5" + System.lineSeparator() + "22" + System.lineSeparator() + "9" + System.lineSeparator() + "-2" +
                        System.lineSeparator() + "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Average.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(6, lines.length);

        Assert.assertEquals("Give a number:", lines[0]);
        Assert.assertEquals("Give a number:", lines[1]);
        Assert.assertEquals("Give a number:", lines[2]);
        Assert.assertEquals("Give a number:", lines[3]);
        Assert.assertEquals("Give a number:", lines[4]);

        Assert.assertEquals("Average of the numbers: 8.5", lines[5]);
    }

    @Test
    public void testCase2() {
        String input = "22" + System.lineSeparator() + "0";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Average.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);

        Assert.assertEquals("Give a number:", lines[0]);
        Assert.assertEquals("Give a number:", lines[1]);

        Assert.assertEquals("Average of the numbers: 22.0", lines[2]);
    }

    @Test
    public void testCase3() {
        String input =
                "10" + System.lineSeparator() + "4" + System.lineSeparator() + "5" + System.lineSeparator() + "-2" +
                        System.lineSeparator() + "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Average.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(6, lines.length);

        Assert.assertEquals("Give a number:", lines[0]);
        Assert.assertEquals("Give a number:", lines[1]);
        Assert.assertEquals("Give a number:", lines[2]);
        Assert.assertEquals("Give a number:", lines[3]);
        Assert.assertEquals("Give a number:", lines[4]);

        Assert.assertEquals("Average of the numbers: 4.25", lines[5]);
    }
}
