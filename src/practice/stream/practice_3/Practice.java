package practice.stream.practice_3;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {

    /**
     * Counts the frequencies of non-space characters in a string.
     *
     * @param text the input string to process
     * @return a map with characters as keys and their absolute counts as values
     */
    public Map<Character, Long> countCharFrequency(String text) {
        // Your code here
        if (text == null || text.isEmpty()) {
            return Collections.emptyMap(); // Guard clause
        }

        return text.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                //.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        // Test Case 1: Standard phrase with spaces
        String case1 = "hello world";
        System.out.println("Case 1: " + practice.countCharFrequency(case1));
        // Expected Output: {d=1, e=1, h=1, l=3, o=2, r=1, w=1}

        // Test Case 2: Empty String
        String case2 = "";
        System.out.println("Case 2: " + practice.countCharFrequency(case2));
        // Expected Output: {}
    }
}
