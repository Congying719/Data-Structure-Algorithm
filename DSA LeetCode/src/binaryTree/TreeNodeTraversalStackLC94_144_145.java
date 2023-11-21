package binaryTree;

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNodeTraversalStackLC94_144_145 {

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
            list.add(temp.val);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
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
            list.addFirst(temp.val);
            if (temp.left != null) {
                stack.push(temp.left);
            }
            if (temp.right != null) {
                stack.push(temp.right);
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
        TreeNode cur = treeNode;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }

}
