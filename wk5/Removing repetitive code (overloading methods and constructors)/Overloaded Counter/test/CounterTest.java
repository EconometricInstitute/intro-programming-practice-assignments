import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void testConstructor() {
        Counter counter = new Counter();
        Assert.assertEquals(0, counter.value());
        
        counter = new Counter(10);
        Assert.assertEquals(10, counter.value());
    }
    
    @Test
    public void testIncrease() {
        Counter counter = new Counter();
        counter.increase();
        
        Assert.assertEquals(1, counter.value());
        
        counter.increase(12);
        Assert.assertEquals(13, counter.value());
    
        counter.increase(-3);
        Assert.assertEquals(13, counter.value());
    }
    
    @Test
    public void testDecrease() {
        Counter counter = new Counter(10);
        counter.decrease();
        
        Assert.assertEquals(9, counter.value());
        
        counter.decrease(7);
        Assert.assertEquals(2, counter.value());
        
        counter.decrease(-10);
        Assert.assertEquals(2, counter.value());
    }
}
