package utilities.treenode;

public class BinaryTreeCreator {

    // Methods
    public TreeNode createBinaryTreeFromArray(Integer[] arr) {

        return createBinaryTreeFromArrayHelper(arr, 0);
    }

    private TreeNode createBinaryTreeFromArrayHelper(Integer[] arr, int index) {
        TreeNode root = null;

        if ((index < arr.length) && (arr[index] != null)) {
            root = new TreeNode(arr[index]);
            root.left = createBinaryTreeFromArrayHelper(arr,(index * 2) + 1);
            root.right = createBinaryTreeFromArrayHelper(arr, (index * 2) + 2);
        }

        return root;
    }
}
