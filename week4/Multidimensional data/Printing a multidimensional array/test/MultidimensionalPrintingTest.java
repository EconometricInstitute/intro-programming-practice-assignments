import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultidimensionalPrintingTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCase1() {
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;

        MultidimensionalPrinting.printArray(matrix);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(2, lines.length);
        Assert.assertEquals("050", lines[0].trim());
        Assert.assertEquals("307", lines[1].trim());
    }

    @Test
    public void testCase2() {
        int[][] matrix = {{3, 2, 7, 6}, {2, 4, 1, 0}, {3, 2, 1, 0}};

        MultidimensionalPrinting.printArray(matrix);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("3276", lines[0].trim());
        Assert.assertEquals("2410", lines[1].trim());
        Assert.assertEquals("3210", lines[2].trim());

    }

    @Test
    public void testCase3() {
        int[][] matrix = {{3, 2, 7, 6, 9}, {2, 4, 1, 0, 5}, {3, 2, 1, 0, 5}};

        MultidimensionalPrinting.printArray(matrix);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("32769", lines[0].trim());
        Assert.assertEquals("24105", lines[1].trim());
        Assert.assertEquals("32105", lines[2].trim());

    }
}
