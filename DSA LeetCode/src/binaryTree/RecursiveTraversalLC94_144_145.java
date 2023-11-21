package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class RecursiveTraversalLC94_144_145 {


    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtils.createTreeNodeNumber6();
        List<Integer> PreList = preTraversal(treeNode);
        for (int i = 0;i < PreList.size();i++) {
            System.out.print(PreList.get(i) + " "); // 0 1 3 4 2 5 6
        }
        System.out.println();

        List<Integer> middleList = new ArrayList<>();
        /**
         * test not pass, need to check later
         */
        middleOrderTraversal(treeNode,middleList);
        for (int i = 0;i < middleList.size();i++) {
            System.out.print(middleList.get(i) + " "); // 3 1 4 0 5 2 6
        }
        System.out.println();

        List<Integer> postList = new ArrayList<>();
        postOrderTraversal(treeNode,postList);
        for (int i = 0;i < postList.size();i++) {
            System.out.print(postList.get(i) + " "); // 3 4 1  5 6 2 0
        }
        System.out.println();

    }
    public static List<Integer> preTraversal(TreeNode treeNode) {
        List<Integer> list = new ArrayList<>();
        traversal(treeNode,list);
        return list;
    }

    public static void traversal(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) {
            return;
        }
        list.add(treeNode.val);
        traversal(treeNode.left,list);
        traversal(treeNode.right,list);
    }

    public static void postOrderTraversal(TreeNode treeNode, List<Integer> list) {

        if (treeNode == null) {
            return;
        }
        postOrderTraversal(treeNode.left,list);
        postOrderTraversal(treeNode.right,list);
        list.add(treeNode.val);
    }


    public static void middleOrderTraversal(TreeNode treeNode, List<Integer> list) {

        if (treeNode == null) {
            return;
        }
        postOrderTraversal(treeNode.left,list);
        list.add(treeNode.val);
        postOrderTraversal(treeNode.right,list);

    }
}
