import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

public class ListAverageTest {

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
                "72" + System.lineSeparator() + "2" + System.lineSeparator() + "8" + System.lineSeparator() + "11" +
                        System.lineSeparator() + "-1";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ListAverage.main(new String[0]);

        Assert.assertEquals("Average: 23.25", outContent.toString().trim());
    }

    @Test
    public void testCase2() {
        String input =
                "12" + System.lineSeparator() + "8" + System.lineSeparator() + "3" + System.lineSeparator() + "-2" +
                        System.lineSeparator() + "-1";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ListAverage.main(new String[0]);

        Assert.assertEquals("Average: 5.25", outContent.toString().trim());
    }

    @Test
    public void testCase3() {
        String input =
                "12" + System.lineSeparator() + "8" + System.lineSeparator() + "3" + System.lineSeparator() + "-2" +
                        System.lineSeparator() + "5" + System.lineSeparator() + "-1";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ListAverage.main(new String[0]);

        Assert.assertEquals("Average: 5.2", outContent.toString().trim());
    }
}
