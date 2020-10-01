import org.junit.Assert;
import org.junit.Test;

import java.sql.Time;

public class TimerTest {

    @Test
    public void testConstructor() {
        Timer timer = new Timer();

        Assert.assertEquals("0:0", timer.toString());
    }

    @Test
    public void testAdvance() {
        Timer timer = new Timer();

        timer.advance();
        Assert.assertEquals("0:1", timer.toString());

        timer.advance();
        Assert.assertEquals("0:2", timer.toString());
    }
    
    @Test
    public void testHundredsWrapping() {
        Timer timer = new Timer();
        
        for (int i = 0; i < 100; i++) {
            timer.advance();
        }
        
        Assert.assertEquals("1:0", timer.toString());
    }
    
    @Test
    public void testSecondsWrapping() {
        Timer timer = new Timer();
        
        for (int i = 0; i < 60*100; i++) {
            timer.advance();
        }
        
        Assert.assertEquals("0:0", timer.toString());
    }
}
