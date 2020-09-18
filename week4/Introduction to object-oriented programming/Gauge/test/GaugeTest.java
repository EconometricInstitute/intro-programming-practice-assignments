import org.junit.Assert;
import org.junit.Test;

public class GaugeTest {

    @Test
    public void testValue() {
        Gauge gauge = new Gauge();
        Assert.assertEquals(0, gauge.value());

        gauge.increase();
        Assert.assertEquals(1, gauge.value());

        gauge.increase();
        Assert.assertEquals(2, gauge.value());

        gauge.decrease();
        Assert.assertEquals(1, gauge.value());

        gauge.increase();
        Assert.assertEquals(2, gauge.value());
    }

    @Test
    public void testFull() {
        Gauge gauge = new Gauge();
        Assert.assertFalse(gauge.full());

        gauge.increase();
        gauge.increase();
        gauge.increase();
        gauge.increase();
        Assert.assertFalse(gauge.full());

        gauge.increase();
        Assert.assertTrue(gauge.full());
    }

    @Test
    public void testNegative() {
        Gauge gauge = new Gauge();

        gauge.decrease();
        Assert.assertEquals("Negative value obtained", 0, gauge.value());
    }

    @Test
    public void testLargerThanFive() {
        Gauge gauge = new Gauge();

        gauge.increase();
        gauge.increase();
        gauge.increase();
        gauge.increase();
        gauge.increase();
        gauge.increase();

        Assert.assertEquals("Value became larger than 5", 5, gauge.value());
    }
}
