import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

public class InputsTests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        Locale.setDefault(new Locale("en", "US"));
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testCase1() {
        String input = "true" + System.lineSeparator() + "9.2" + System.lineSeparator() + "10.15";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Inputs.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());
        
        Assert.assertEquals("Please enter a boolean:", lines[0]);
        Assert.assertEquals("Please enter the first double:", lines[1]);
        Assert.assertEquals("Please enter the second double:", lines[2]);
        Assert.assertEquals("The value of the boolean input: true", lines[3]);
        Assert.assertEquals("The sum of the double inputs: 19.35", lines[4]);
    }

    @Test
    public void testCase2() {
        String input = "false" + System.lineSeparator() + "-2.0" + System.lineSeparator() + "112.1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Inputs.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals("Please enter a boolean:", lines[0]);
        Assert.assertEquals("Please enter the first double:", lines[1]);
        Assert.assertEquals("Please enter the second double:", lines[2]);
        Assert.assertEquals("The value of the boolean input: false", lines[3]);
        Assert.assertEquals("The sum of the double inputs: 110.1", lines[4]);
    }
}
