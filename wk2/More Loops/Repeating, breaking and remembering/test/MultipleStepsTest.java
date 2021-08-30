import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

public class MultipleStepsTest {
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
                "5" + System.lineSeparator() + "2" + System.lineSeparator() + "4" + System.lineSeparator() + "-1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        MultipleSteps.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(5, lines.length);

        Assert.assertEquals("Give numbers:", lines[0]);
        Assert.assertEquals("Thx! Bye!", lines[1]);
        Assert.assertEquals("Sum: 11", lines[2]);
        Assert.assertEquals("Numbers: 3", lines[3]);
        Assert.assertTrue(lines[4].startsWith("Average: "));

        String number = lines[4].replace("Average: ", "");
        Assert.assertEquals(3.666666666, Double.parseDouble(number), 0.01);
    }

    @Test
    public void testCase2() {
        String input = "5" + System.lineSeparator() + System.lineSeparator() + "-1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        MultipleSteps.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(5, lines.length);

        Assert.assertEquals("Give numbers:", lines[0]);
        Assert.assertEquals("Thx! Bye!", lines[1]);
        Assert.assertEquals("Sum: 5", lines[2]);
        Assert.assertEquals("Numbers: 1", lines[3]);
        Assert.assertTrue(lines[4].startsWith("Average: "));

        String number = lines[4].replace("Average: ", "");
        Assert.assertEquals(5, Double.parseDouble(number), 0.01);
    }


    @Test
    public void testCase3() {
        String input =
                "-2" + System.lineSeparator() + "1" + System.lineSeparator() + "5" + System.lineSeparator() + "5" +
                        System.lineSeparator() + "-1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        MultipleSteps.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(5, lines.length);

        Assert.assertEquals("Give numbers:", lines[0]);
        Assert.assertEquals("Thx! Bye!", lines[1]);
        Assert.assertEquals("Sum: 9", lines[2]);
        Assert.assertEquals("Numbers: 4", lines[3]);
        Assert.assertTrue(lines[4].startsWith("Average: "));

        String number = lines[4].replace("Average: ", "");
        Assert.assertEquals(2.25, Double.parseDouble(number), 0.01);
    }
}
