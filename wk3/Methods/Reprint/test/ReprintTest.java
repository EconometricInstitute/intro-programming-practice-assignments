import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ReprintTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testMethod() {
        Reprint.printText();

        Assert.assertEquals("This method speaks!", outContent.toString().trim());
    }

    @Test
    public void testCase1() {
        String input = "7";
        
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Reprint.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());
        
        Assert.assertEquals(8, lines.length);
        Assert.assertEquals("How many times?", lines[0].trim());
        Assert.assertEquals("This method speaks!", lines[1].trim());
        Assert.assertEquals("This method speaks!", lines[2].trim());
        Assert.assertEquals("This method speaks!", lines[3].trim());
        Assert.assertEquals("This method speaks!", lines[4].trim());
        Assert.assertEquals("This method speaks!", lines[5].trim());
        Assert.assertEquals("This method speaks!", lines[6].trim());
        Assert.assertEquals("This method speaks!", lines[7].trim());
    }

    @Test
    public void testCase2() {
        String input = "4";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Reprint.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(5, lines.length);
        Assert.assertEquals("How many times?", lines[0].trim());
        Assert.assertEquals("This method speaks!", lines[1].trim());
        Assert.assertEquals("This method speaks!", lines[2].trim());
        Assert.assertEquals("This method speaks!", lines[3].trim());
        Assert.assertEquals("This method speaks!", lines[4].trim());
    }

    @Test
    public void testCase3() {
        String input = "0";
        
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Reprint.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1, lines.length);
        Assert.assertEquals("How many times?", lines[0].trim());
    }

}
