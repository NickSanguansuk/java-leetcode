package easy.solution_349;

// 349. Intersection of Two Arrays

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution_349 {

    // Time = O(n)
    // Space = O(n)
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }

        int[] ans = new int[set2.size()];
        int n = 0;
        for (int i : set2) {
            ans[n++] = i;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution_349 solution = new Solution_349();

        int[] nums1_1 = {1, 2, 2, 1};
        int[] nums2_1 = {2, 2};
        System.out.println(Arrays.toString(solution.intersection(nums1_1, nums2_1)));   // [2]

        int[] nums1_2 = {4, 9, 5};
        int[] nums2_2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(solution.intersection(nums1_2, nums2_2)));   // [4, 9]

        int[] nums1_3 = {1, 2};
        int[] nums2_3 = {1, 1};
        System.out.println(Arrays.toString(solution.intersection(nums1_3, nums2_3)));   // [1]
    }
}
