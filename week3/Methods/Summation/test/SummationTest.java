import org.junit.Assert;
import org.junit.Test;

public class SummationTest {
    @Test
    public void testDifferentValues() {
        Assert.assertEquals(14, Summation.sum(4, 3, 6, 1));

        Assert.assertEquals(14, Summation.sum(12, 3, -2, 1));

        Assert.assertEquals(112, Summation.sum(25, 25, 28, 34));
    }
}
