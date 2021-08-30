import org.junit.Assert;
import org.junit.Test;

public class ItemTest {
    @Test
    public void testConstructor() {
        Item item = new Item("Shirt", 4);
        Assert.assertEquals("Shirt", item.getName());
        Assert.assertEquals(4, item.getWeight());
        Assert.assertEquals("Shirt (4 kg)", item.toString());
    }
}
