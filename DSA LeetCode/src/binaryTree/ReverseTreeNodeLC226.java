package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseTreeNodeLC226 {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtils.createTreeNodeNumber6();
        LevelTraversalLC102.levelTraversal(treeNode);
        System.out.println("use recursive to reverse");
        treeNode = reverseTreeNode(treeNode);
        LevelTraversalLC102.levelTraversal(treeNode);
        System.out.println("use queue to reverse back");
        treeNode = reverseTreenodeQueue(treeNode);
        LevelTraversalLC102.levelTraversal(treeNode);
    }

    public static TreeNode reverseTreeNode(TreeNode treeNode) {
        if (treeNode != null) {

            reverseTreeNode(treeNode.left);
            reverseTreeNode(treeNode.right);
            swapPair(treeNode);
        }
        return treeNode;
    }

    public static TreeNode swapPair(TreeNode treeNode) {
        TreeNode temp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = temp;
        return temp;
    }

    public static TreeNode reverseTreenodeQueue(TreeNode treeNode) {
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(treeNode);

        while (!que.isEmpty()) {
            int size = que.size();
            while (size > 0) {
                size--;
                TreeNode temp = que.poll();
                if (temp.left != null) que.add(temp.left);
                if (temp.right != null) que.add(temp.right);
                swapPair(temp);
            }
        }
        return treeNode;
    }


}
