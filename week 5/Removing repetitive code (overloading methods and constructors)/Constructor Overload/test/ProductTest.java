import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
    @Test
    public void testFirstConstructor() {
        Product product = new Product("Tape measure");
        Assert.assertEquals("Tape measure (1 kg) can be found from the shelf", product.toString());
        
        product = new Product("Banana");
        Assert.assertEquals("Banana (1 kg) can be found from the shelf", product.toString());
    }
    
    @Test
    public void testSecondConstructor() {
        Product product =  new Product("Plaster", "home improvement section");
        Assert.assertEquals("Plaster (1 kg) can be found from the home improvement section", product.toString());
        
        product = new Product("Blue paint", "Paint section");
        Assert.assertEquals("Blue paint (1 kg) can be found from the Paint section", product.toString());
    }
    
    @Test
    public void testThirdConstructor() {
        Product product = new Product("Tyre", 5);
        Assert.assertEquals("Tyre (5 kg) can be found from the shelf", product.toString());
        
        product = new Product("Lamp", 3);
        Assert.assertEquals("Lamp (3 kg) can be found from the shelf", product.toString());
    }
    
    
}
