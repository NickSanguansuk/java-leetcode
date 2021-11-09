package easy.solution_27;

// 27. Remove Element

public class Solution_27 {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution_27 solution = new Solution_27();
        int[] nums = {3, 2, 2, 3};
        System.out.println(solution.removeElement(nums, 2)); // Print out: 2
    }
}
