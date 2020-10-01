import org.junit.Assert;
import org.junit.Test;

public class TestPaymentTerminal {

    @Test
    public void testConstructor() {
        PaymentTerminal terminal = new PaymentTerminal();

        Assert.assertEquals("money: 1000.0, number of sold affordable meals: 0, number of sold hearty meals: 0",
                terminal.toString());
    }

    @Test
    public void testAffordable() {
        PaymentTerminal paymentTerminal = new PaymentTerminal();

        Assert.assertEquals(0, paymentTerminal.eatAffordably(2.50), 0.01);
        Assert.assertEquals("money: 1002.5, number of sold affordable meals: 1, number of sold hearty meals: 0",
                paymentTerminal.toString());
        
        Assert.assertEquals(2.20, paymentTerminal.eatAffordably(2.20), 0.01);
        Assert.assertEquals("money: 1002.5, number of sold affordable meals: 1, number of sold hearty meals: 0",
                paymentTerminal.toString());

        Assert.assertEquals(0.20, paymentTerminal.eatAffordably(2.70), 0.01);
        Assert.assertEquals("money: 1005.0, number of sold affordable meals: 2, number of sold hearty meals: 0",
                paymentTerminal.toString());
    }
    
    @Test
    public void testHeartily() {
        PaymentTerminal paymentTerminal = new PaymentTerminal();

        Assert.assertEquals(0, paymentTerminal.eatHeartily(4.30), 0.01);
        Assert.assertEquals("money: 1004.3, number of sold affordable meals: 0, number of sold hearty meals: 1",
                paymentTerminal.toString());

        Assert.assertEquals(2.20, paymentTerminal.eatHeartily(2.20), 0.01);
        Assert.assertEquals("money: 1004.3, number of sold affordable meals: 0, number of sold hearty meals: 1",
                paymentTerminal.toString());

        Assert.assertEquals(0.20, paymentTerminal.eatHeartily(4.50), 0.01);
    }
    
    @Test
    public void testCardPayments() {
        PaymentTerminal paymentTerminal = new PaymentTerminal();
        PaymentCard card = new PaymentCard(15.0);
        
        Assert.assertTrue(paymentTerminal.eatAffordably(card));
        Assert.assertEquals(12.50,card.balance(),0.01);
        Assert.assertEquals("money: 1000.0, number of sold affordable meals: 1, number of sold hearty meals: 0",
                paymentTerminal.toString());
        
        card = new PaymentCard(4);
        Assert.assertFalse(paymentTerminal.eatHeartily(card));
        Assert.assertEquals(4, card.balance(), 0.01);
        Assert.assertEquals("money: 1000.0, number of sold affordable meals: 1, number of sold hearty meals: 0",
                paymentTerminal.toString());
        
        card = new PaymentCard(12);
        Assert.assertTrue(paymentTerminal.eatHeartily(card));
        Assert.assertEquals(7.70, card.balance(), 0.01);
        Assert.assertEquals("money: 1000.0, number of sold affordable meals: 1, number of sold hearty meals: 1",
                paymentTerminal.toString());

    }
}
