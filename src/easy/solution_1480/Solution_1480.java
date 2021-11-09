package easy.solution_1480;

// 1480. Running Sum of 1d Array

public class Solution_1480 {

    public int[] runningSum(int[] nums) {

        //// check if length of nums == 1, return nums
        //if (nums.length == 1) {
        //    return nums;
        //}

        // for loop start from 1 to nums.length - 1
        for (int i = 1; i < nums.length; ++i) {

            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        Solution_1480 solution = new Solution_1480();

        int[] result = solution.runningSum(nums);

        for (int i : nums) {
            System.out.println(i);
        }
    }
}