import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StoringRecordsTest {
    @Test
    public void testCase1() {
        List<Person> personList = StoringRecords.readRecordsFromFile("recordsData.txt");
        
        Assert.assertEquals(4, personList.size());
        Assert.assertEquals("lily", personList.get(0).getName());
        Assert.assertEquals(3, personList.get(0).getAge());
        Assert.assertEquals("amy", personList.get(3).getName());
        Assert.assertEquals(1, personList.get(3).getAge());
    }

    @Test
    public void testCase2() {
        List<Person> personList = StoringRecords.readRecordsFromFile("data2.txt");

        Assert.assertEquals(6, personList.size());
        Assert.assertEquals("john", personList.get(0).getName());
        Assert.assertEquals(15, personList.get(0).getAge());
        Assert.assertEquals("melissa", personList.get(5).getName());
        Assert.assertEquals(4, personList.get(5).getAge());
    }
}
