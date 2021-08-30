import org.junit.Assert;
import org.junit.Test;

public class SmallestTest {
    @Test
    public void testDifferentValues() {
        Assert.assertEquals(2, Smallest.smallest(2, 7));

        Assert.assertEquals(118, Smallest.smallest(118, 220));

        Assert.assertEquals(-2, Smallest.smallest(-2, 4));

        Assert.assertEquals(7, Smallest.smallest(7, 7));
    }
}
