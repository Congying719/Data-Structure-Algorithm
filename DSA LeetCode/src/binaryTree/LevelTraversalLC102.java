package binaryTree;

import utils.PrintUtils;

import java.util.*;

public class LevelTraversalLC102 {

    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtils.createTreeNodeNotFull();
        levelTraversal(treeNode);

        levelReversal(treeNode,0);
        for (int i = 0; i < res.size();i++) {
            for(int j = 0; j < res.get(i).size();j++) {
                System.out.print(res.get(i).get(j) +" ");
            }
            System.out.println();
        }

    }

    public static void levelTraversal(TreeNode treeNode) {
        List<String> list = new ArrayList<>();

        Queue<TreeNode> que = new LinkedList<>();
        que.offer(treeNode);
        while (!que.isEmpty()) {
            String s = "";
            int len = que.size();
            while(len > 0) {
                TreeNode temp = que.poll();
                if (temp.left != null) {
                    que.offer(temp.left);
                }
                if (temp.right != null) {
                    que.offer(temp.right);
                }
                s += String.valueOf(temp.val + " ");
                len--;
            }
            list.add(s);
        }
        PrintUtils.printListString(list);
    }

    public static void levelReversal(TreeNode treeNode, int deep) {
        if (treeNode == null) return;

        deep++;
        if (res.size() < deep) {
            List<Integer> list = new ArrayList<>();
            res.add(list);
        }
        res.get(deep-1).add(treeNode.val);
        if (treeNode.left != null) levelReversal(treeNode.left,deep);
        if (treeNode.right != null) levelReversal(treeNode.right,deep);

    }


}
