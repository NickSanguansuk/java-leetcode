package medium.solution_1448;

// 1448. Count Good Nodes in Binary Tree

import utilities.treenode.BinaryTreeCreator;
import utilities.treenode.TreeNode;

public class Solution_1448 {

    public int goodNodes(TreeNode root) {
        //int parentVal = root.val;
        //int leftCount = goodNodes(root.left, parentVal);
        //int rightCount = goodNodes(root.right, parentVal);
        //return leftCount + rightCount + 1;

        return goodNodes(root, root.val);
    }

    public int goodNodes(TreeNode node, int maxParentVal) {
        if (node == null) {
            return 0;
        }
        int maxVal = maxParentVal;
        if (node.val > maxVal) {
            maxVal = node.val;
        }
        //int sum = 0;
        //sum += goodNodes(node.left, maxVal);
        //sum += goodNodes(node.right, maxVal);
        //if (node.val >= maxParentVal) {
        //    sum++;
        //}
        //return sum;
        return (node.val >= maxParentVal ? 1 : 0) + goodNodes(node.left, maxVal) + goodNodes(node.right, maxVal);
    }

    public static void main(String[] args) {
        Solution_1448 solution = new Solution_1448();

        TreeNode root = new TreeNode(3);

        TreeNode node1 = new TreeNode(1);
        root.left = node1;
        TreeNode node2 = new TreeNode(4);
        root.right = node2;

        TreeNode node3 = new TreeNode(3);
        node1.left = node3;
        TreeNode node4 = new TreeNode(1);
        node2.left = node4;
        TreeNode node5 = new TreeNode(5);
        node2.right = node5;

        System.out.println(solution.goodNodes(root));

        // ----------
        System.out.println("----------");

        BinaryTreeCreator creator = new BinaryTreeCreator();

        Integer[] arr1 = {3, 1, 4, 3, null, 1, 5};
        TreeNode tree1 = creator.createBinaryTreeFromArray(arr1);
        System.out.println(solution.goodNodes(tree1));

        Integer[] arr2 = {3, 3, null, 4, 2, null, null};
        TreeNode tree2 = creator.createBinaryTreeFromArray(arr2);
        System.out.println(solution.goodNodes(tree2));

        Integer[] arr3 = {1};
        TreeNode tree3 = creator.createBinaryTreeFromArray(arr3);
        System.out.println(solution.goodNodes(tree3));
    }
}
