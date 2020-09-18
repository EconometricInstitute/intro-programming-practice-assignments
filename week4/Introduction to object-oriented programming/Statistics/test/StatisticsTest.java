import org.junit.Assert;
import org.junit.Test;

public class StatisticsTest {

    @Test
    public void testCount() {
        Statistics statistics = new Statistics();

        Assert.assertEquals(0, statistics.getCount());

        statistics.addNumber(1);

        Assert.assertEquals(1, statistics.getCount());

        statistics.addNumber(8);
        statistics.addNumber(10);

        Assert.assertEquals(3, statistics.getCount());

        statistics.addNumber(15);
        statistics.addNumber(151);
        statistics.addNumber(1);

        Assert.assertEquals(6, statistics.getCount());
    }

    @Test
    public void testSum() {
        Statistics statistics = new Statistics();
        Assert.assertEquals(0, statistics.sum());

        statistics.addNumber(10);
        Assert.assertEquals(10, statistics.sum());

        statistics.addNumber(5);
        statistics.addNumber(12);
        statistics.addNumber(2);
        Assert.assertEquals(29, statistics.sum());
    }

    @Test
    public void testAverage() {
        Statistics statistics = new Statistics();
        Assert.assertEquals("Problem with computing average for empty object", 0, statistics.average(), 0.01);

        statistics.addNumber(10);
        Assert.assertEquals(10, statistics.average(), 0.01);

        statistics.addNumber(5);
        statistics.addNumber(12);
        statistics.addNumber(2);
        Assert.assertEquals(29.0 / 4, statistics.average(), 0.01);
    }
}
