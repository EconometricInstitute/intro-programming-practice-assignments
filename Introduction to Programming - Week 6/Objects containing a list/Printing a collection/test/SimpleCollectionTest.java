import org.junit.Assert;
import org.junit.Test;

public class SimpleCollectionTest {
    @Test
    public void testConstruction() {
        SimpleCollection simpleCollection = new SimpleCollection("my collection");
        Assert.assertEquals("The collection my collection is empty.", simpleCollection.toString());
    }

    @Test
    public void testAddition() {
        SimpleCollection simpleCollection = new SimpleCollection("numbers");
        simpleCollection.add("one");

        String[] lines = simpleCollection.toString().split(System.lineSeparator());
        Assert.assertEquals("The collection numbers has 1 element:", lines[0].trim());
        Assert.assertEquals("one", lines[1].trim());

        simpleCollection.add("two");
        simpleCollection.add("three");
        simpleCollection.add("four");

        lines = simpleCollection.toString().split(System.lineSeparator());
        Assert.assertEquals("The collection numbers has 4 elements:", lines[0].trim());
        Assert.assertEquals("one", lines[1].trim());
        Assert.assertEquals("two", lines[2].trim());
        Assert.assertEquals("three", lines[3].trim());
        Assert.assertEquals("four", lines[4].trim());
    }
}
