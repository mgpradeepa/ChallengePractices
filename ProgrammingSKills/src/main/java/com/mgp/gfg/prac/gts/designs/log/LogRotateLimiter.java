package com.mgp.gfg.prac.gts.designs.log;

import java.util.HashMap;
import java.util.Map;

public class LogRotateLimiter {

    // if the same log message gets printed in less than 10 seconds, that need not be considered to be printed


    private final Map<String , Integer> logHash ;
    public LogRotateLimiter() {
        logHash = new HashMap<>();
    }

    public  boolean isPrintable(int timeStamp, String message) {
        Integer previousTime = logHash.get(message) ;
        if(previousTime == null   || (timeStamp - previousTime >= 10)) {
            logHash.put(message,timeStamp);
            return true;

        }
        return false;
    }
}
class LRLApp {
    public static void main(String[] args) {

        LogRotateLimiter logRotateLimiter = new LogRotateLimiter();
        System.out.println(logRotateLimiter.isPrintable(1, "hello"));
        System.out.println(logRotateLimiter.isPrintable(2, "namaste"));
        System.out.println(logRotateLimiter.isPrintable(3, "java"));
        System.out.println(logRotateLimiter.isPrintable(1, "hello"));
        System.out.println(logRotateLimiter.isPrintable(2, "vanakkam"));

    }

}
