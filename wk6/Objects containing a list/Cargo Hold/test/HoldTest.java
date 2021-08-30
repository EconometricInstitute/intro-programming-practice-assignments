import org.junit.Assert;
import org.junit.Test;

public class HoldTest {
    public void testConstructor() {
        Hold hold = new Hold(10);

        Assert.assertEquals("0 suitcases (0 kg)", hold.toString());
    }

    @Test
    public void testAdd() {
        Hold hold = new Hold(10);

        Suitcase firstCase = new Suitcase(5);
        firstCase.addItem(new Item("Shoes", 2));
        firstCase.addItem(new Item("Shirt", 1));

        Suitcase secondCase = new Suitcase(7);
        secondCase.addItem(new Item("Shoes", 2));
        secondCase.addItem(new Item("Shirt", 1));
        secondCase.addItem(new Item("Camera", 4));

        hold.addSuitcase(firstCase);
        hold.addSuitcase(secondCase);

        Assert.assertEquals("2 suitcases (10 kg)", hold.toString());
    }

    @Test
    public void testWeightRestriction() {
        Hold hold = new Hold(10);

        Suitcase firstCase = new Suitcase(5);
        firstCase.addItem(new Item("Shoes", 2));
        firstCase.addItem(new Item("Shirt", 2));

        Suitcase secondCase = new Suitcase(7);
        secondCase.addItem(new Item("Shoes", 2));
        secondCase.addItem(new Item("Shirt", 1));
        secondCase.addItem(new Item("Camera", 4));

        hold.addSuitcase(firstCase);
        hold.addSuitcase(secondCase);

        Assert.assertEquals("1 suitcases (4 kg)", hold.toString());
    }
}
