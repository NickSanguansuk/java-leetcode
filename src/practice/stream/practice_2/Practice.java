package practice.stream.practice_2;

import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.stream.Collectors;

public class Practice {

    /**
     * Groups a list of names by their character length.
     *
     * @param names a list of strings containing names
     * @return a map where keys are lengths and values are lists of names of that length
     */
    public Map<Integer, List<String>> groupNamesByLength(List<String> names) {
        // Your code here
        // Guard clause for null or empty input
        if (names == null || names.isEmpty()) {
            return Collections.emptyMap();
        }

        //Map<Integer, List<String>> result = names.stream()
        //        .collect(Collectors.groupingBy(n -> n.length()));
        return names.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        // Test Case 1: Mixed lengths
        List<String> case1 = List.of("Leo", "Anna", "Alex", "David", "Sam");
        System.out.println("Case 1: " + practice.groupNamesByLength(case1));
        // Expected Output: {3=[Leo, Sam], 4=[Anna, Alex], 5=[David]}

        // Test Case 2: Empty List
        List<String> case2 = List.of();
        System.out.println("Case 2: " + practice.groupNamesByLength(case2));
        // Expected Output: {}
    }
}
