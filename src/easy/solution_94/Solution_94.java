package easy.solution_94;

// 94. Binary Tree Inorder Traversal

import utilities.treenode.BinaryTreeCreator;
import utilities.treenode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        return inorderTraversalHelper(root, result);
    }

    private List<Integer> inorderTraversalHelper(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return ans;
        }

        inorderTraversalHelper(root.left, ans);
        ans.add(root.val);
        inorderTraversalHelper(root.right, ans);

        return ans;
    }

    public static void main(String[] args) {
        Solution_94 solution = new Solution_94();
        BinaryTreeCreator creator = new BinaryTreeCreator();

        // [1, 3, 2]
        Integer[] arr1 = {1, null, 2, null, null, 3, null};
        TreeNode tree1 = creator.createBinaryTreeFromArray(arr1);
        System.out.println(solution.inorderTraversal(tree1));

        // []
        Integer[] arr2 = {};
        TreeNode tree2 = creator.createBinaryTreeFromArray(arr2);
        System.out.println(solution.inorderTraversal(tree2));

        // [1]
        Integer[] arr3 = {1};
        TreeNode tree3 = creator.createBinaryTreeFromArray(arr3);
        System.out.println(solution.inorderTraversal(tree3));
    }
}
