import org.junit.Assert;
import org.junit.Test;

public class TestPaymentCard {
    @Test
    public void testConstructor() {
        PaymentCard card = new PaymentCard(15.0);
        
        Assert.assertEquals(15.0, card.balance(), 0.01);
    }
    
    @Test
    public void testWithdraw() {
        PaymentCard card = new PaymentCard(15.0);
            
        Assert.assertTrue(card.takeMoney(5.0));
        Assert.assertEquals(10.0, card.balance(), 0.01);
        
        Assert.assertFalse(card.takeMoney(11.0));
        Assert.assertEquals(10.0, card.balance(), 0.01);
    }
    
}
