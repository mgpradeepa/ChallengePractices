package com.mgp.gfg.prac.gts;

public class MaxRoomBookedHotel {
    public static void main(String[] args) {
        int totalBookings  = 13;
        String[] roomBooks ={"+5T", "+2C", "+4V", "+5P", "+0X", "-5P", "+1E", "+2O", "+6H", "+7J", "-5T", "-7J", "-4V"};
        System.out.println(findMaxBooked(totalBookings,roomBooks));
    }

    private static String findMaxBooked(int totalBookings, String[] floors) {
        //code here
        //*** approach
        /*
         *1. create array of alphabets * digits 10  * 26 = 260 items array
         * 2. if starts with - no booking just continue
         * 3. find the position in the array to add the booking -1 to get correct index
         * 4. evaluate the max on the go with the current room
         * 5.
         *
         *
         */
        int[] map = new int[260];
        int max = 0;
        String currentMax  = floors[0];
        for(int i = 0 ; i < floors.length; i++){

            String currentRoom = floors[i];
            if(currentRoom.charAt(0) == '-') continue;

            int intpart = (1+ currentRoom.charAt(1) - '0');
            int stringpart = (1 + currentRoom.charAt(2) - 'A');
            System.out.println(intpart + "--> int");
            System.out.println(stringpart + "--> string ");
            int idx =   intpart * stringpart -1;
            System.out.println(idx);
            map[idx]++;

            if(map[idx]  > max) {
                max = map[idx];
                currentMax = currentRoom;

            }
            else if(map[idx] == max ) {
                currentMax = currentMax.compareTo(currentRoom) < 0 ? currentMax : currentRoom;
            }

        }
        return currentMax.substring(1);

    }
}
