package practice.stream.practice_4;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

    /**
     * Flattens a nested list of transaction categories into a single list of unique sorted categories.
     *
     * @param userTransactions a nested list containing lists of string categories per user
     * @return a single list of unique categories sorted alphabetically
     */
    public List<String> getAllUniqueCategories(List<List<String>> userTransactions) {
        // Your code here
        // Defensive null check
        if (userTransactions == null || userTransactions.isEmpty()) {
            return Collections.emptyList();
        }

        return userTransactions.stream()
                //.flatMap(list -> list.stream())
                //.flatMap(Collection::stream)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        // Test Case 1: Overlapping lists
        List<List<String>> case1 = List.of(
                List.of("Food", "Gas", "Clothing"),
                List.of("Gas", "Movies"),
                List.of("Food", "Electronics")
        );
        System.out.println("Case 1: " + practice.getAllUniqueCategories(case1));
        // Expected Output: [Clothing, Electronics, Food, Gas, Movies]
    }
}
