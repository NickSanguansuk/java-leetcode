package easy.solution_217;

// 217. Contains Duplicate

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution_217 {

    //public boolean containsDuplicate(int[] nums) {
    //    Set<Integer> set = new HashSet<>();
    //
    //    for (int i = 0; i < nums.length; i++) {
    //        if (set.contains(nums[i])) {
    //            return true;
    //        }
    //
    //        set.add(nums[i]);
    //    }
    //
    //    return false;
    //}

    //public boolean containsDuplicate(int[] nums) {
    //    Set<Integer> set = new HashSet<>();
    //
    //    for (int i = 0; i < nums.length; i++) {
    //        if (!set.add(nums[i])) {
    //            return true;
    //        }
    //    }
    //
    //    return false;
    //}

    // Fast (Using sorting)
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int j = i - 1;
            while (j >= 0 && current < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }

            if (j >= 0 && nums[j] == current) {
                return true;
            }

            nums[j + 1] = current;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution_217 solution = new Solution_217();

        // true
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums1));

        // false
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums2));

        // true
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(solution.containsDuplicate(nums3));

    }
}
