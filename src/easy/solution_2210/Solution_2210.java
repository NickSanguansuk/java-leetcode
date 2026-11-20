package easy.solution_2210;

// 2210. Count Hills and Valleys in an Array

public class Solution_2210 {

    public int countHillValley(int[] nums) {
        int count = 0;
        int left = nums[0];

        for (int i = 1; i < nums.length - 1; i++) {
            int current = nums[i];
            int right = nums[i + 1];

            if ((current > left && current > right) || (current < left && current < right)) {
                count++;
                left = current;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution_2210 solution = new Solution_2210();

        // 3
        int[] nums1 = {2, 4, 1, 1, 6, 5};
        System.out.println(solution.countHillValley(nums1));

        // 0
        int[] nums2 = {6, 6, 5, 5, 4, 1};
        System.out.println(solution.countHillValley(nums2));
    }
}
