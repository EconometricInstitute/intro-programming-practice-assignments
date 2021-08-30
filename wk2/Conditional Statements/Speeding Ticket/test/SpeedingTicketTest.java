import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class SpeedingTicketTest {
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
    String input = "15";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    SpeedingTicket.main(new String[0]);

    String[] lines = outContent.toString().split(System.lineSeparator());

    Assert.assertEquals(1, lines.length);
    Assert.assertEquals("Give speed:", lines[0]);
  }

  @Test
  public void testCase2() {
    String input = "135";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    SpeedingTicket.main(new String[0]);

    String[] lines = outContent.toString().split(System.lineSeparator());

    Assert.assertEquals(2, lines.length);
    Assert.assertEquals("Give speed:", lines[0]);
    Assert.assertEquals("Speeding ticket!", lines[1]);
  }

  @Test
  public void testCase3() {
    String input = "121";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    SpeedingTicket.main(new String[0]);

    String[] lines = outContent.toString().split(System.lineSeparator());

    Assert.assertEquals(2, lines.length);
    Assert.assertEquals("Give speed:", lines[0]);
    Assert.assertEquals("Speeding ticket!", lines[1]);
  }
}
