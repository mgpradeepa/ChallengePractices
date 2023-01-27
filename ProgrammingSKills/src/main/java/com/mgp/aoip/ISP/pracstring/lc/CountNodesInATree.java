package com.mgp.aoip.ISP.pracstring.lc;

import com.mgp.generals.TreeNode;

public class CountNodesInATree {
    private static int countTreeNodes(TreeNode root) {
        if(root == null )return 0;
        return 1+ countTreeNodes(root.getLeft()) +  countTreeNodes(root.getRight());
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode res = new TreeNode(100, left, right);
        System.out.println(countTreeNodes(root));

    }

}
