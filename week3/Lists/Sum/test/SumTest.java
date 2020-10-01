import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SumTest {

    @Test
    public void testMultipleInputs() {
        List<Integer> numbers = List.of(3, 2, 6, -1);
        Assert.assertEquals(10, Sum.sum(numbers));

        numbers = List.of(3, 2, 6, -1, 5, 1);
        Assert.assertEquals(16, Sum.sum(numbers));

        numbers = List.of(-3, 3, -2, 2);
        Assert.assertEquals(0, Sum.sum(numbers));
    }
}
