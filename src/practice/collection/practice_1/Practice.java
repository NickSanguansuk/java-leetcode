package practice.collection.practice_1;

// Write Java code to return all numbers that appear more than once. Each duplicate should appear only once, and keep the order in which the number first became a duplicate.

import java.util.*;

public class Practice {

    //public List<Integer> findDuplicate(int[] nums) {
    //    List<Integer> result = new ArrayList<>();
    //    Map<Integer, Integer> map = new HashMap<>();
    //    for (int i : nums) {
    //        if (map.containsKey(i)) {
    //            int count = map.get(i);
    //            count++;
    //            map.put(i, count);
    //        } else {
    //            map.put(i, 1);
    //        }
    //    }
    //    for (Map.Entry<Integer, Integer> e : map.entrySet()) {
    //        if (e.getValue() > 1) {
    //            result.add(e.getKey());
    //        }
    //    }
    //    return result;
    //}

    public Set<Integer> findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i : nums) {
            if (seen.contains(i)) {
                result.add(i);
            } else {
                seen.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        // [2, 4, 7]
        int[] nums = {4, 2, 7, 4, 8, 2, 4, 9, 7, 7};
        System.out.println(practice.findDuplicate(nums));

    }
}
