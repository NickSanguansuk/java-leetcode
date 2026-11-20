package easy.solution_169;

// 169. Majority Element

import java.util.*;
import java.util.stream.Stream;

public class Solution_169 {

    //public int majorityElement(int[] nums) {
    //
    //    int ans = nums[0];
    //    Map<Integer, Integer> map = new HashMap<>();
    //
    //    for (int i = 0; i < nums.length; i++) {
    //        if (map.containsKey(nums[i])) {
    //            map.put(nums[i], map.get(nums[i]) + 1);
    //        } else {
    //            map.put(nums[i], 1);
    //        }
    //
    //        if (map.get(ans) < map.get(nums[i])) {
    //            ans = nums[i];
    //        }
    //    }
    //
    //    return ans;
    //}

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        assert maxEntry != null;
        return maxEntry.getKey();
    }

    //public int majorityElement(int[] nums) {
    //
    //    Map<Integer, Integer> map = new HashMap<>();
    //
    //    for (int i = 0; i < nums.length; i++) {
    //        if (map.containsKey(nums[i])) {
    //            map.put(nums[i], map.get(nums[i]) + 1);
    //        } else {
    //            map.put(nums[i], 1);
    //        }
    //    }
    //
    //    //Set<Map.Entry<Integer, Integer>> set = map.entrySet();
    //    //Stream<Map.Entry<Integer, Integer>> stream =  map.entrySet().stream();
    //    //Optional<Map.Entry<Integer, Integer>> stream2 =  map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1);
    //    //Map.Entry<Integer, Integer> entry = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get();
    //    //Integer key = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
    //
    //    //return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    //    //return Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
    //    //return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    //    return map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
    //}

    //// Very fast and good
    //public int majorityElement(int[] nums) {
    //
    //    int ans = nums[0];
    //    int count = 1;
    //
    //    for (int i = 1; i < nums.length; i++) {
    //        if (nums[i] == ans)
    //            count++;
    //        else
    //            count--;
    //
    //        if (count < 0) {
    //            ans = nums[i];
    //            count = 1;
    //        }
    //    }
    //
    //    return ans;
    //}

    public static void main(String[] args) {
        Solution_169 solution = new Solution_169();

        // 3
        int[] nums1 = {3, 2, 3};
        System.out.println(solution.majorityElement(nums1));

        // 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums2));

        // 5
        int[] nums3 = {3, 5, 4, 5, 2, 3, 5, 5, 5};
        System.out.println(solution.majorityElement(nums3));

    }
}
