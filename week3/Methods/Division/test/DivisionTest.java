import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DivisionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testCase1() {
        Division.division(10, 2);

        Assert.assertEquals(5, Double.parseDouble(outContent.toString().trim()), 0.01);
    }

    @Test
    public void testCase2() {
        Division.division(5, 3);

        Assert.assertEquals(5.0 / 3, Double.parseDouble(outContent.toString().trim()), 0.01);
    }

    @Test
    public void testCase3() {
        Division.division(18, 122);

        Assert.assertEquals(18.0 / 122, Double.parseDouble(outContent.toString().trim()), 0.01);
    }
}
