import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Tests {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private final PrintStream originalErr = System.err;

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  public void testCase1() {
    String input = "Ada";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Task.main(new String[0]);
    Assert.assertEquals("Hi " + input + "\n", outContent.toString());
  }

  @Test
  public void testCase2() {
    String input = "Once upon a time...";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Task.main(new String[0]);
    Assert.assertEquals("Hi " + input + "\n", outContent.toString());
  }

  @Test
  public void testCase3() {
    String input = "Arbitrary name";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Task.main(new String[0]);
    Assert.assertEquals("Hi " + input + "\n", outContent.toString());
  }
}
