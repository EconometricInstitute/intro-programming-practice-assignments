import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class GreetingTest {
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
    String input = "Ada";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Greeting.main(new String[0]);
    
    String output = outContent.toString();
    Assert.assertTrue(output.startsWith("What's your name?"));

    output = output.replace("What's your name?", "");
    output = output.replace(System.lineSeparator(), "");

    Assert.assertEquals("Hi " + input, output);
  }

  @Test
  public void testCase2() {
    String input = "Once upon a time...";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Greeting.main(new String[0]);

    String output = outContent.toString();
    Assert.assertTrue(output.startsWith("What's your name?"));

    output = output.replace("What's your name?", "");
    output = output.replace(System.lineSeparator(), "");

    Assert.assertEquals("Hi " + input, output);
  }

  @Test
  public void testCase3() {
    String input = "Arbitrary name";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Greeting.main(new String[0]);

    String output = outContent.toString();
    Assert.assertTrue(output.startsWith("What's your name?"));

    output = output.replace("What's your name?", "");
    output = output.replace(System.lineSeparator(), "");

    Assert.assertEquals("Hi " + input, output);
  }
}
