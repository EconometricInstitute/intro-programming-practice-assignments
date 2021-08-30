import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class NumbersFromFileTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    
    @Test
    public void testFirstCase() {
        String input = "numbers-1.txt" + System.lineSeparator() + "15" + System.lineSeparator()
                + "20";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        NumberFromFile.main(new String[0]);
        
        String[] lines = outContent.toString().split(System.lineSeparator());
        
        Assert.assertEquals(1, lines.length);
        Assert.assertTrue(lines[0].endsWith("Numbers: 2"));
    }

    @Test
    public void testSecondCase() {
        String input = "numbers-1.txt" + System.lineSeparator() + "0" + System.lineSeparator()
                + "300";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        NumberFromFile.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1, lines.length);
        Assert.assertTrue(lines[0].endsWith("Numbers: 4"));
    }
    
    @Test
    public void testThirdCase() {
        String input = "numbers-2.txt" + System.lineSeparator() + "-10" + System.lineSeparator()
                + "130";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        NumberFromFile.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(1, lines.length);
        Assert.assertTrue(lines[0].endsWith("Numbers: 4"));
    }
    
    
    
}
