import org.junit.Assert;
import org.junit.Test;

public class FitbyteTest {
    @Test
    public void testConstructor() {
        new Fitbyte(30, 60);
    }

    @Test
    public void testCalculation() {
        Fitbyte fitbyte = new Fitbyte(30, 60);

        Assert.assertEquals(122.48500000000001, fitbyte.targetHeartRate(0.5), 0.01);
        Assert.assertEquals(159.976, fitbyte.targetHeartRate(0.8), 0.01);
        
        fitbyte = new Fitbyte(20, 75);
        Assert.assertEquals(156.956, fitbyte.targetHeartRate(0.7), 0.01);
    }
}
