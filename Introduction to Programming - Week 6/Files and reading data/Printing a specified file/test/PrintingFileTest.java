import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class PrintingFileTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testFirstFile() {
        String input = "song.txt";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        PrintingFile.main(new String[0]);
        
        String[] lines = outContent.toString().split(System.lineSeparator());
        
        Assert.assertTrue(lines.length >= 14);

        Assert.assertEquals("Which file should have its contents printed?", lines[0].trim());
        Assert.assertEquals("No option for duality", lines[1].trim());
        Assert.assertEquals("Tieto is here allright!", lines[13].trim());
    }

    @Test
    public void testSecondFile() {
        String input = "data.txt";

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        PrintingFile.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertTrue(lines.length >= 11);

        Assert.assertEquals("Which file should have its contents printed?", lines[0].trim());
        Assert.assertEquals("1992: 12.4", lines[1].trim());
        Assert.assertEquals("2001: 16.5", lines[10].trim());
    }
}
