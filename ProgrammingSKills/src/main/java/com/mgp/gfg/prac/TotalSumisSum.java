package com.mgp.gfg.prac;


public class TotalSumisSum {
    public static void main(String[] args) {
        int array[] = {9,9};
        perform2(array);
    }
    // incomplete in progress

    private static void perform2(int[] array) {
        int c = 1;
        int midResult[] = new int[array.length];
        int a9rray [] = new int[0];
        int sum;
        int val;

        for(int j = array.length -1; j>0;j--){
            sum = array[j]+ c;
            int v = sum%10;
            System.out.println("v value outside "+ v);
            if( v == 0) {
                c = 1;
                midResult[j]= v;
                System.out.println("in if midres" + midResult[j]);
            }
            else if(v > 0 ) {
                c = 1;
                midResult[j] = v;
                System.out.println("in else mid" + midResult[j]);

            }
            else {
                midResult= new int[array.length+1];
                midResult[0]=1;
                System.out.println("in else middres" + midResult[j]);

            }

        }
        for(Integer i  : midResult) {
            System.out.print(i + " ");
        }


    }





















    private static void perform(int[] array) {
        int carry = 1;
        int sum;
        boolean allNines = false;
        int finalArray[] = new int[0];
        int ninArry [] = new int [0];
        for(int j = array.length-1; j>0;j--){
            sum = array[j]+carry;
            if(sum == 10) {
                sum = sum%10;
                finalArray = new int[array.length];
                finalArray [j] = sum;
                System.out.println("FinalArray " +finalArray[j]);
            }
            else {
                ninArry = new int[array.length+1];
                ninArry[0] = 1;
                allNines = Boolean.TRUE;
                System.out.println("NinArray " +ninArry[j]);
            }

        }
        int traversalLength;
        if(allNines) {
            traversalLength = array.length+1;

        }else {
            traversalLength = array.length;
        }
        for(int i = 0 ; i <traversalLength; i++) {
            if(allNines)
            System.out.print( "Nin" + ninArry[i] + "," );
            else {
                System.out.print("Finl" + finalArray[i] + "," );
            }
        }
    }
}
