package easy.solution_26;

// 26. Remove Duplicates from Sorted Array

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Solution_26 {

    public int removeDuplicates(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != (nums.length - 1)) {
                if (nums[i] != nums[i + 1]) {
                    nums[ans] = nums[i];
                    ans++;
                }
            } else {
                nums[ans] = nums[i];
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution_26 solution = new Solution_26();

        int[] nums1 = {1, 1, 2};
        System.out.println(solution.removeDuplicates(nums1));   // 2
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(solution.removeDuplicates(nums2));   // 5
        System.out.println(Arrays.toString(nums2));
    }
}
