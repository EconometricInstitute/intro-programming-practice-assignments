import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.List;

public class FirstAndLastTest {
  
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

        FirstAndLast.main(new String[0]);
        
        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(2, lines.length);
        Assert.assertEquals("Tom", lines[0].trim());
        Assert.assertEquals("Mary", lines[1].trim());
    }

    @Test
    public void testCase2() {
        String input = createInput(
                List.of("Juno", "Elizabeth", "Mason", "Irene", "Olivia", "Liam", "Ida", "Christopher", "Mark",
                        "Sylvester", "Oscar", ""));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        FirstAndLast.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(2, lines.length);
        Assert.assertEquals("Juno", lines[0].trim());
        Assert.assertEquals("Oscar", lines[1].trim());
    }

    @Test
    public void testCase3() {
        String input = createInput(List.of("John", "Jane", ""));

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        FirstAndLast.main(new String[0]);

        String[] lines = outContent.toString().split(System.lineSeparator());

        Assert.assertEquals(2, lines.length);
        Assert.assertEquals("John", lines[0].trim());
        Assert.assertEquals("Jane", lines[1].trim());
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
