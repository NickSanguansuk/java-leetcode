package interview.upgrad.interview_2023_11_22;

// Get smallest element from a 2D matrix

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Interview {

    public int getSmallestFrom2DMatrix(int[][] matrix) {
        //Stream<int[]> stream1 = Stream.of(matrix);
        //IntStream stream2 = stream1.flatMapToInt(e -> IntStream.of(e));
        //OptionalInt min = stream2.min();
        //int ans = min.getAsInt();
        //return ans;

        return Stream.of(matrix).flatMapToInt(IntStream::of).min().getAsInt();
    }

    public static void main(String[] args) {
        Interview solution = new Interview();

        // 2
        int[][] matrix1 = {{5, 3, 8}, {7, 9, 2}, {4, 8, 5}};
        System.out.println(solution.getSmallestFrom2DMatrix(matrix1));
    }
}
