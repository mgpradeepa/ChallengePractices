package com.mgp.gfg.prac.gts;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaxRoomBooking {
    public static void main(String[] args) {
//        String[] roomBooks = {"+1A", "+2F", "+3C", "-2F", "-1A", "+2F"};
//        int totalBookings = 6;

        // usaecase2
        String[] roomBooks = {"+1A", "+2F", "+3C", "-2F", "-1A"};
        int totalBookings = 5;

        System.out.println(findMaxBooked(totalBookings,roomBooks));

    }

    private static String findMaxBooked(int N, String[] rooms) {
        //code here
        // iterate char 0 1 2 should be obtained
        // char[2 ] -> room
        // char[01] -> number to operate on
        // char [12] -> key value in integer of map with operations value
        //
        // iterate over the map key and value and which is max get its key

        Map<String, Integer> roomBookings = new HashMap<String, Integer>();
        for(String each : rooms) {
            String rum = each.substring(1,3);
            int bookOrFree =  Integer.parseInt(each.substring(1,2));
            int value =  roomBookings.get(rum) != null ?  roomBookings.get(rum) : 0 ;
            if(each.startsWith("+")) {
                roomBookings.put(rum,value+1);
            }
        }
        int highest = 0;
        int oldH = 0;
        String res = null;
        Map<String, Integer> sortedMapInDescending = roomBookings.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(java.util.Map.Entry.comparingByValue()))
                .collect(java.util.stream.Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),
                        (entry1, entry2) -> entry2, LinkedHashMap::new));

        int i = 0;
        for(Map.Entry<String, Integer> entrySeT : sortedMapInDescending.entrySet()) {
            if( i > 0 ){
                break;
            }
            res = entrySeT.getKey();
            i++;

        }
        return res;
    }
}
