import org.junit.Assert;
import org.junit.Test;

public class GiftTest {
    @Test
    public void testConstructor() {
        Gift gift = new Gift("Toy", 3);
        
        Assert.assertEquals("Toy", gift.getName());
        Assert.assertEquals(3, gift.getWeight());
    }
}
