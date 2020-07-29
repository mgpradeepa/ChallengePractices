package com.mgp.hackerrank.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class FrequencyQueries {
    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> num_FreqMap = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for(List<Integer> queryList : queries) {
           int  decider = queryList.get(0);
            int value = queryList.get(1);
            switch(decider){
                case 1: if(num_FreqMap.get(value) == null)
                         num_FreqMap.put(value, 1);
                        else
                    num_FreqMap.put(value, (num_FreqMap.get(value) +1));
                    break;

                case 2:
                    if(num_FreqMap.get(value) == null) continue;
                    else if(num_FreqMap.get(value) >= 2)
                          num_FreqMap.put(value, (num_FreqMap.get(value) -1));
                    else  num_FreqMap.remove(value);
                    break;

                case 3: if(num_FreqMap.containsValue(value) )
                    resultList.add(1);
                    else resultList.add(0);
                    break;
                    default: break;

                }
            }
    return resultList;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);
        ans.forEach(System.out::println);

//        bufferedWriter.write(
//                ans.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }

}
