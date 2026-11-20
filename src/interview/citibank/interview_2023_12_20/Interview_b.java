package interview.citibank.interview_2023_12_20;

// From List of Integer, group the data by "Odd" and "Even" and put them in a map ---> Map<String, List<Integer>>

import java.util.*;
import java.util.stream.Collectors;

public class Interview_b {

    public Map<String, List<Integer>> groupOddAndEvenInteger(List<Integer> list) {

        //Map<Boolean, List<Integer>> map = list.stream()
        //        .map(n -> new AbstractMap.SimpleEntry<>(n % 2 == 0, n))
        //        .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())));

        //Map<Boolean, List<Integer>> map = list.stream()
        //        .collect(Collectors.partitioningBy(n -> (n % 2) == 0));

        Map<Boolean, List<Integer>> map = list.stream()
                .collect(Collectors.groupingBy(n -> (n % 2) == 0));

        Map<String, List<Integer>> ans = new HashMap<>();
        ans.put("Even", map.get(true));
        ans.put("Odd", map.get(false));

        return ans;
    }

    public static void main(String[] args) {
        Interview_b solution = new Interview_b();

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(solution.groupOddAndEvenInteger(list1));
    }
}
