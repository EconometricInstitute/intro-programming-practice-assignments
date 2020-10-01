import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SequenceToOneTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    
    @Test
    public void testCase1() {
        SequenceToOne.printFromNumberToOne(5);
        
        String[] lines = outContent.toString().split(System.lineSeparator());
        
        testForGivenNumber(lines, 5);
    }

    @Test
    public void testCase2() {
        SequenceToOne.printFromNumberToOne(100);

        String[] lines = outContent.toString().split(System.lineSeparator());

        testForGivenNumber(lines, 100);
    }

    @Test
    public void testCase3() {
        SequenceToOne.printFromNumberToOne(1);

        String[] lines = outContent.toString().split(System.lineSeparator());

        testForGivenNumber(lines, 1);
    }
    
        

    
    private void testForGivenNumber(String[] lines, int number) {
        Assert.assertEquals(lines.length, number);
        
        for (int i = 0; i < number; i++) {
            Assert.assertEquals(Integer.toString(number - i), lines[i].trim());
        }
    }
} 
