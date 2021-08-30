import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ProductTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCase1() {
        Product product = new Product("Banana", 1.1, 13);
        product.printProduct();

        Assert.assertEquals("Banana, price 1.1, 13 pcs", outContent.toString().trim());
    }

    @Test
    public void testCase2() {
        Product product = new Product("Apple", 0.18, 165);
        product.printProduct();

        Assert.assertEquals("Apple, price 0.18, 165 pcs", outContent.toString().trim());
    }
}
