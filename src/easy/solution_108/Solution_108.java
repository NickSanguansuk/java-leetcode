package easy.solution_108;

// 108. Convert Sorted Array to Binary Search Tree

import easy.treenode.TreeNode;

import java.util.Arrays;

public class Solution_108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int len = nums.length;
        int index = len / 2;
        int[] leftArray = Arrays.copyOfRange(nums, 0, index);
        int[] rightArray = Arrays.copyOfRange(nums, index + 1, len);
        return new TreeNode(nums[index], sortedArrayToBST(leftArray), sortedArrayToBST(rightArray));
    }

    public static void main(String[] args) {
        Solution_108 solution = new Solution_108();
        int[] nums = { -10, -3, 0, 5, 9 };
        TreeNode treeNode = solution.sortedArrayToBST(nums);
        System.out.println(treeNode);
    }
}
