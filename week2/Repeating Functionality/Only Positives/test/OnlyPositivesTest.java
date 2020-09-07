import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class OnlyPositivesTest {
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
        String input =
                "5" + System.lineSeparator() + "4" + System.lineSeparator() + "-3" + System.lineSeparator() + "1" +
                        System.lineSeparator() + "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OnlyPositives.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(9, lines.length);

        Assert.assertEquals("Give a number:", lines[0]);
        Assert.assertEquals("Give a number:", lines[2]);
        Assert.assertEquals("Give a number:", lines[4]);
        Assert.assertEquals("Give a number:", lines[6]);
        Assert.assertEquals("Give a number:", lines[8]);

        Assert.assertEquals("25", lines[1]);
        Assert.assertEquals("16", lines[3]);
        Assert.assertEquals("Unsuitable number", lines[5]);
        Assert.assertEquals("1", lines[7]);
    }

    @Test
    public void testCase2() {
        String input = "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OnlyPositives.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1, lines.length);

        Assert.assertEquals("Give a number:", lines[0]);
    }

    @Test
    public void testCase3() {
        String input =
                "-1" + System.lineSeparator() + "4" + System.lineSeparator() + "-3" + System.lineSeparator() + "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        OnlyPositives.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(7, lines.length);

        Assert.assertEquals("Give a number:", lines[0]);
        Assert.assertEquals("Give a number:", lines[2]);
        Assert.assertEquals("Give a number:", lines[4]);
        Assert.assertEquals("Give a number:", lines[6]);

        Assert.assertEquals("Unsuitable number", lines[1]);
        Assert.assertEquals("16", lines[3]);
        Assert.assertEquals("Unsuitable number", lines[5]);
    }
}
