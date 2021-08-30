import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayAverageTest {

    @Test
    public void testDifferentInputs() {
        int[] numbers = {5, 1, 3, 4, 2};
        assertEquals(3.0, ArrayAverage.computeAverageOfArray(numbers), 0.01);

        int[] numbers2 = {12, -1, 3, 4, 2, 6};
        assertEquals(26.0 / 6, ArrayAverage.computeAverageOfArray(numbers2), 0.01);

        int[] numbers3 = {18, 1, 2, 3, 4, 5, 6, 7};
        assertEquals(46.0 / 8, ArrayAverage.computeAverageOfArray(numbers3), 0.01);

        int[] numbers4 = {0, 0, 0, 0};
        assertEquals(0, ArrayAverage.computeAverageOfArray(numbers4), 0.01);
    }
}
