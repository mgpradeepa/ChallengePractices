package com.mgp.aoip.ISP.pracstring.lc;

import com.mgp.generals.TreeNode;

public class SymmetricTree {
    // check whether the given Tree is symmetric
    public static void main(String... args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node1l = new TreeNode(2);
        TreeNode node1r = new TreeNode(2);
        TreeNode root = new TreeNode(1, node1l, node1r);

        System.out.println( "Issymmetric " + isymmetric(root));
    }

    private static boolean isymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    private static boolean isMirror(TreeNode node1, TreeNode node2) {
        if(node1== null && node2 == null) return true;

        if((node1 != null && node2 != null) &&(node1.getVal() ==node2.getVal())) {
            return isMirror(node1.getLeft(), node2.getRight())&& isMirror(node1.getRight(), node2.getLeft());
        }
        return false;
    }
}
