package com.mgp.gfg.prac;

public class RemoveCharsInaAnotherString {
    // solution incomplete yet
    public static void main(String[] args) {
        String s1 = "main";
        String s2 = "ai";
        // expecctd op = mn

        System.out.println(removeChars(s1,s2));
    }

    private static String removeChars(String s1, String s2) {

        char s2c [] =  s2.toCharArray();
        char s1c [] =  s1.toCharArray();
        char res[] = new char[s1c.length];
        int index[] = new int[s1c.length];
        for(int i = 0 ; i < s2c.length; i++  ) {
            for(int j = 0,k =0 ; j < s1c.length; j++) {
                if(s2c[i] == s1c[j]) {
                    index[k++] = j;
                }
            }
        }
//        for(int k = 0 ; k < s1c.length; k++) {
//            if(k == index[k])
//        }
        return String.valueOf(res);

    }

}
