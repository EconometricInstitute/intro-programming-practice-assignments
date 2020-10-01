import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class SecondPlusThirdTest {
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
                "1" + System.lineSeparator() + "3" + System.lineSeparator() + "5" + System.lineSeparator() + "7" +
                        System.lineSeparator() + "0";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        SecondPlusThird.main(new String[0]);

        Assert.assertEquals(8, Integer.parseInt(outContent.toString().trim()));
    }

    @Test
    public void testCase2() {
        String input = "2" + System.lineSeparator() + "3" + System.lineSeparator() + "4" + System.lineSeparator() + "0";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        SecondPlusThird.main(new String[0]);

        Assert.assertEquals(7, Integer.parseInt(outContent.toString().trim()));
    }

    @Test
    public void testCase3() {
        String input =
                "110" + System.lineSeparator() + "-12" + System.lineSeparator() + "15" + System.lineSeparator() + 
                "0";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        SecondPlusThird.main(new String[0]);

        Assert.assertEquals(3, Integer.parseInt(outContent.toString().trim()));
    }
}
