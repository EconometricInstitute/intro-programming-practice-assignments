import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class AverageTest {
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
        int firstNumber = 8;
        int secondNumber = 2;
        int thirdNumber = 3;

        String input = firstNumber + System.lineSeparator() + secondNumber + System.lineSeparator() + thirdNumber;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Average.main(new String[0]);

        String output = outContent.toString();
        Assert.assertTrue(output.startsWith(
                "Give the first number:" + System.lineSeparator() + "Give the second number:" + System.lineSeparator() +
                        "Give " + "the " + "third number:" + System.lineSeparator() + "The average is "));

        output = output.replace(
                "Give the first number:" + System.lineSeparator() + "Give the second number:" + System.lineSeparator() + "Give " + "the third number:" +
                        System.lineSeparator() + "The average is ", "");
        output = output.replace(System.lineSeparator(), "");


        Assert.assertEquals(((double) firstNumber + secondNumber + thirdNumber) / 3, Double.parseDouble(output), 0.001);
    }

    @Test
    public void testCase2() {
        int firstNumber = 9;
        int secondNumber = 5;
        int thirdNumber = -1;

        String input = firstNumber + System.lineSeparator() + secondNumber + System.lineSeparator() + thirdNumber;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Average.main(new String[0]);

        String output = outContent.toString();
        Assert.assertTrue(output.startsWith(
                "Give the first number:" + System.lineSeparator() + "Give the second number:" + System.lineSeparator() +
                        "Give" + " " + "the third number:" + System.lineSeparator() + "The average is "));

        output = output.replace(
                "Give the first number:" + System.lineSeparator() + "Give the second number:" + System.lineSeparator() +
                        "Give " + "the " + "third number:" + System.lineSeparator() + "The average is ", "");
        output = output.replace(System.lineSeparator(), "");


        Assert.assertEquals(((double) firstNumber + secondNumber + thirdNumber) / 3, Double.parseDouble(output), 0.001);
    }

    @Test
    public void testCase3() {
        int firstNumber = -10;
        int secondNumber = 112;
        int thirdNumber = 1000;

        String input = firstNumber + System.lineSeparator() + secondNumber + System.lineSeparator() + thirdNumber;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Average.main(new String[0]);

        String output = outContent.toString();
        Assert.assertTrue(output.startsWith(
                "Give the first number:" + System.lineSeparator() + "Give the second number:" + System.lineSeparator() +
                        "Give " + "the " + "third number:" + System.lineSeparator() + "The average is "));

        output = output.replace(
                "Give the first number:" + System.lineSeparator() + "Give the second number:" + System.lineSeparator() +
                        "Give " + "the " + "third number:" + System.lineSeparator() + "The average is ", "");
        output = output.replace(System.lineSeparator(), "");


        Assert.assertEquals(((double) firstNumber + secondNumber + thirdNumber) / 3, Double.parseDouble(output), 0.001);
    }
}
