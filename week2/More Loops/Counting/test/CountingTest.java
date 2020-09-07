import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class CountingTest {
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
    String input = "4";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Counting.main(new String[0]);

    String[] lines = outContent.toString().split(System.lineSeparator());

    Assert.assertEquals(5, lines.length);

    Assert.assertEquals("0", lines[0]);
    Assert.assertEquals("1", lines[1]);
    Assert.assertEquals("2", lines[2]);
    Assert.assertEquals("3", lines[3]);
    Assert.assertEquals("4", lines[4]);
  }

  @Test
  public void testCase2() {
    String input = "2";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Counting.main(new String[0]);

    String[] lines = outContent.toString().split(System.lineSeparator());

    Assert.assertEquals(3, lines.length);

    Assert.assertEquals("0", lines[0]);
    Assert.assertEquals("1", lines[1]);
    Assert.assertEquals("2", lines[2]);
  }

  @Test
  public void testCase3() {
    String input = "10";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Counting.main(new String[0]);

    String[] lines = outContent.toString().split(System.lineSeparator());

    Assert.assertEquals(11, lines.length);

    Assert.assertEquals("0", lines[0]);
    Assert.assertEquals("1", lines[1]);
    Assert.assertEquals("9", lines[9]);
    Assert.assertEquals("10", lines[10]);
  }
}
