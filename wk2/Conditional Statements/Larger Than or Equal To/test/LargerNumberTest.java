import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class LargerNumberTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
      System.setOut(new PrintStream(outContent));
      System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testCase1() {
      String input = "5" + System.lineSeparator() + "3";
      InputStream in = new ByteArrayInputStream(input.getBytes());
      System.setIn(in);

      LargerNumber.main(new String[0]);

      String[] lines = outContent.toString().split(System.lineSeparator());

      Assert.assertEquals(3, lines.length);
      Assert.assertEquals("Give the first number:", lines[0]);
      Assert.assertEquals("Give the second number:", lines[1]);
      Assert.assertEquals("Greater number is: 5", lines[2]);
    }

    @Test
    public void testCase2() {
        String input = "5" + System.lineSeparator() + "8";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        LargerNumber.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("Give the first number:", lines[0]);
        Assert.assertEquals("Give the second number:", lines[1]);
        Assert.assertEquals("Greater number is: 8", lines[2]);
    }

    @Test
    public void testCase3() {
        String input = "5" + System.lineSeparator() + "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        LargerNumber.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("Give the first number:", lines[0]);
        Assert.assertEquals("Give the second number:", lines[1]);
        Assert.assertEquals("The numbers are equal!", lines[2]);
    }

    @Test
    public void testCase4() {
        String input = "-3" + System.lineSeparator() + "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        LargerNumber.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(3, lines.length);
        Assert.assertEquals("Give the first number:", lines[0]);
        Assert.assertEquals("Give the second number:", lines[1]);
        Assert.assertEquals("Greater number is: 2", lines[2]);
    }
}
