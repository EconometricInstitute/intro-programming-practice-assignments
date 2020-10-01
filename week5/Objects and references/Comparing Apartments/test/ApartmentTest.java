import org.junit.Assert;
import org.junit.Test;

public class ApartmentTest {
    @Test
    public void testConstructor() {
        Apartment apartment = new Apartment(1, 10, 5500);
    }
    
    @Test
    public void testComparison() {
        Apartment apartment = new Apartment(1, 10, 5500);
        Apartment otherApartment = new Apartment(1, 25, 6000);
        
        Assert.assertTrue(otherApartment.largerThan(apartment));
        Assert.assertFalse(apartment.largerThan(otherApartment));

        Apartment thirdApartment = new Apartment(1, 35, 6000);
        Assert.assertTrue(thirdApartment.largerThan(apartment));
        Assert.assertTrue(thirdApartment.largerThan(otherApartment));
    }
    
    @Test
    public void testPriceDifference() {
        Apartment apartment = new Apartment(1, 10, 5500);
        Apartment otherApartment = new Apartment(1, 25, 6000);
        
        Assert.assertEquals(95000, otherApartment.priceDifference(apartment));
        Assert.assertEquals(95000, apartment.priceDifference(otherApartment));

        Apartment thirdApartment = new Apartment(1, 35, 6000);
        Assert.assertEquals(60000, thirdApartment.priceDifference(otherApartment));
    }
}
