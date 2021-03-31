import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NeatPrintingTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCase1() {
        int[] numbers = {5, 1, 3, 4, 2};
        NeatPrinting.printNeatly(numbers);
        Assert.assertEquals("5, 1, 3, 4, 2", outContent.toString().trim());
    }

    @Test
    public void testCase2() {
        int[] numbers = {8, 5, 12, 1, 2};
        NeatPrinting.printNeatly(numbers);
        Assert.assertEquals("8, 5, 12, 1, 2", outContent.toString().trim());
    }
    
    @Test
    public void testCase3() {
        int[] numbers = {-1, 2, 6, 8, 10};
        NeatPrinting.printNeatly(numbers);
        Assert.assertEquals("-1, 2, 6, 8, 10", outContent.toString().trim());
    }
}
