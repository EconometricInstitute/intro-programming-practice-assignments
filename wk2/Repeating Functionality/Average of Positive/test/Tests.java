import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

public class Tests {
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
                "3" + System.lineSeparator() + "5" + System.lineSeparator() + "1" + System.lineSeparator() + "-3" +
                        System.lineSeparator() + "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PositiveAverage.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1, lines.length);

        Assert.assertEquals("3.0", lines[0]);
    }

    @Test
    public void testCase2() {
        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PositiveAverage.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1, lines.length);

        Assert.assertEquals("Cannot calculate the average", lines[0]);
    }

    @Test
    public void testCase3() {
        String input = "-3" + System.lineSeparator() + "1" + System.lineSeparator() +  "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PositiveAverage.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1, lines.length);

        Assert.assertEquals("1.0", lines[0]);
    }

    @Test
    public void testCase4() {
        String input = "1" + System.lineSeparator() + "1" + System.lineSeparator() +  "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PositiveAverage.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1, lines.length);

        Assert.assertEquals("1.0", lines[0]);
    }

    @Test
    public void testCase5() {
        String input = "5" + System.lineSeparator() + "3" + System.lineSeparator() +  "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PositiveAverage.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1, lines.length);

        Assert.assertEquals("4.0", lines[0]);
    }
}
