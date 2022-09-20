package com.mgp.hackerrank.ISP.amazon_aug;

public class NewMirrorOfATree {

    public static void main(String... args ) {
        Ghant  node = null;

        Ghant noderight = new Ghant(node, null, 20);
        Ghant nodeLeft = new Ghant(null, null,100);
        node = new Ghant(nodeLeft, noderight, 1);
        Ghant tree  = getMirrorOfTree(node);

        System.out.println(tree.left + " " + tree.right + " " + tree.data);

    }

    private static Ghant getMirrorOfTree(Ghant root) {
        Ghant temp = root;
        if(root == null ){
            return root;

        }
        Ghant left = getMirrorOfTree(temp.left);
        Ghant right = getMirrorOfTree (temp.right);

        root.left = right;
        root.right = left;

        return root;
    }
}

class Ghant {
    Ghant left;
    Ghant right;
    int data;
    Ghant(Ghant left, Ghant right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;

    }
}