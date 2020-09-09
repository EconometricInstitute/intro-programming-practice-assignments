import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class SumTest {
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
        String input = "8" + System.lineSeparator() + "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Sum.main(new String[0]);

        String output = outContent.toString();
        Assert.assertTrue(output.startsWith(
                "Give the first number:" + System.lineSeparator() + "Give the second number:" + System.lineSeparator() +
                        "The sum of the numbers is "));

        output = output.replace(
                "Give the first number:" + System.lineSeparator() + "Give the second number:" + System.lineSeparator() +
                        "The sum " + "of the numbers is ", "");
        output = output.replace(System.lineSeparator(), "");

        Assert.assertEquals(11, Integer.parseInt(output));
    }

    @Test
    public void testCase2() {
        String input = "3" + System.lineSeparator() + "-1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Sum.main(new String[0]);

        String output = outContent.toString();
        Assert.assertTrue(output.startsWith(
                "Give the first number:" + System.lineSeparator() + "Give the second number:" + System.lineSeparator() +
                        "The sum " + "of the " + "numbers is "));

        output = output.replace(
                "Give the first number:" + System.lineSeparator() + "Give the second number:" + System.lineSeparator() +
                        "The sum " + "of the " + "numbers is ", "");
        output = output.replace(System.lineSeparator(), "");

        Assert.assertEquals(2, Integer.parseInt(output));
    }

    @Test
    public void testCase3() {
        String input = "7" + System.lineSeparator() + "112";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Sum.main(new String[0]);

        String output = outContent.toString();
        Assert.assertTrue(output.startsWith(
                "Give the first number:" + System.lineSeparator() + "Give the second number:" + System.lineSeparator() +
                        "The sum of" + " the " + "numbers is "));

        output = output.replace(
                "Give the first number:" + System.lineSeparator() + "Give the second number:" + System.lineSeparator() +
                        "The sum " + "of the " + "numbers is ", "");
        output = output.replace(System.lineSeparator(), "");


        Assert.assertEquals(119, Integer.parseInt(output));

    }
}
