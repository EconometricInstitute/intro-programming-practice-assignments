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

  @Test
  public void testCase1() {
    String input = "8\n3";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Task.main(new String[0]);

    String output = outContent.toString();
    Assert.assertTrue(output.startsWith("Give the first number:" + "\n" + "Give the second number:" + "\n" + "The sum of the numbers is "));

    output = output.replace("Give the first number:" + "\n" + "Give the second number:" + "\n" + "The sum of the numbers is ", "");
    output = output.replace("\n", "");

    Assert.assertEquals(11, Integer.parseInt(output));
  }

  @Test
  public void testCase2() {
    String input = "3\n-1";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Task.main(new String[0]);

    String output = outContent.toString();
    Assert.assertTrue(output.startsWith("Give the first number:" + "\n" + "Give the second number:" + "\n" + "The sum of the numbers is "));

    output = output.replace("Give the first number:" + "\n" + "Give the second number:" + "\n" + "The sum of the numbers is ", "");
    output = output.replace("\n", "");

    Assert.assertEquals(2, Integer.parseInt(output));
  }

  @Test
  public void testCase3() {
    String input = "7\n112";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Task.main(new String[0]);

    String output = outContent.toString();
    Assert.assertTrue(output.startsWith("Give the first number:" + "\n" + "Give the second number:" + "\n" + "The sum of the numbers is "));

    output = output.replace("Give the first number:" + "\n" + "Give the second number:" + "\n" + "The sum of the numbers is ", "");
    output = output.replace("\n", "");


    Assert.assertEquals(119, Integer.parseInt(output));

  }
}
