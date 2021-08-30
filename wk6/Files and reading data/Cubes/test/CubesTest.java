import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class CubesTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCase1() {
        String input = "3" + System.lineSeparator() + -1 + System.lineSeparator() + 11 + System.lineSeparator() + "end";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Cubes.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);
        Assert.assertEquals(27, Integer.parseInt(lines[0]));
        Assert.assertEquals(-1, Integer.parseInt(lines[1]));
        Assert.assertEquals(1331, Integer.parseInt(lines[2]));
    }

    @Test
    public void testCase2() {
        String input = "-5" + System.lineSeparator() + -3 + System.lineSeparator() + "end";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Cubes.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(2, lines.length);
        Assert.assertEquals(-125, Integer.parseInt(lines[0]));
        Assert.assertEquals(-27, Integer.parseInt(lines[1]));
    }

    @Test
    public void testCase3() {
        String input = "-5" + System.lineSeparator() + -3 + System.lineSeparator() + 1 + System.lineSeparator() + 7 +
                System.lineSeparator() + 8 + System.lineSeparator() + "end";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Cubes.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(5, lines.length);
        Assert.assertEquals(-125, Integer.parseInt(lines[0]));
        Assert.assertEquals(-27, Integer.parseInt(lines[1]));
        Assert.assertEquals(1, Integer.parseInt(lines[2]));
        Assert.assertEquals(7 * 7 * 7, Integer.parseInt(lines[3]));
        Assert.assertEquals(8 * 8 * 8, Integer.parseInt(lines[4]));
    }


}
