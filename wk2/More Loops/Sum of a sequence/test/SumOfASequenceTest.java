import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class SumOfASequenceTest {
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
    String input = "3" + System.lineSeparator() + "5";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    SumOfASequence.main(new String[0]);

    String[] lines = outContent.toString().split(System.lineSeparator());

    Assert.assertEquals(3, lines.length);

    Assert.assertEquals("The sum is: 12", lines[2]);
  }

  @Test
  public void testCase2() {
    String input = "2" + System.lineSeparator() + "8";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    SumOfASequence.main(new String[0]);

    String[] lines = outContent.toString().split(System.lineSeparator());

    Assert.assertEquals(3, lines.length);

    Assert.assertEquals("The sum is: 35", lines[2]);
  }

  @Test
  public void testCase3() {
    String input = "4" + System.lineSeparator() + "10";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    SumOfASequence.main(new String[0]);

    String[] lines = outContent.toString().split(System.lineSeparator());

    Assert.assertEquals(3, lines.length);

    Assert.assertEquals("The sum is: 49", lines[2]);
  }
}
