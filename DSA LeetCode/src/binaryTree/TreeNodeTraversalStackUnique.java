package binaryTree;

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNodeTraversalStackUnique {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtils.createTreeNodeNumber6();
        List<Integer> preList = preOrderReversal(treeNode);
        PrintUtils.printList(preList); // 0 1 3 4 2 5 6

        List<Integer> postList = postOrderReversal(treeNode);
        PrintUtils.printList(postList); // 3 4 1  5 6 2 0

        List<Integer> middleList = middleOrderReversal(treeNode);
        PrintUtils.printList(middleList); // 3 1 4 0 5 2 6


    }

    /**
     * the add order is root, left, right 中左右
     * @param treeNode
     * @return
     */
    public static List<Integer> preOrderReversal(TreeNode treeNode) {
        List<Integer> list = new ArrayList<>();
        if (treeNode == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if (temp != null) {
                if (temp.right != null) {
                    stack.push(temp.right);
                }
                if (temp.left != null) {
                    stack.push(temp.left);
                }
                stack.push(temp);
                stack.push(null);
            } else {
                temp = stack.pop();
                list.add(temp.val);
            }

        }
        return list;
    }

    /**
     * the add order is left, right, root 左右中
     * can go to root, right, left, then reverse 中右左
     * @param treeNode
     * @return
     */
    public static List<Integer> postOrderReversal(TreeNode treeNode) {
        List<Integer> list = new ArrayList<>();
        if (treeNode == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if (temp != null) {
                stack.push(temp);
                stack.push(null);
                if (temp.right != null) {
                    stack.push(temp.right);
                }
                if (temp.left != null) {
                    stack.push(temp.left);
                }

            } else {
                temp = stack.pop();
                list.add(temp.val);
            }

        }
        return list;
    }
    /**
     * the add order is left, root, right 左中右
     * @param treeNode
     * @return
     */
    public static List<Integer> middleOrderReversal(TreeNode treeNode) {
        List<Integer> list = new ArrayList<>();
        if (treeNode == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if (temp != null) {
                if (temp.right != null) {
                    stack.push(temp.right);
                }
                stack.push(temp);
                stack.push(null);
                if (temp.left != null) {
                    stack.push(temp.left);
                }

            } else {
                temp = stack.pop();
                list.add(temp.val);
            }

        }
        return list;
    }
}
