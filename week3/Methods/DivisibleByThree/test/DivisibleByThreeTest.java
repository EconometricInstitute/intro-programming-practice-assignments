import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DivisibleByThreeTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testCase1() {
        DivisibleByThree.divisibleByThreeInRange(3,6);

        String[] lines = outContent.toString().split(System.lineSeparator());
        
        Assert.assertEquals(2, lines.length);
        Assert.assertEquals("3", lines[0]);
        Assert.assertEquals("6", lines[1]);
    }

    @Test
    public void testCase2() {
        DivisibleByThree.divisibleByThreeInRange(2,10);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("3", lines[0]);
        Assert.assertEquals("6", lines[1]);
        Assert.assertEquals("9", lines[2]);
    }

    @Test
    public void testCase3() {
        DivisibleByThree.divisibleByThreeInRange(10,18);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("12", lines[0]);
        Assert.assertEquals("15", lines[1]);
        Assert.assertEquals("18", lines[2]);
    }
}
