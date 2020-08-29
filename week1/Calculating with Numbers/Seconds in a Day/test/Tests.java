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
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Task.main(new String[0]);

        String output = outContent.toString();
        Assert.assertTrue(output.startsWith("How many days would you like to convert to seconds?"));

        output = output.replace("How many days would you like to convert to seconds?\n", "");
        output = output.replace("\n", "");

        Assert.assertEquals(3600 * 24, Integer.parseInt(output));
    }

    @Test
    public void testCase2() {
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Task.main(new String[0]);
        
        String output = outContent.toString();
        Assert.assertTrue(output.startsWith("How many days would you like to convert to seconds?"));
        
        output = output.replace("How many days would you like to convert to seconds?\n", "");
        output = output.replace("\n", "");
                
        Assert.assertEquals(3 * 3600 * 24, Integer.parseInt(output));
    }

    @Test
    public void testCase3() {
        String input = "7";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Task.main(new String[0]);

        String output = outContent.toString();
        Assert.assertTrue(output.startsWith("How many days would you like to convert to seconds?"));

        output = output.replace("How many days would you like to convert to seconds?\n", "");
        output = output.replace("\n", "");

        Assert.assertEquals(7 * 3600 * 24, Integer.parseInt(output));
        
    }

    @Test
    public void testCase4() {
        String input = "12";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Task.main(new String[0]);

        String output = outContent.toString();
        Assert.assertTrue(output.startsWith("How many days would you like to convert to seconds?"));

        output = output.replace("How many days would you like to convert to seconds?\n", "");
        output = output.replace("\n", "");

        Assert.assertEquals(12 * 3600 * 24, Integer.parseInt(output));
    }


}
