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
    int firstNumber = 2;
    int secondNumber = 8;
    
    String input = firstNumber + "\n" + secondNumber;
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Task.main(new String[0]);

    String output = outContent.toString();
    Assert.assertTrue(output.startsWith("Give the first number:" + "\n" + "Give the second number:" + "\n"));

    output = output.replace("Give the first number:" + "\n" + "Give the second number:" + "\n","");
    output = output.replace("\n", "");
    
    
    Assert.assertEquals(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber), output);
  }

  @Test
  public void testCase2() {
    int firstNumber = 277;
    int secondNumber = 111;

    String input = firstNumber + "\n" + secondNumber;
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Task.main(new String[0]);

    String output = outContent.toString();
    Assert.assertTrue(output.startsWith("Give the first number:" + "\n" + "Give the second number:" + "\n"));

    output = output.replace("Give the first number:" + "\n" + "Give the second number:" + "\n","");
    output = output.replace("\n", "");


    Assert.assertEquals(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber), output);
  }

  @Test
  public void testCase3() {
    int firstNumber = 12;
    int secondNumber = -3;

    String input = firstNumber + "\n" + secondNumber;
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Task.main(new String[0]);

    String output = outContent.toString();
    Assert.assertTrue(output.startsWith("Give the first number:" + "\n" + "Give the second number:" + "\n"));

    output = output.replace("Give the first number:" + "\n" + "Give the second number:" + "\n","");
    output = output.replace("\n", "");


    Assert.assertEquals(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber), output);

  }
}
