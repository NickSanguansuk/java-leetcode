package practice.stream.practice_8;

import java.util.List;

public class Practice {

    /**
     * Filters out non-positive execution times and calculates the total product of the rest.
     *
     * @param processingTimes a list of execution times in milliseconds
     * @return the combined product of all numbers > 0, fallback to 1 if none found
     */
    public int calculateProcessingProduct(List<Integer> processingTimes) {
        // Your code here
        if (processingTimes == null || processingTimes.isEmpty()) {
            return 1;
        }

        return processingTimes.stream()
                .filter(t -> t > 0)
                .reduce(1, (accumulator, item) -> accumulator * item);
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        // Test Case 1: Standard positive and negative numbers
        List<Integer> case1 = List.of(2, -5, 3, 0, 4);
        System.out.println("Case 1: " + practice.calculateProcessingProduct(case1));
        // Expected Output: 24 (Because 2 * 3 * 4 = 24. -5 and 0 are ignored)

        // Test Case 2: No positive numbers
        List<Integer> case2 = List.of(-1, -10, 0);
        System.out.println("Case 2: " + practice.calculateProcessingProduct(case2));
        // Expected Output: 1 (Fallback value)
    }
}
