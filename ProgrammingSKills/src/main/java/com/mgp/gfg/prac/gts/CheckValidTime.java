package com.mgp.gfg.prac.gts;

public class CheckValidTime {
    public static void main(String[] args) {
//        String input = "1?:4?";
//        String input = "2?:4?";
        String input = "?2:?5";
//        String input = "?9:?5";
        // replace the '?' such that maximum time is created out of it.
        // example 1?:4? => 12:49
        // example ?9:?3
        //?3 : 24
        System.out.println(printValidTime(input));

    }

    private static String printValidTime(String inputTime) {
        String resultTime = "";
        String[] hourMin = inputTime.split(":");
        String hour = hourMin[0];
        String min = hourMin[1];

        char[]h = hour.toCharArray();
        char[]m = min.toCharArray();

        char[] nh = new char[2];
        char[]nm = new char[2];
        System.out.println("h => " + h[0] + " -- "+ h[1]);
        System.out.println("m => " + m[0] + " -- "+ m[1]);

        if(h[0] == '?' && (h[1] == '3' || h[1] == '2' || h[1] == '1' || h[1] == '0' ) ) {
            nh[0]  = '2';
            nh[1] = h[1];
        }
        else if(h[0] == '?' && (h[1] == '4' || h[1] == '5' || h[1] == '6' || h[1] == '7' || h[1] == '8' || h[1] == '9' )){
            nh[0] = '1';
            nh[1] = h[1];
        }

        if(h[0] == '2' && h[1] == '?'  ) {
            nh[1]  = '3';
            nh[0] = h[0];
        }
        else if(h[0] == '1' && h[1] == '?'  ) {
            nh[1] = '9';
            nh[0] = h[0];
        }

        String nhs = String.valueOf(nh);
        System.out.println("hour part = " + nhs);


        if(m[0] == '?') {
            nm[0] = '5';
            nm[1] = m[1];
        }
        else if(m[1] == '?') {
            nm[1] = '9';
            nm[0] = m[0];
        }

        String nms = String.valueOf(nm);
        System.out.println("minute part " + nms);

        resultTime = nhs + nms;
        return resultTime;

    }
}
