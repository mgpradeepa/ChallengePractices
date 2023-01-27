package com.mgp.aoip.ISP.pracstring.lc;

public class AddBinaryNumbersInString {

    private static String addBinaryNumbers(String a, String b) {
        Integer an = Integer.getInteger(a,2);
        Integer bn = Integer.getInteger(b,2);
        String sum = Integer.toBinaryString(an+bn);
        System.out.println(sum);
        return sum;


    }

    public static void main(String[] args) {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(addBinaryNumbers(a,b));
    }
}
