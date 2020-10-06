import org.junit.Assert;
import org.junit.Test;

public class PackageTest {
    
    @Test
    public void testConstructor() {
        Package santaPackage = new Package();

        Assert.assertEquals(0, santaPackage.totalWeight());
    }
    
    @Test
    public void testWeight() {
        Package santaPackage = new Package();
        
        santaPackage.addGift(new Gift("Toy1", 1));
        Assert.assertEquals(1, santaPackage.totalWeight());
        
        santaPackage.addGift(new Gift("Toy2", 15));
        Assert.assertEquals(16, santaPackage.totalWeight());
        
        santaPackage.addGift(new Gift("Toy3", 2));
        Assert.assertEquals(18, santaPackage.totalWeight());
    }
}
