package practice.stream.practice_1;

//

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

    /**
     * Finds the top 3 highest unique prices from the input list,
     * sorted from highest to lowest.
     *
     * @param prices a list of integers containing stock prices (may include duplicates)
     * @return a sorted list of up to 3 highest unique integers
     */
    public List<Integer> getTopThreePrices(List<Integer> prices) {
        return prices.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        // Test Case 1: Normal Mixed List with Duplicates
        List<Integer> case1 = List.of(10, 50, 50, 40, 100, 90, 100);
        System.out.println("Case 1 (Expected [100, 90, 50]): " + practice.getTopThreePrices(case1));

        // Test Case 2: Fewer than 3 Elements
        List<Integer> case2 = List.of(20, 10);
        System.out.println("Case 2 (Expected [20, 10]): " + practice.getTopThreePrices(case2));

        // Test Case 3: Empty List
        List<Integer> case3 = List.of();
        System.out.println("Case 3 (Expected []): " + practice.getTopThreePrices(case3));

        // Test Case 4: All Same Numbers
        List<Integer> case4 = List.of(5, 5, 5, 5);
        System.out.println("Case 4 (Expected [5]): " + practice.getTopThreePrices(case4));
    }
}
