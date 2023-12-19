package com.mgp.pjava8p.funcint;

import java.util.Arrays;

public class LambdaCommaSeparatedListofStrings {

    static String transformValues(int[] numbers){
        String[] resString = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[] :: new);
        return String.join(",",resString);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
// Call the answer code.
        String result = LambdaCommaSeparatedListofStrings.transformValues(numbers);
        System.out.println(result);
    }
}
