import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

public class ListSizeTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testCase1() {
        String input = createInput(List.of("Tom", "Emma", "Alex", "Mary", ""));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ListSize.main(new String[0]);

        Assert.assertEquals("In total: 4", outContent.toString().trim());
    }

    @Test
    public void testCase2() {
        String input = createInput(
                List.of("Juno", "Elizabeth", "Mason", "Irene", "Olivia", "Liam", "Ida", "Christopher", "Mark",
                        "Sylvester", "Oscar", ""));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ListSize.main(new String[0]);

        Assert.assertEquals("In total: 11", outContent.toString().trim());
    }

    @Test
    public void testCase3() {
        String input = createInput(List.of("John", "Jane", ""));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ListSize.main(new String[0]);

        Assert.assertEquals("In total: 2", outContent.toString().trim());
    }

    private String createInput(List<String> names) {
        StringBuilder input = new StringBuilder();

        for (int i = 0; i < names.size(); i++) {
            input.append(names.get(i));
            input.append(System.lineSeparator());
        }

        return input.toString();
    }
}
