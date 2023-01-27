package com.mgp.gfg.prac.gts.designs.decoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LengthDecoder {

    public static void main(String[] args) throws IOException {
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader read  = new BufferedReader(ip);

        int t = Integer.parseInt(read.readLine());
        while( t-- > 0) {
            String s = read.readLine();
            int queries = Integer.parseInt(read.readLine());
            RunLengthDecoder obj = new RunLengthDecoder(s);

            for(int i = 0 ; i < queries; i++) {
                String x = read.readLine();
                if(x.equals("next")) {
                    System.out.println(obj.next());

                }
                if(x.equals("hasNext")) {
                    if(obj.hasNext()) {
                        System.out.println("true");
                    }
                    else {
                        System.out.println("false");
                    }
                }
            }
        }
    }
}