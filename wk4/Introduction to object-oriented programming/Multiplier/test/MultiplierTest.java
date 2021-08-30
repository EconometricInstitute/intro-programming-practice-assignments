import org.junit.Assert;
import org.junit.Test;

public class MultiplierTest {
    @Test
    public void testDifferentInputs() {
        Multiplier multiplier = new Multiplier(3);
     
        Assert.assertEquals(6, multiplier.multiply(2));
        Assert.assertEquals(6, multiplier.multiply(2));
        
        multiplier = new Multiplier(4);
        Assert.assertEquals(8, multiplier.multiply(2));
        Assert.assertEquals(4, multiplier.multiply(1));

        multiplier = new Multiplier(1000);
        Assert.assertEquals(12000, multiplier.multiply(12));
        Assert.assertEquals(5000, multiplier.multiply(5));
        Assert.assertEquals(0, multiplier.multiply(0));
    }
}
