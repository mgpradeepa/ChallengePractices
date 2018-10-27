package com.mgp.codility.af;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by mgpradeepa on 20/10/18.
 */
public class ParticleIStable {

    public static void main(String[] args) {
        ParticleIStable particleIStable = new ParticleIStable();
        int A [] = {-1,1,3,3,3,2,3,2,1,0};
//        int A [] = {1,3,6};
        System.out.println(particleIStable.solution(A));


    }
    public int solution(int[] A) {
        // write your code in Java SE 8
        int totalPairs = 0;

        // check for the numbers and min condition

        // traverse the array till length -3


        for(int i = 0 ; i < A.length-2; i++ ){
            int mincount3 = 1;
            int diffOf = A[i+1] - A[i];
            //System.out.println("@ i  -> "+A [i] + " " + A[i+1]);
            mincount3++;
            for(int j  = i+1; j< A.length-1; j++) {
               // System.out.println("@j -> "+A[j] + " " + A[j+1]);
                if(diffOf == A[j+1]- A[j]) {
                    mincount3++;
                   // System.out.println(mincount3);
                }else {
                    break;
                }
                if(mincount3 >=3)totalPairs++;
            }
        }



        return totalPairs >= 1000000000 ? -1 : totalPairs;
    }
}
