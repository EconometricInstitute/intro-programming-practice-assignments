import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class SquaresSumTest {
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
                "2" + System.lineSeparator() + "3" + System.lineSeparator() + "4" + System.lineSeparator() + "-2" +
                        System.lineSeparator() + "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        SquaresSum.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(6, lines.length);

        Assert.assertEquals("Give a number:", lines[0]);
        Assert.assertEquals("Give a number:", lines[1]);
        Assert.assertEquals("Give a number:", lines[2]);
        Assert.assertEquals("Give a number:", lines[3]);
        Assert.assertEquals("Give a number:", lines[4]);

        Assert.assertEquals("Sum of the squares: 33", lines[5]);
    }

    @Test
    public void testCase2() {
        String input = "0";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        SquaresSum.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(2, lines.length);

        Assert.assertEquals("Give a number:", lines[0]);

        Assert.assertEquals("Sum of the squares: 0", lines[1]);
    }

    @Test
    public void testCase3() {
        String input =
                "10" + System.lineSeparator() + "4" + System.lineSeparator() + "5" + System.lineSeparator() + "-2" +
                        System.lineSeparator() + "0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        SquaresSum.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(6, lines.length);

        Assert.assertEquals("Give a number:", lines[0]);
        Assert.assertEquals("Give a number:", lines[1]);
        Assert.assertEquals("Give a number:", lines[2]);
        Assert.assertEquals("Give a number:", lines[3]);
        Assert.assertEquals("Give a number:", lines[4]);

        Assert.assertEquals("Sum of the squares: 145", lines[5]);
    }
}
