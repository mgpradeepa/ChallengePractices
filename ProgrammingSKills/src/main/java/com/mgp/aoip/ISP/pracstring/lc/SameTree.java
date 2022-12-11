package com.mgp.aoip.ISP.pracstring.lc;

import com.mgp.generals.TreeNode;

public class SameTree {
    // Two trees are said to be same if they are identical in shape and also their corresponding nodes have same value
    /*
     *       1                         1
     *     /   \    isSameAs         /   \
     *    2     1                  2      1
     *      1                       1
     *    /   \    isNotSameAs     /   \
     *   1     2                  2      1
     *
    */

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null ) {
            return true;
        }
        else if(p == null || q == null) {
            return false;
        }
        if(p.getVal() != q.getVal()) {
            return false;
        }

        return (isSameTree(p.getLeft(), q.getLeft()) && isSameTree(p.getRight(), q.getRight()));

    }

    public static void main(String[] args) {
        TreeNode pl = new TreeNode(1);
        TreeNode pr = new TreeNode(1);
        TreeNode pn = new TreeNode(2,pl,pr);

        TreeNode ql = new TreeNode(1);
        TreeNode qr = new TreeNode(1);
        TreeNode qn = new TreeNode(2,ql,qr);

        System.out.println(isSameTree(pn,qn));





    }
}


