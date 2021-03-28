import org.junit.Assert;
import org.junit.Test;

public class SubstringTest {
    @Test
    public void testDifferentInputs() {
        Assert.assertEquals("lon", Substring.firstPartOfString("long string"));
        Assert.assertEquals("pri", Substring.firstPartOfString("priceless"));
        Assert.assertEquals("ha", Substring.firstPartOfString("ha"));
    }
}
