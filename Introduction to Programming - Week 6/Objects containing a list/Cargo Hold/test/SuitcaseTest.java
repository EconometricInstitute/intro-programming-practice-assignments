import org.junit.Assert;
import org.junit.Test;

public class SuitcaseTest {
    
    @Test
    public void testConstructor() {
        Suitcase suitcase = new Suitcase(12);

        Assert.assertEquals(0, suitcase.totalWeight());
    }
    
    @Test
    public void testNullHeaviestItem() {
        Suitcase suitcase = new Suitcase(13);
        
        Assert.assertNull(suitcase.heaviestItem());
        Assert.assertEquals("no items (0 kg)", suitcase.toString());
    }
    
    @Test
    public void testAddition() {
        Suitcase suitcase = new Suitcase(12);
        
        suitcase.addItem(new Item("Shirt", 1));
        Assert.assertEquals(1, suitcase.totalWeight());
        
        suitcase.addItem(new Item("Shoes", 5));
        Assert.assertEquals(6, suitcase.totalWeight());
        
        suitcase.addItem(new Item("Wallet", 1));
        Assert.assertEquals(7, suitcase.totalWeight());
        
        Assert.assertEquals("3 items (7 kg)", suitcase.toString());
    }
    
    @Test
    public void testWeightRestriction() {
        Suitcase suitcase = new Suitcase(5);

        suitcase.addItem(new Item("Shirt", 1));
        Assert.assertEquals(1, suitcase.totalWeight());
        
        suitcase.addItem(new Item("Shoes", 5));
        Assert.assertEquals(1, suitcase.totalWeight());
        
        Assert.assertEquals("1 item (1 kg)", suitcase.toString());
    }

    @Test
    public void testHeaviest() {
        Suitcase suitcase = new Suitcase(12);

        Item shoes = new Item("Shoes", 5);
        
        suitcase.addItem(new Item("Shirt", 1));
        suitcase.addItem(shoes);
        suitcase.addItem(new Item("Wallet", 1));
        suitcase.addItem(new Item("Camera", 4));

        Assert.assertEquals(shoes, suitcase.heaviestItem());
    }
}
