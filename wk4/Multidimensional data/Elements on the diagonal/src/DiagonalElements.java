import java.util.ArrayList;
import java.util.List;

public class DiagonalElements {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 2, 7, 6},
                {2, 4, 1, 0},
                {3, 2, 1, 0},
                {2, 3, 4, 2}
        };

        System.out.println(getElementsOnDiagonal(matrix));
    }

    public static List<Integer> getElementsOnDiagonal(int[][] matrix) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            integers.add(matrix[i][i]);
        }
        return integers;
    }
}
