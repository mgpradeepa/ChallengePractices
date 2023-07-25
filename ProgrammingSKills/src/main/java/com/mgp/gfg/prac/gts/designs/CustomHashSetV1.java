package com.mgp.gfg.prac.gts.designs;

public class CustomHashSetV1 {

    boolean[] sarry;
    public CustomHashSetV1() {
        sarry = new boolean[1000000+1];

    }
    public void add(int key) {
        sarry[key] = true;

    }
    public void remove(int key){
        sarry[key] = false;

    }
    public boolean containsKey(int key) {
        return sarry[key];

    }

    public static void main(String[] args) {
        CustomHashSetV1 hashset = new CustomHashSetV1();
        hashset.add(1);;
        hashset.add(2);;
        System.out.println("contains 3 "+ hashset.containsKey(3));
        hashset.remove(2);;
        System.out.println("contains 1 "+ hashset.containsKey(1));

    }
}
