import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class UserInterfaceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCase1() {
        String input =
                "82" + System.lineSeparator() + "83" + System.lineSeparator() + "96" + System.lineSeparator() + "51" +
                        System.lineSeparator() + "48" + System.lineSeparator() + "56" + System.lineSeparator() + "61" +
                        System.lineSeparator() + "" + System.lineSeparator();

        GradeRegister register = new GradeRegister();
        Scanner scanner = new Scanner(input);

        UserInterface userInterface = new UserInterface(register, scanner);
        userInterface.start();

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(9, lines.length);

        Assert.assertEquals("The average of points: " + 68.14285714285714, lines[7].trim());
        Assert.assertEquals("The average of grades: " + 2.4285714285714284, lines[8].trim());
    }

    @Test
    public void testCase2() {
        String input =
                "80" + System.lineSeparator() + "90" + System.lineSeparator() + "85" + System.lineSeparator() + "" +
                        System.lineSeparator();

        GradeRegister register = new GradeRegister();
        Scanner scanner = new Scanner(input);

        UserInterface userInterface = new UserInterface(register, scanner);
        userInterface.start();

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(9, lines.length);

        Assert.assertEquals("The average of points: " + 85.0, lines[7].trim());
        Assert.assertEquals("The average of grades: " + 4.333333333333333, lines[8].trim());
    }
}
