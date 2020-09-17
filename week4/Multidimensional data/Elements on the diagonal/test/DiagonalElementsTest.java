import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DiagonalElementsTest {
    @Test
    public void testDifferentInputs() {
        int[][] matrix = {{5, 0, 0}, {0, 8, 0}, {0, 0, 10}};
        assertEquals(List.of(5, 8, 10), DiagonalElements.getElementsOnDiagonal(matrix));

        int[][] matrix2 = {{3, 2, 7, 6}, {2, 4, 1, 0}, {3, 2, 1, 0}, {2, 3, 4, 2}};
        assertEquals(List.of(3, 4, 1, 2), DiagonalElements.getElementsOnDiagonal(matrix2));

        int[][] matrix3 = {{1}};
        assertEquals(List.of(1), DiagonalElements.getElementsOnDiagonal(matrix3));
    }
}
