import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class CarryOnTest {
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
                "yes" + System.lineSeparator() + "ye" + System.lineSeparator() + "y" + System.lineSeparator() + "no";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        CarryOn.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(4, lines.length);
        Assert.assertEquals("Shall we carry on?", lines[0]);
        Assert.assertEquals("Shall we carry on?", lines[1]);
        Assert.assertEquals("Shall we carry on?", lines[2]);
        Assert.assertEquals("Shall we carry on?", lines[3]);
    }

    @Test
    public void testCase2() {
        String input = "no";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        CarryOn.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1, lines.length);
        Assert.assertEquals("Shall we carry on?", lines[0]);
    }

    @Test
    public void testCase3() {
        String input =
                "yes" + System.lineSeparator() + "ye" + System.lineSeparator() + "y" + System.lineSeparator() + "yes" +
                        System.lineSeparator() + "yes" + System.lineSeparator() + "why not" + System.lineSeparator() +
                        "of course" + System.lineSeparator() + "no";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        CarryOn.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(8, lines.length);
        Assert.assertEquals("Shall we carry on?", lines[0]);
        Assert.assertEquals("Shall we carry on?", lines[1]);
        Assert.assertEquals("Shall we carry on?", lines[2]);
        Assert.assertEquals("Shall we carry on?", lines[3]);
        Assert.assertEquals("Shall we carry on?", lines[6]);
    }
}
