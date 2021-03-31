import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ItemsTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCase1() {
        String input =
                "Hammer" + System.lineSeparator() + "Collar" + System.lineSeparator() + "" + System.lineSeparator();

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Items.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());
        Assert.assertEquals(3, lines.length);
        Assert.assertTrue(lines[1].startsWith("Hammer"));
        Assert.assertTrue(lines[2].startsWith("Collar"));
    }

    @Test
    public void testCase2() {
        String input = "Hammer" + System.lineSeparator() + "Collar" + System.lineSeparator() + "John" +
                System.lineSeparator() + "" + System.lineSeparator();

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Items.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());
        Assert.assertEquals(4, lines.length);
        Assert.assertTrue(lines[1].startsWith("Hammer"));
        Assert.assertTrue(lines[2].startsWith("Collar"));
        Assert.assertTrue(lines[3].startsWith("John"));
    }

    @Test
    public void testCase3() {
        String input = "" + System.lineSeparator();

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Items.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());
        Assert.assertEquals(1, lines.length);
    }
}
