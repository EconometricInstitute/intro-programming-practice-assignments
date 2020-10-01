import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SpeakingMethodTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    
    @Test
    public void testMethod() {
        SpeakingMethod.printText();
        
        Assert.assertEquals("This method speaks!", outContent.toString().trim());
    }
    
    @Test
    public void testMain() {
        SpeakingMethod.main(new String[0]);

        Assert.assertEquals("This method speaks!", outContent.toString().trim());
    }
}
