import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class SwapTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCase1() {
        String input = "2" + System.lineSeparator() + "4";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Swap.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(13, lines.length);
        Assert.assertEquals(1, Integer.parseInt(lines[8].trim()));
        Assert.assertEquals(3, Integer.parseInt(lines[9].trim()));
        Assert.assertEquals(9, Integer.parseInt(lines[10].trim()));
        Assert.assertEquals(7, Integer.parseInt(lines[11].trim()));
        Assert.assertEquals(5, Integer.parseInt(lines[12].trim()));
    }

    @Test
    public void testCase2() {
        String input = "0" + System.lineSeparator() + "1";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Swap.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(13, lines.length);
        Assert.assertEquals(3, Integer.parseInt(lines[8].trim()));
        Assert.assertEquals(1, Integer.parseInt(lines[9].trim()));
        Assert.assertEquals(5, Integer.parseInt(lines[10].trim()));
        Assert.assertEquals(7, Integer.parseInt(lines[11].trim()));
        Assert.assertEquals(9, Integer.parseInt(lines[12].trim()));
    }

    @Test
    public void testCase3() {
        String input = "0" + System.lineSeparator() + "4";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Swap.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(13, lines.length);
        Assert.assertEquals(9, Integer.parseInt(lines[8].trim()));
        Assert.assertEquals(3, Integer.parseInt(lines[9].trim()));
        Assert.assertEquals(5, Integer.parseInt(lines[10].trim()));
        Assert.assertEquals(7, Integer.parseInt(lines[11].trim()));
        Assert.assertEquals(1, Integer.parseInt(lines[12].trim()));
    }
}
