import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class SyntaxErrorsTest {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  @Test
  public void testCase1() {
    String input = "2" + System.lineSeparator() + "5";
            
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    SyntaxErrors.main(new String[0]);

    String[] lines = outContent.toString().split(System.lineSeparator());
    
    Assert.assertEquals(3, lines.length);
    Assert.assertEquals("Please input an integer lower bound:", lines[0]);
    Assert.assertEquals("Please input an integer upper bound:", lines[1]);
    Assert.assertEquals("The sum is: 14", lines[2]);
  }

  @Test
  public void testCase2() {
    String input = "-3" + System.lineSeparator() + "-1";

    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    SyntaxErrors.main(new String[0]);

    String[] lines = outContent.toString().split(System.lineSeparator());

    Assert.assertEquals(3, lines.length);
    Assert.assertEquals("Please input an integer lower bound:", lines[0]);
    Assert.assertEquals("Please input an integer upper bound:", lines[1]);
    Assert.assertEquals("The sum is: -6", lines[2]);
  }

  @Test
  public void testCase3() {
    String input = "-5" + System.lineSeparator() + "5";

    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    SyntaxErrors.main(new String[0]);

    String[] lines = outContent.toString().split(System.lineSeparator());

    Assert.assertEquals(3, lines.length);
    Assert.assertEquals("Please input an integer lower bound:", lines[0]);
    Assert.assertEquals("Please input an integer upper bound:", lines[1]);
    Assert.assertEquals("The sum is: 0", lines[2]);
  }
}
