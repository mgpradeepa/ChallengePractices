package com.mgp.aoip.ISP.pracstring.lc;

public class LexicograficalColumnarDeletionToMakeStringsorted {

    // ["abc", "bce", "cae"] -> "abc" , "bca", "cee" => (bca) is not in lexicografical order.
    // so delete that column and return the number of such columns deleted.
    // in above case its 1
    // constraint: all the strings are of same size

    private static int deleteColumnsInStringForLexi(String[] strs) {
        //Approach:
        // iterate over the number of chars
        // compare char column wise in further iteration
        // increment the counter
        // break out when the criteria and go to next string search

        int count = 0;

        for(int i = 0 ; i < strs[0].length(); i++) {
            for(int j = 1; j < strs.length; j++ ) {
                if(strs[j-1].charAt(i) > strs[j].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        String[] input = {"abc", "bce", "cae"};
        String [] input = {"a","b"};
//        String[] input = {"zyx","wvu","tsr"};
        System.out.println(deleteColumnsInStringForLexi(input));
    }
}
