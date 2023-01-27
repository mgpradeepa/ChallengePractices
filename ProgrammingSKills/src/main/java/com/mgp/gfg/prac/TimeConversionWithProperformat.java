package com.mgp.gfg.prac;

public class TimeConversionWithProperformat {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
    }

    public static String timeConversion(String s) {
        // Write your code here

        // Split the String  with :
        // read the lastIndexx of size  and size -1
        // If the LI -1 read P and first split is = 12 then make nothing and if its less than 12 mark it as + 12

        // if the LI -1 read A then make it noting oter than for 12

        String[] timesplit = s.split(":");
        String sec = timesplit[2];

        String hr = timesplit[0];
        String min = timesplit[1];

        int neh = Integer.parseInt(hr);
        if(sec.contains("P")) {

            if (neh < 12 ) {
                hr = String.valueOf(neh + 12);

            }
        }
        if(sec.contains("A")) {

            if (neh == 12) {
                hr = "00";
            }
        }

        String resultString = hr + ":" +min + ":" + sec.substring(0,2);
        return resultString;



    }
}
