import org.junit.Assert;
import org.junit.Test;

public class AveragingTest {


    @Test
    public void testSumStillWorks() {
        Assert.assertEquals(14, Averaging.sum(4, 3, 6, 1));

        Assert.assertEquals(14, Averaging.sum(12, 3, -2, 1));
    }

    @Test
    public void testDifferentValues() {
        Assert.assertEquals(3.5, Averaging.average(4, 3, 6, 1), 0.01);

        Assert.assertEquals(19.0 / 4, Averaging.average(12, 5, -1, 3), 0.01);

        Assert.assertEquals(0.0, Averaging.average(0, 0, 0, 0), 0.01);
    }
}
