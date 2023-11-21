package binaryTree;

public class TreeNodeUtils {

    public static TreeNode createTreeNodeNumber6() {
        /**
         * treeNode structure
         *           0
         *      1         2
         *   3     4    5    6
         */
        TreeNode treeNode = new TreeNode(0);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(5);
        treeNode.right.right = new TreeNode(6);

        return treeNode;
    }

    public static TreeNode createTreeNodeNotFull() {
        /**
         * treeNode structure
         *           0
         *      1         2
         *   3     4    5    6
         */
        TreeNode treeNode = new TreeNode(0);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(5);
        treeNode.right.right = new TreeNode(6);
        treeNode.left.right.left = new TreeNode(7);
        treeNode.right.right.left = new TreeNode(8);

        return treeNode;
    }
}
