import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {
    @Test
    public void testConstructor() {
        Money money = new Money(10, 5);

        Assert.assertEquals("10.05e", money.toString());
    }

    @Test
    public void testAddition() {
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);

        Money c = a.plus(b);
    
        Assert.assertEquals(15, c.euros());
        Assert.assertEquals(0, c.cents());
        
        a = new Money(10, 50);
        b = new Money(0, 50);
        c = new Money(2, 60);
        
        Money d = a.plus(b);
        
        Assert.assertEquals(11, d.euros());
        Assert.assertEquals(0, d.cents());

        Money e = a.plus(c);
        Assert.assertEquals(13, e.euros());
        Assert.assertEquals(10, e.cents());
    }

    @Test
    public void testComparison() {
        Money money = new Money(10, 20);
        Money otherMoney = new Money(11, 50);
        
        Assert.assertTrue(money.lessThan(otherMoney));
        Assert.assertFalse(otherMoney.lessThan(money));
        
        Money thirdMoney = new Money(6, 50);
        
        Assert.assertTrue(thirdMoney.lessThan(money));
    }
    
    @Test
    public void testMinus() {
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);
        
        Assert.assertEquals(6, c.euros());
        Assert.assertEquals(50, c.cents());
        
        c = c.minus(a);

        Assert.assertEquals(0, c.euros());
        Assert.assertEquals(0, c.cents());
    }
}
