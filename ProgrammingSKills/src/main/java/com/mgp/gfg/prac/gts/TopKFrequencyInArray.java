package com.mgp.gfg.prac.gts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Input:
 * nums = {1,1,2,2,3,3,3,4},
 * k = 2
 * Output: {3, 2}
 * Explanation: Elements 1 and 2 have the
 * same frequency ie. 2. Therefore, in this
 * case, the answer includes the element 2
 * as 2 > 1.
 */
public class TopKFrequencyInArray {
    public static void main(String[] args) {
        int nums [] = {1,1,2,2,3,3,3,4};
        int k =2;
        int res [] = topK(nums,k);
        Arrays.stream(res).forEach(System.out::println);

    }
    private static int[] topK(int[] nums, int k) {
        // Code here

        Map<Integer, Integer> hashFrequency = new HashMap<Integer, Integer>();
        // store the frequency of each num in hF
        // key -- num value -- freq

        int numSize = nums.length;
        for (int i =0;i< numSize;i++) {
            hashFrequency.put(nums[i],hashFrequency.getOrDefault(nums[i], 0) + 1);

        }

        // use List aproach and try todo the comparision o Collections.sort
        //   List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hashFrequency.entrySet());

        //   Collections.sort(list,
        //   new Comparator<Map.Entry<Integer,Integer>>() {
        //       public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer,Integer> m2) {
        //           if(m1.getValue() == m2.getValue()) return m2.getKey() - m1.getKey();
        //           else return m2.getValue() - m1.getValue();
        //       }
        //   }
        //   );

        // List<Map.Entry<Integer, Integer> > list
        //     = new ArrayList<Map.Entry<Integer,
        //                               Integer> >(
        //         hashFrequency.entrySet());

        // // Sort the list
        // Collections.sort(
        //     list,
        //     new Comparator<Map.Entry<Integer,
        //                              Integer> >()
        //   {
        //         public int compare(
        //             Map.Entry<Integer, Integer> o1,
        //             Map.Entry<Integer, Integer> o2)
        //         {
        //             if (o1.getValue() == o2.getValue())
        //                 return o2.getKey() - o1.getKey();
        //             else
        //                 return o2.getValue()
        //                     - o1.getValue();
        //         }
        //     });

// effiecient way and works for even a larger input
        PriorityQueue<Map.Entry<Integer,
                Integer>> queue
                = new PriorityQueue<>(
                (a, b)
                        -> a.getValue().equals(b.getValue())
                        ? Integer.compare(b.getKey(),
                        a.getKey())
                        : Integer.compare(b.getValue(),
                        a.getValue()));

        // Insert the data from the map
        // to the Priority Queue.
        for (Map.Entry<Integer, Integer> entry :
                hashFrequency.entrySet())
            queue.offer(entry);

        int freqRes[]  = new int[k];
        // Arrays.sort(freq);
        for(int j = 0; j <k ; j++)
        {
            // freqRes[j] = list.get(j).getKey();
            freqRes[j] =  queue.poll().getKey();

        }
        return freqRes;
    }


}
