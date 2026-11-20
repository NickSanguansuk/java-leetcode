package practice.stream.practice_9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {

    /**
     * Finds the first non-duplicate (unique) character in a string.
     *
     * @param input the string to evaluate
     * @return an Optional containing the first unique character, or Optional.empty() if none exists
     */
    public Optional<Character> findFirstUniqueChar(String input) {
        if (input == null || input.isEmpty()) {
            return Optional.empty();
        }

        // Your code here
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        // Test Case 1: Standard word ("swiss" -> 'w' is the first unique letter)
        String case1 = "swiss";
        System.out.println("Case 1 (Expected Optional[w]): " + practice.findFirstUniqueChar(case1));

        // Test Case 2: Multiple unique characters ("jpmorgan" -> 'j' is first)
        String case2 = "jpmorgan";
        System.out.println("Case 2 (Expected Optional[j]): " + practice.findFirstUniqueChar(case2));

        // Test Case 3: No unique characters ("aabbcc")
        String case3 = "aabbcc";
        System.out.println("Case 3 (Expected Optional.empty): " + practice.findFirstUniqueChar(case3));
    }
}
