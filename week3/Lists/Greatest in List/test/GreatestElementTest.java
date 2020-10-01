import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class GreatestElementTest {
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
                "72" + System.lineSeparator() + "2" + System.lineSeparator() + "8" + System.lineSeparator() + "93" +
                        System.lineSeparator() + "-1";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        GreatestElement.main(new String[0]);

        Assert.assertEquals("The greatest number: 93", outContent.toString().trim());
    }

    @Test
    public void testCase2() {
        String input =
                "2" + System.lineSeparator() + "8" + System.lineSeparator() + "24" + System.lineSeparator() + "6" +
                        System.lineSeparator() + "14" + System.lineSeparator() + "-1";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        GreatestElement.main(new String[0]);

        Assert.assertEquals("The greatest number: 24", outContent.toString().trim());
    }

    @Test
    public void testCase3() {
        String input = "1" + System.lineSeparator() + "-1";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        GreatestElement.main(new String[0]);

        Assert.assertEquals("The greatest number: 1", outContent.toString().trim());
    }
}
