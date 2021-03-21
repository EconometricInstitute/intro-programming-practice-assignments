import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testToString() {
        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy);
        Assert.assertEquals("Leo, has a friend called Lucy (golden retriever)", leo.toString());

        Pet dominic = new Pet("Dominic", "Siberian cat");
        Person ian = new Person("Ian", dominic);
        Assert.assertEquals("Ian, has a friend called Dominic (Siberian cat)", ian.toString());
    }
}
